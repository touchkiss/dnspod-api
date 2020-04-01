package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainCreateResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 13:42
 *
 * @author Touchkiss
 */
public class DomainCreateRequest extends BaseRequest<DomainCreateResponse> {
    private String domain;//必须，域名, 没有 www, 如 dnspod.com
    private String group_id;//可选参数,域名分组ID,
    private String is_mark;//可选参数,是否星标域名，”yes”、”no” 分别代表是和否

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
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
    public Class<DomainCreateResponse> getResponseClass() {
        return DomainCreateResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_CREATE;
    }
}
