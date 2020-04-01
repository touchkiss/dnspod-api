package com.touchkiss.dnspod.bean.request.record;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.record.RecordModifyResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 16:30
 *
 * @author Touchkiss
 */
public class RecordModifyRequest extends BaseRequest<RecordModifyResponse> {
    /**
     * 或 domain, 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 记录ID，必选
     */
    private int record_id;
    /**
     * 主机记录, 如 www，可选，如果不传，默认为 @
     */
    private String sub_domain;
    /**
     * 记录类型，通过API记录类型获得，大写英文，比如：A，必选
     */
    private String record_type;
    /**
     * 记录线路，通过API记录线路获得，中文，比如：默认，必选
     */
    private String record_line;
    /**
     * 线路的ID，通过API记录线路获得，英文字符串，比如：‘10=1’ 【record_line 和 record_line_id 二者传其一即可，系统优先取 record_line_id】
     */
    private String record_line_id;
    /**
     * 记录值, 如 IP:200.200.200.200, CNAME: cname.dnspod.com., MX: mail.dnspod.com.，必选
     */
    private String value;
    /**
     * {1-20} MX优先级, 当记录类型是 MX 时有效，范围1-20, mx记录必选
     */
    private int mx;
    /**
     * {1-604800} TTL，范围1-604800，不同等级域名最小值不同，可选
     */
    private int ttl;
    /**
     * [“enable”, “disable”]，记录状态，默认为”enable”，如果传入”disable”，解析不会生效，也不会验证负载均衡的限制，可选
     */
    private String status;
    /**
     * 权重信息，0到100的整数，可选。仅企业 VIP 域名可用，0 表示关闭，留空或者不传该参数，表示不设置权重信息
     */
    private int weight;

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

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<RecordModifyResponse> getResponseClass() {
        return RecordModifyResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.RECORD_MODIFY;
    }
}
