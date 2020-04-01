package com.touchkiss.dnspod.bean.request.batch;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.batch.BatchRecordModifyResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:12
 *
 * @author Touchkiss
 */
public class BatchRecordModifyRequest extends BaseRequest<BatchRecordModifyResponse> {
    /**
     * 记录的ID，多个 record_id 用英文的逗号分割
     */
    private String record_id;
    /**
     * 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个
     */
    private String change;
    /**
     * 修改为，具体依赖 change 字段，必填参数
     */
    private String change_to;
    /**
     * 要修改到的记录值，可选，仅当 change 字段为 “record_type” 时为必填参数
     */
    private String value;
    /**
     * MX记录优先级，可选，仅当修改为 MX 记录时为必填参数
     */
    private int mx;

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getChange_to() {
        return change_to;
    }

    public void setChange_to(String change_to) {
        this.change_to = change_to;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getMx() {
        return mx;
    }

    public void setMx(int mx) {
        this.mx = mx;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<BatchRecordModifyResponse> getResponseClass() {
        return BatchRecordModifyResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.BATCH_RECORD_MODIFY;
    }
}
