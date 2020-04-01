package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainUnlockResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:15
 *
 * @author Touchkiss
 */
public class DomainUnlockRequest extends BaseRequest<DomainUnlockResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 域名解锁码, 锁定的时候会返回
     */
    private String lock_code;

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

    public String getLock_code() {
        return lock_code;
    }

    public void setLock_code(String lock_code) {
        this.lock_code = lock_code;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainUnlockResponse> getResponseClass() {
        return DomainUnlockResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_UNLOCK;
    }
}
