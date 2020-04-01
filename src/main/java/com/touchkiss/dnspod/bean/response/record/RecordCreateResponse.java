package com.touchkiss.dnspod.bean.response.record;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 16:11
 *
 * @author Touchkiss
 */
public class RecordCreateResponse extends BaseResponse {

    /**
     * record : {"id":"16894439","name":"@","status":"enable"}
     */

    private RecordBean record;

    public RecordBean getRecord() {
        return record;
    }

    public void setRecord(RecordBean record) {
        this.record = record;
    }

    public static class RecordBean {
        /**
         * id : 16894439
         * name : @
         * status : enable
         */
        /**
         * 记录ID, 即为 record_id
         */
        private String id;
        /**
         * 添加的字域名
         */
        private String name;
        /**
         * 域名记录的状态
         */
        private String status;

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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

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

    public enum StatusCode {
        _n15(-15, "域名已被封禁"),
        _6(6, "域名ID错误"),
        _7(7, "非域名所有者"),
        _8(8, "域名无效"),
        _17(17, "记录的值不正确"),
        _21(21, "域名被锁定"),
        _22(22, "子域名不合法"),
        _23(23, "子域名级数超出限制"),
        _24(24, "泛解析子域名错误"),
        _500025(500025, "A记录负载均衡超出限制"),
        _500026(500026, "CNAME记录负载均衡超出限制"),
        _26(26, "记录线路错误"),
        _27(27, "记录类型错误"),
        _30(30, "MX 值错误，1-20"),
        _31(31, "没有添加默认线路的记录、存在冲突的记录(A记录、CNAME记录、URL记录不能共存)"),
        _32(32, "记录的TTL值超出了限制、NS记录超出限制"),
        _33(33, "AAAA 记录数超出限制"),
        _34(34, "记录值非法"),
        _37(37, "SRV记录超出限制"),
        _82(82, "不能添加黑名单中的IP"),
        _104(104, "记录已存在无需添加"),
        _110(110, "域名没有备案（显性URL和隐形URL类型）");
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
}
