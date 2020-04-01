package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomaingroupListResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:29
 *
 * @author Touchkiss
 */
public class DomaingroupListRequest extends BaseRequest<DomaingroupListResponse> {
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomaingroupListResponse> getResponseClass() {
        return DomaingroupListResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_GROUP_LIST;
    }
}
