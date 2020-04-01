package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainShareCreateResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 14:49
 *
 * @author Touchkiss
 */
public class DomainShareCreateRequest extends BaseRequest<DomainShareCreateResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 要共享到的邮箱
     */
    private String email;
    /**
     * 非必须
     * 共享模式，”r”、”rw” 分别代表只读和读取、修改, 默认为 r
     */
    private String mode;
    /**
     * 非必须
     * 子域名共享, 如：www、bbs等. 如果要共享整个域名, 则无需提交此参数
     */
    private String sub_domain;

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

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getSub_domain() {
        return sub_domain;
    }

    public void setSub_domain(String sub_domain) {
        this.sub_domain = sub_domain;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainShareCreateResponse> getResponseClass() {
        return DomainShareCreateResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_SHARE_CREATE;
    }
}
