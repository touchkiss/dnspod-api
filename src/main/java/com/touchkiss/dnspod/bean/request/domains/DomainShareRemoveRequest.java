package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainShareRemoveResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:03
 *
 * @author Touchkiss
 */
public class DomainShareRemoveRequest extends BaseRequest<DomainShareRemoveResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 被共享者的邮箱, 原来是什么就提交什么, 不能修改
     */
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainShareRemoveResponse> getResponseClass() {
        return DomainShareRemoveResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_SHARE_REMOVE;
    }
}
