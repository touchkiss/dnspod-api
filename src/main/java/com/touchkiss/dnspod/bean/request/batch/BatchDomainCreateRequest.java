package com.touchkiss.dnspod.bean.request.batch;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.batch.BatchDomainCreateResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:00
 *
 * @author Touchkiss
 */
public class BatchDomainCreateRequest extends BaseRequest<BatchDomainCreateResponse> {
    /**
     * 多个域名之间以英文的逗号分割
     */
    private String domains;
    /**
     * 为每个域名添加 @ 和 www 的 A 记录值，记录值为IP，可选，如果不传此参数或者传空，将只添加域名，不添加记录
     */
    private String record_value ;

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }

    public String getRecord_value() {
        return record_value;
    }

    public void setRecord_value(String record_value) {
        this.record_value = record_value;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<BatchDomainCreateResponse> getResponseClass() {
        return BatchDomainCreateResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.BATCH_DOMAIN_CREATE;
    }
}
