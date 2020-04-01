package com.touchkiss.dnspod.bean.request.accounts;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.accounts.UserDetailResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 10:45
 *
 * @author Touchkiss
 */
public class UserDetailRequest extends BaseRequest<UserDetailResponse> {
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<UserDetailResponse> getResponseClass() {
        return UserDetailResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.USER_DETAIL;
    }
}
