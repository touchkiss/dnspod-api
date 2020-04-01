package com.touchkiss.dnspod.bean.response.monitor;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 18:05
 *
 * @author Touchkiss
 */
public class MonitorGethistoryResponse extends BaseResponse {

    /**
     * domain : {"id":"2317346","domain":"testapi.com","domain_grade":"D_Plus"}
     * record : {"id":"16909160","sub_domain":"@","ip":"119.180.24.194"}
     * monitor_history : [{"data":{"message":"ok","code":200,"data":[{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:28:31","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:31:31","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:34:31","responsetime":999},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:37:31","responsetime":1}]},"point":"ctc"},{"data":{"message":"ok","code":200,"data":[{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:28:52","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:31:52","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:34:52","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:37:52","responsetime":0}]},"point":"cuc"}]
     */

    private DomainBean domain;
    private RecordBean record;
    private List<MonitorHistoryBean> monitor_history;

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

    public List<MonitorHistoryBean> getMonitor_history() {
        return monitor_history;
    }

    public void setMonitor_history(List<MonitorHistoryBean> monitor_history) {
        this.monitor_history = monitor_history;
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
        _6(6, "监控编号错误");
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
         * id : 2317346
         * domain : testapi.com
         * domain_grade : D_Plus
         */

        private String id;
        private String domain;
        private String domain_grade;

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
    }

    public static class RecordBean {
        /**
         * id : 16909160
         * sub_domain : @
         * ip : 119.180.24.194
         */

        private String id;
        private String sub_domain;
        private String ip;

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

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }

    public static class MonitorHistoryBean {
        /**
         * data : {"message":"ok","code":200,"data":[{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:28:31","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:31:31","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:34:31","responsetime":999},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:37:31","responsetime":1}]}
         * point : ctc
         */

        private DataBeanX data;
        private String point;

        public DataBeanX getData() {
            return data;
        }

        public void setData(DataBeanX data) {
            this.data = data;
        }

        public String getPoint() {
            return point;
        }

        public void setPoint(String point) {
            this.point = point;
        }

        public static class DataBeanX {
            /**
             * message : ok
             * code : 200
             * data : [{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:28:31","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:31:31","responsetime":0},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:34:31","responsetime":999},{"status":"Down","status_code":-3,"createtime":"2012-11-24 22:37:31","responsetime":1}]
             */

            private String message;
            private int code;
            private List<DataBean> data;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean {
                /**
                 * status : Down
                 * status_code : -3
                 * createtime : 2012-11-24 22:28:31
                 * responsetime : 0
                 */
                private String status;
                private int status_code;
                private String createtime;
                private int responsetime;

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getStatus_code() {
                    return status_code;
                }

                public void setStatus_code(int status_code) {
                    this.status_code = status_code;
                }

                public String getCreatetime() {
                    return createtime;
                }

                public void setCreatetime(String createtime) {
                    this.createtime = createtime;
                }

                public int getResponsetime() {
                    return responsetime;
                }

                public void setResponsetime(int responsetime) {
                    this.responsetime = responsetime;
                }
            }
        }
    }
}
