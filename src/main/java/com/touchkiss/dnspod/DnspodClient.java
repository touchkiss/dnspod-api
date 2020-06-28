package com.touchkiss.dnspod;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.BaseResponse;
import com.touchkiss.dnspod.utils.GsonUtil;
import com.touchkiss.dnspod.utils.HttpUtil;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/03/31 11:02
 *
 * @author Touchkiss
 */
public class DnspodClient implements BaseClient {
    private String login_token;// 用于鉴权的 API Token
    private String format;// {json,xml} 返回的数据格式，可选，默认为xml，建议用json
    private String lang;// {en,cn} 返回的错误语言，可选，默认为en，建议用cn
    private String error_on_empty;// {yes,no} 没有数据时是否返回错误，可选，默认为yes，建议用no
    private String user_id;// 用户的ID，可选，仅代理接口需要， 用户接口不需要提交此参数

    DnspodClient(String login_token, String format, String lang, String error_on_empty, String user_id) {
        this.login_token = login_token;
        this.format = format;
        this.lang = lang;
        this.error_on_empty = error_on_empty;
        this.user_id = user_id;
    }

    DnspodClient(String login_token, String format, String lang, String error_on_empty) {
        this.login_token = login_token;
        this.format = format;
        this.lang = lang;
        this.error_on_empty = error_on_empty;
    }

    DnspodClient(String login_token) {
        this.login_token = login_token;
        this.format = "json";
        this.lang = "cn";
        this.error_on_empty = "no";
    }

    public static DnspodClient getClient(String login_token) {
        return new DnspodClient(login_token);
    }

    public static DnspodClient getClient(String login_token, String format, String lang, String error_on_empty) {
        return new DnspodClient(login_token, format, lang, error_on_empty);
    }

    public static DnspodClient getClient(String login_token, String format, String lang, String error_on_empty, String user_id) {
        return new DnspodClient(login_token, format, lang, error_on_empty, user_id);
    }

    @Override
    public <T extends BaseResponse> T doAction(BaseRequest<T> request) throws IOException {
        return GsonUtil.fromJson(HttpUtil.post(request.getURLInfo().getUrl(), objectToMap(request)), request.getResponseClass());
    }

    @Override
    public <T extends BaseResponse> T doAction(BaseRequest<T> request, boolean autoRetry, int maxRetryCounts) {
        for (int i = 0; i < maxRetryCounts || !autoRetry; i++) {
            try {
                return GsonUtil.fromJson(HttpUtil.post(request.getURLInfo().getUrl(), objectToMap(request)), request.getResponseClass());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Map objectToMap(BaseRequest request) {
        Map<String, Object> result = new HashMap<>();
        field(this, result, this.getClass().getDeclaredFields());
        Object cast = request.getRequestClass().cast(request);
        field(cast, result, cast.getClass().getDeclaredFields());
        return result;
    }

    private void field(Object object, Map<String, Object> result, Field[] fields) {
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(object);
                if (value != null) {
                    String key = field.getName();
                    result.put(key, value.toString());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
