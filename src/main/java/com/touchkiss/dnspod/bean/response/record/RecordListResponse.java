package com.touchkiss.dnspod.bean.response.record;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 16:18
 *
 * @author Touchkiss
 */
public class RecordListResponse extends BaseResponse {

    /**
     * domain : {"id":"12600793","name":"example.com","punycode":"example.com","grade":"DP_Free","owner":"mailbox@example.com","ext_status":"dnserror","ttl":600,"dnspod_ns":["ns3.dnsv5.com","ns4.dnsv5.com"]}
     * info : {"sub_domains":"7","record_total":"4","records_num":"3"}
     * records : [{"id":"13608148","name":"www","line":"电信","line_id":"10=0","type":"A","ttl":"600","value":"1.10.0.3","weight":null,"mx":"0","enabled":"1","status":"enabled","monitor_status":"","remark":"","updated_on":"2018-06-11 10:12:51","use_aqb":"no"},{"id":"13608149","name":"www","line":"联通","line_id":"10=1","type":"A","ttl":"600","value":"1.10.1.3","weight":null,"mx":"0","enabled":"1","status":"enabled","monitor_status":"","remark":"","updated_on":"2018-06-11 10:13:11","use_aqb":"no"},{"id":"13608150","name":"www","line":"移动","line_id":"10=2","type":"A","ttl":"600","value":"1.10.2.3","weight":null,"mx":"0","enabled":"1","status":"enabled","monitor_status":"","remark":"","updated_on":"2018-06-11 10:14:15","use_aqb":"no"}]
     */

    private DomainBean domain;
    private InfoBean info;
    private List<RecordsBean> records;

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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public enum StatusCode {
        _6(6, "域名ID错误"),
        _7(7, "记录开始的偏移无效、非域名所有者"),
        _8(8, "共要获取的记录的数量无效、域名无效"),
        _13(13, "当前域名有误，请返回重新操作"),
        _27(27, "线路无效");
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
         * id : 12600793
         * name : example.com
         * punycode : example.com
         * grade : DP_Free
         * owner : mailbox@example.com
         * ext_status : dnserror
         * ttl : 600
         * dnspod_ns : ["ns3.dnsv5.com","ns4.dnsv5.com"]
         */
        /**
         * 域名ID，即为 domain_id
         */
        private String id;
        /**
         * 域名
         */
        private String name;
        /**
         * punycode 转码之后的域名
         */
        private String punycode;
        /**
         * 域名等级，详见 Domain.List 或 Domain.Info 接口
         */
        private String grade;
        /**
         * 域名所有者
         */
        private String owner;
        private String ext_status;
        private int ttl;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPunycode() {
            return punycode;
        }

        public void setPunycode(String punycode) {
            this.punycode = punycode;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getExt_status() {
            return ext_status;
        }

        public void setExt_status(String ext_status) {
            this.ext_status = ext_status;
        }

        public int getTtl() {
            return ttl;
        }

        public void setTtl(int ttl) {
            this.ttl = ttl;
        }

        public List<String> getDnspod_ns() {
            return dnspod_ns;
        }

        public void setDnspod_ns(List<String> dnspod_ns) {
            this.dnspod_ns = dnspod_ns;
        }
    }

    public static class InfoBean {
        /**
         * sub_domains : 7
         * record_total : 4
         * records_num : 3
         */
        /**
         * 指定域名下所有记录的总数
         */
        private String sub_domains;
        /**
         * 指定域名下符合查询条件的记录总数
         */
        private String record_total;
        /**
         * 返回的 records 列表里的记录数目
         */
        private String records_num;

        public String getSub_domains() {
            return sub_domains;
        }

        public void setSub_domains(String sub_domains) {
            this.sub_domains = sub_domains;
        }

        public String getRecord_total() {
            return record_total;
        }

        public void setRecord_total(String record_total) {
            this.record_total = record_total;
        }

        public String getRecords_num() {
            return records_num;
        }

        public void setRecords_num(String records_num) {
            this.records_num = records_num;
        }
    }

    public static class RecordsBean {
        /**
         * id : 13608148
         * name : www
         * line : 电信
         * line_id : 10=0
         * type : A
         * ttl : 600
         * value : 1.10.0.3
         * weight : null
         * mx : 0
         * enabled : 1
         * status : enabled
         * monitor_status :
         * remark :
         * updated_on : 2018-06-11 10:12:51
         * use_aqb : no
         */
        /**
         * 记录ID编号
         */
        private String id;
        /**
         * 子域名(主机记录)
         */
        private String name;
        /**
         * 解析记录的线路, 详见 Record.Line 接口
         */
        private String line;
        /**
         * 解析记录的线路ID，详见 Record.Line 接口
         */
        private String line_id;
        /**
         * 记录类型, 详见 Record.Type 接口
         */
        private String type;
        /**
         * 记录的 TTL 值
         */
        private String ttl;
        /**
         * 记录值
         */
        private String value;
        private Object weight;
        /**
         * 记录的 MX 记录值, 非 MX 记录类型，默认为 0
         */
        private String mx;
        /**
         * 记录状态
         * “0”: 禁用
         * “1”: 启用
         */
        private String enabled;
        /**
         * 系统内部标识状态, 开发者可忽略
         */
        private String status;
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
         * 是否开通网站安全中心
         * “yes”: 已经开启
         * “no”: 未开启
         */
        private String use_aqb;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getLine_id() {
            return line_id;
        }

        public void setLine_id(String line_id) {
            this.line_id = line_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTtl() {
            return ttl;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
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

        public String getEnabled() {
            return enabled;
        }

        public void setEnabled(String enabled) {
            this.enabled = enabled;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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

        public String getUse_aqb() {
            return use_aqb;
        }

        public void setUse_aqb(String use_aqb) {
            this.use_aqb = use_aqb;
        }
    }
}
