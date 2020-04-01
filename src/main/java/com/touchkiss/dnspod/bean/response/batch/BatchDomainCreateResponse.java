package com.touchkiss.dnspod.bean.response.batch;

import com.google.gson.annotations.SerializedName;
import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 16:59
 *
 * @author Touchkiss
 */
public class BatchDomainCreateResponse extends BaseResponse {

    /**
     * job_id : 39581
     * detail : [{"id":0,"domain":"dnsapi1.cn","domain_grade":"DP_Free","err_msg":null,"status":"waiting","operation":"plus","records":[{"id":0,"sub_domain":"www","record_type":"A","area":"默认","value":"11.22.33.45","ttl":600,"err_msg":null,"status":"waiting","operation":"plus"},{"id":1,"sub_domain":"@","record_type":"A","area":"默认","value":"11.22.33.45","ttl":600,"err_msg":null,"status":"waiting","operation":"plus"}]},{"id":1,"domain":"dnsapi2.cn","domain_grade":"DP_Free","err_msg":null,"status":"waiting","operation":"plus","records":[{"id":0,"sub_domain":"www","record_type":"A","area":"默认","value":"11.22.33.45","ttl":600,"err_msg":null,"status":"waiting","operation":"plus"},{"id":1,"sub_domain":"@","record_type":"A","area":"默认","value":"11.22.33.45","ttl":600,"err_msg":null,"status":"waiting","operation":"plus"}]}]
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
         * id : 0
         * domain : dnsapi1.cn
         * domain_grade : DP_Free
         * err_msg : null
         * status : waiting
         * operation : plus
         * records : [{"id":0,"sub_domain":"www","record_type":"A","area":"默认","value":"11.22.33.45","ttl":600,"err_msg":null,"status":"waiting","operation":"plus"},{"id":1,"sub_domain":"@","record_type":"A","area":"默认","value":"11.22.33.45","ttl":600,"err_msg":null,"status":"waiting","operation":"plus"}]
         */

        private int id;
        private String domain;
        private String domain_grade;
        private Object err_msg;
        @SerializedName("status")
        private String statusX;
        private String operation;
        private List<RecordsBean> records;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public static class RecordsBean {
            /**
             * id : 0
             * sub_domain : www
             * record_type : A
             * area : 默认
             * value : 11.22.33.45
             * ttl : 600
             * err_msg : null
             * status : waiting
             * operation : plus
             */

            private int id;
            private String sub_domain;
            private String record_type;
            private String area;
            private String value;
            private int ttl;
            private Object err_msg;
            @SerializedName("status")
            private String statusX;
            private String operation;

            public int getId() {
                return id;
            }

            public void setId(int id) {
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

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public int getTtl() {
                return ttl;
            }

            public void setTtl(int ttl) {
                this.ttl = ttl;
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

            public String getOperation() {
                return operation;
            }

            public void setOperation(String operation) {
                this.operation = operation;
            }
        }
    }
}
