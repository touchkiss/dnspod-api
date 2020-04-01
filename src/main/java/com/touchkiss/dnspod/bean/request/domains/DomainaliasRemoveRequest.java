package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainaliasRemoveResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:27
 *
 * @author Touchkiss
 */
public class DomainaliasRemoveRequest extends BaseRequest<DomainaliasRemoveResponse> {
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainaliasRemoveResponse> getResponseClass() {
        return DomainaliasRemoveResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_ALIAS_REMOVE;
    }
}
