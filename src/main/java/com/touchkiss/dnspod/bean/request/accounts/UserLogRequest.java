package com.touchkiss.dnspod.bean.request.accounts;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.accounts.UserLogResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 13:14
 *
 * @author Touchkiss
 */
public class UserLogRequest extends BaseRequest<UserLogResponse> {
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<UserLogResponse> getResponseClass() {
        return UserLogResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.USER_LOG;
    }
}
