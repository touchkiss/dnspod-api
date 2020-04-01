package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainRemarkResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:52
 *
 * @author Touchkiss
 */
public class DomainRemarkRequest extends BaseRequest<DomainRemarkResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String doamin;
    /**
     * 必须
     * 域名备注, 删除备注请提交空内容
     */
    private String remark;

    public int getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(int domain_id) {
        this.domain_id = domain_id;
    }

    public String getDoamin() {
        return doamin;
    }

    public void setDoamin(String doamin) {
        this.doamin = doamin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainRemarkResponse> getResponseClass() {
        return DomainRemarkResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_REMARK;
    }
}
