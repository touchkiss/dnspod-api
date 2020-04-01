package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainShareListResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 14:53
 *
 * @author Touchkiss
 */
public class DomainShareListRequest extends BaseRequest<DomainShareListResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
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
    public Class<DomainShareListResponse> getResponseClass() {
        return DomainShareListResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_SHARE_LIST;
    }
}
