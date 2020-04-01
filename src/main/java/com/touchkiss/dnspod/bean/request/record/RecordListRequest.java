package com.touchkiss.dnspod.bean.request.record;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.record.RecordListResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 16:24
 *
 * @author Touchkiss
 */
public class RecordListRequest extends BaseRequest<RecordListResponse> {
    /**
     *  或 domain, 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     *  记录开始的偏移，第一条记录为 0，依次类推，可选（仅当指定 length 参数时才生效）
     */
    private int offset;
    /**
     *  共要获取的记录数量的最大值，比如最多获取20条，则为20，最大3000.可选
     */
    private int length;
    /**
     *  子域名，如果指定则只返回此子域名的记录，可选
     */
    private String sub_domain;
    /**
     *  记录类型，通过API记录类型获得，大写英文，比如：A，可选
     */
    private String record_type;
    /**
     *  记录线路，通过API记录线路获得，中文，比如：默认，可选
     */
    private String record_line;
    /**
     *  线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’，可选 【需要获取特定线路的解析记录时，record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     */
    private String record_line_id;
    /**
     * ，搜索的关键字，如果指定则只返回符合该关键字的记录，可选 【指定 keyword 后系统忽略查询参数 sub_domain，record_type，record_line，record_line_id】
     */
    private String keyword;

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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSub_domain() {
        return sub_domain;
    }

    public void setSub_domain(String sub_domain) {
        this.sub_domain = sub_domain;
    }

    public String getRecord_type() {
        return record_type;
    }

    public void setRecord_type(String record_type) {
        this.record_type = record_type;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<RecordListResponse> getResponseClass() {
        return RecordListResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.RECORD_LIST;
    }
}
