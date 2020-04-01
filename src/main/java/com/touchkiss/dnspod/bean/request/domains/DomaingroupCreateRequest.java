package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomaingroupCreateResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:32
 *
 * @author Touchkiss
 */
public class DomaingroupCreateRequest extends BaseRequest<DomaingroupCreateResponse> {
    /**
     * 必须
     * 分组名称
     */
    private String group_name;

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomaingroupCreateResponse> getResponseClass() {
        return DomaingroupCreateResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_GROUP_CREATE;
    }
}
