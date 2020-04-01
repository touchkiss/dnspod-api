package com.touchkiss.dnspod.bean.request.record;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.record.RecordStatusResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 16:56
 *
 * @author Touchkiss
 */
public class RecordStatusRequest extends BaseRequest<RecordStatusResponse> {
    /**
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 记录ID
     */
    private int record_id;
    /**
     * 必须
     * {enable|disable} 新的状态，必选
     */
    private String status;

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

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<RecordStatusResponse> getResponseClass() {
        return RecordStatusResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.RECORD_STATUS;
    }
}
