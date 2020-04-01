package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainaliasCreateResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:24
 *
 * @author Touchkiss
 */
public class DomainaliasCreateRequest extends BaseRequest<DomainaliasCreateResponse> {
    /**
     * 必须
     * 要创建别名绑定的域名ID
     */
    private int domain_id;
    /**
     * 必须
     * 要绑定到的域名，不带 www，例如：dnspod.com
     */
    private String domain;

    public int getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(int domain_id) {
        this.domain_id = domain_id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainaliasCreateResponse> getResponseClass() {
        return DomainaliasCreateResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_ALIAS_CREATE;
    }
}
