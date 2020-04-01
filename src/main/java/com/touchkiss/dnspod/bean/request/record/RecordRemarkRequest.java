package com.touchkiss.dnspod.bean.request.record;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.record.RecordRemarkResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 16:44
 *
 * @author Touchkiss
 */
public class RecordRemarkRequest extends BaseRequest<RecordRemarkResponse> {
    /**
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    /**
     * 必须
     * 域名备注，删除备注请提交空内容，必选
     */
    private String domain;
    /**
     * 必须
     * 记录ID
     */
    private int record_id;
    private String remark;

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
    public Class<RecordRemarkResponse> getResponseClass() {
        return RecordRemarkResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.RECORD_REMARK;
    }
}
