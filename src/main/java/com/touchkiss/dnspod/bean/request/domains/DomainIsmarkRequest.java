package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainIsmarkResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:48
 *
 * @author Touchkiss
 */
public class DomainIsmarkRequest extends BaseRequest<DomainIsmarkResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 是否星标域名，”yes”、”no” 分别代表是和否
     */
    private String is_mark;

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

    public String getIs_mark() {
        return is_mark;
    }

    public void setIs_mark(String is_mark) {
        this.is_mark = is_mark;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainIsmarkResponse> getResponseClass() {
        return DomainIsmarkResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_ISMARK;
    }
}
