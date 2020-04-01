package com.touchkiss.dnspod.bean.request.record;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.record.RecordDdnsResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 16:40
 *
 * @author Touchkiss
 */
public class RecordDdnsRequest extends BaseRequest<RecordDdnsResponse> {
    /**
     * 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 记录ID，必选
     */
    private String record_id;
    /**
     * 主机记录，如 www
     */
    private String sub_domain;
    /**
     * 记录线路，通过API记录线路获得，中文，比如：默认，必选
     */
    private String record_line;
    /**
     * 线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’ 【record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     */
    private String record_line_id;
    /**
     * IP地址，例如：6.6.6.6，可选
     */
    private String value;

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

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    public String getSub_domain() {
        return sub_domain;
    }

    public void setSub_domain(String sub_domain) {
        this.sub_domain = sub_domain;
    }

    public String getRecord_line() {
        return record_line;
    }

    public void setRecord_line(String record_line) {
        this.record_line = record_line;
    }

    public String getRecord_line_id() {
        return record_line_id;
    }

    public void setRecord_line_id(String record_line_id) {
        this.record_line_id = record_line_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<RecordDdnsResponse> getResponseClass() {
        return RecordDdnsResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.RECORD_DDNS;
    }
}
