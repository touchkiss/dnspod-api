package com.touchkiss.dnspod.bean.response.batch;

import com.google.gson.annotations.SerializedName;
import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 17:12
 *
 * @author Touchkiss
 */
public class BatchRecordModifyResponse extends BaseResponse {

    /**
     * job_id : 409952
     * detail : [{"domain_id":92,"domain":"dnsapi1.cn","err_msg":null,"status":"waiting","operation":null,"records":[{"record_id":"36","sub_domain":"bbs","area":"默认","record_type":"CNAME","ttl":"600","value":"bbs.dnsapi2.com.","enabled":"1","status":"waiting","err_msg":null,"id":0,"operation":"edit"}],"domain_grade":"D_Plus","id":0},{"domain_id":171,"domain":"dnsapi1.cn","err_msg":null,"status":"waiting","operation":null,"records":[{"record_id":"90","sub_domain":"www","area":"电信","record_type":"A","ttl":"3600","value":"11.11.22.22","enabled":"1","status":"waiting","err_msg":null,"id":0,"operation":"edit"},{"record_id":"91","sub_domain":"@","area":"电信","record_type":"MX","ttl":"3600","value":"61.144.40.92.","enabled":"1","status":"waiting","mx":"5","err_msg":null,"id":1,"operation":"edit"}],"domain_grade":"D_Free","id":1}]
     */
    /**
     * 任务ID，批量操作为异步执行，拿到 job_id 说明批量操作已经成功加入到任务队列，可通过 Batch.Detail 接口异步去查询执行结果
     */
    private String job_id;
    /**
     * 任务详情，仅将用户的输入补全，并非实际执行结果，开发者可以忽略该字段
     */
    private List<DetailBean> detail;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public List<DetailBean> getDetail() {
        return detail;
    }

    public void setDetail(List<DetailBean> detail) {
        this.detail = detail;
    }

    public static class DetailBean {
        /**
         * domain_id : 92
         * domain : dnsapi1.cn
         * err_msg : null
         * status : waiting
         * operation : null
         * records : [{"record_id":"36","sub_domain":"bbs","area":"默认","record_type":"CNAME","ttl":"600","value":"bbs.dnsapi2.com.","enabled":"1","status":"waiting","err_msg":null,"id":0,"operation":"edit"}]
         * domain_grade : D_Plus
         * id : 0
         */

        private int domain_id;
        private String domain;
        private Object err_msg;
        @SerializedName("status")
        private String statusX;
        private Object operation;
        private String domain_grade;
        private int id;
        private List<RecordsBean> records;

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

        public Object getErr_msg() {
            return err_msg;
        }

        public void setErr_msg(Object err_msg) {
            this.err_msg = err_msg;
        }

        public String getStatusX() {
            return statusX;
        }

        public void setStatusX(String statusX) {
            this.statusX = statusX;
        }

        public Object getOperation() {
            return operation;
        }

        public void setOperation(Object operation) {
            this.operation = operation;
        }

        public String getDomain_grade() {
            return domain_grade;
        }

        public void setDomain_grade(String domain_grade) {
            this.domain_grade = domain_grade;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public static class RecordsBean {
            /**
             * record_id : 36
             * sub_domain : bbs
             * area : 默认
             * record_type : CNAME
             * ttl : 600
             * value : bbs.dnsapi2.com.
             * enabled : 1
             * status : waiting
             * err_msg : null
             * id : 0
             * operation : edit
             */

            private String record_id;
            private String sub_domain;
            private String area;
            private String record_type;
            private String ttl;
            private String value;
            private String enabled;
            @SerializedName("status")
            private String statusX;
            private Object err_msg;
            private int id;
            private String operation;

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

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getRecord_type() {
                return record_type;
            }

            public void setRecord_type(String record_type) {
                this.record_type = record_type;
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

            public String getEnabled() {
                return enabled;
            }

            public void setEnabled(String enabled) {
                this.enabled = enabled;
            }

            public String getStatusX() {
                return statusX;
            }

            public void setStatusX(String statusX) {
                this.statusX = statusX;
            }

            public Object getErr_msg() {
                return err_msg;
            }

            public void setErr_msg(Object err_msg) {
                this.err_msg = err_msg;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getOperation() {
                return operation;
            }

            public void setOperation(String operation) {
                this.operation = operation;
            }
        }
    }
}
