package com.touchkiss.dnspod.bean.response.record;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 16:46
 *
 * @author Touchkiss
 */
public class RecordInfoResponse extends BaseResponse {

    /**
     * domain : {"id":"9842292","domain":"yizerowu.com","domain_grade":"DP_Free","dnspod_ns":["ns3.dnsv3.com","ns4.dnsv3.com"]}
     * record : {"id":"44146112","sub_domain":"yizerowwwww","record_type":"A","record_line":"联通","record_line_id":"10=1","value":"12.3.3.3","weight":null,"mx":"0","ttl":"600","enabled":"1","monitor_status":"","remark":"","updated_on":"2016-08-12 17:07:05","domain_id":"9842292"}
     */

    private DomainBean domain;
    private RecordBean record;

    @Override
    public String statusDetail() {
        String msg = super.statusDetail();
        if (msg == null) {
            try {
                return StatusCode.valueOf("_" + getStatus().getCode().replace("-", "n")).getDetails();
            } catch (Exception e) {

            }
        }
        return null;
    }

    public DomainBean getDomain() {
        return domain;
    }

    public void setDomain(DomainBean domain) {
        this.domain = domain;
    }

    public RecordBean getRecord() {
        return record;
    }

    public void setRecord(RecordBean record) {
        this.record = record;
    }

    public enum StatusCode {
        _6(6, "域名ID错误"),
        _7(7, "记录开始的偏移无效、非域名所有者"),
        _8(8, "域名无效"),
        _13(13, "当前域名有误，请返回重新操作");
        private int code;
        private String details;

        StatusCode(int code, String details) {
            this.code = code;
            this.details = details;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }

    public static class DomainBean {
        /**
         * id : 9842292
         * domain : yizerowu.com
         * domain_grade : DP_Free
         * dnspod_ns : ["ns3.dnsv3.com","ns4.dnsv3.com"]
         */
        /**
         *  域名ID，即为 domain_id
         */
        private String id;
        /**
         * 域名
         */
        private String domain;
        /**
         * 域名等级，详见 Domain.List 或 Domain.Info 接口
         */
        private String domain_grade;
        /**
         * 域名等级对应的ns服务器地址
         */
        private List<String> dnspod_ns;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getDomain_grade() {
            return domain_grade;
        }

        public void setDomain_grade(String domain_grade) {
            this.domain_grade = domain_grade;
        }

        public List<String> getDnspod_ns() {
            return dnspod_ns;
        }

        public void setDnspod_ns(List<String> dnspod_ns) {
            this.dnspod_ns = dnspod_ns;
        }
    }

    public static class RecordBean {
        /**
         * id : 44146112
         * sub_domain : yizerowwwww
         * record_type : A
         * record_line : 联通
         * record_line_id : 10=1
         * value : 12.3.3.3
         * weight : null
         * mx : 0
         * ttl : 600
         * enabled : 1
         * monitor_status :
         * remark :
         * updated_on : 2016-08-12 17:07:05
         * domain_id : 9842292
         */
        /**
         * 记录ID编号
         */
        private String id;
        /**
         *  子域名(主机记录)
         */
        private String sub_domain;
        /**
         * 记录类型, 详见 Record.Type 接口
         */
        private String record_type;
        /**
         * 解析记录的线路, 详见 Record.Line 接口
         */
        private String record_line;
        /**
         * 解析记录的线路ID，详见 Record.Line 接口
         */
        private String record_line_id;
        /**
         * 记录值
         */
        private String value;
        private Object weight;
        private String mx;
        /**
         * 记录的 TTL 值
         */
        private String ttl;
        /**
         * 记录状态
         * “0”: 禁用
         * “1”: 启用
         */
        private String enabled;
        /**
         * 该记录的D监控状态
         * “Ok”: 服务器正常
         * “Warn”: 该记录有报警, 服务器返回 4XX
         * “Down”: 服务器宕机
         * “”: 该记录未开启D监控
         */
        private String monitor_status;
        /**
         * 记录备注
         */
        private String remark;
        /**
         * 记录最后更新时间
         */
        private String updated_on;
        /**
         * 域名ID, 即为 domain_id
         */
        private String domain_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public String getMx() {
            return mx;
        }

        public void setMx(String mx) {
            this.mx = mx;
        }

        public String getTtl() {
            return ttl;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
        }

        public String getEnabled() {
            return enabled;
        }

        public void setEnabled(String enabled) {
            this.enabled = enabled;
        }

        public String getMonitor_status() {
            return monitor_status;
        }

        public void setMonitor_status(String monitor_status) {
            this.monitor_status = monitor_status;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getUpdated_on() {
            return updated_on;
        }

        public void setUpdated_on(String updated_on) {
            this.updated_on = updated_on;
        }

        public String getDomain_id() {
            return domain_id;
        }

        public void setDomain_id(String domain_id) {
            this.domain_id = domain_id;
        }
    }
}
