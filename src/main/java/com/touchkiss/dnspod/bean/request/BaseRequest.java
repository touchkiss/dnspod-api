package com.touchkiss.dnspod.bean.request;

import com.touchkiss.dnspod.bean.response.BaseResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 9:45
 *
 * @author Touchkiss
 */
public abstract class BaseRequest<T extends BaseResponse> {
    public abstract Class getRequestClass();

    public abstract Class<T> getResponseClass();

    public abstract URLConstants getURLInfo();
}
