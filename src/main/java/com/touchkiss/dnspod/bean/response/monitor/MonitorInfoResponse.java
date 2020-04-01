package com.touchkiss.dnspod.bean.response.monitor;

import com.google.gson.annotations.SerializedName;
import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 17:55
 *
 * @author Touchkiss
 */
public class MonitorInfoResponse extends BaseResponse {

    /**
     * info : {"monitor_id":"e91997aa-3641-11e2-bab7-0819a6248970","domain":"testapi.com","domain_id":"2317346","domain_grade":"D_Plus","record_id":"16909160","sub_domain":"@","record_line":"默认","ip":"119.180.24.194","now_ip":"119.180.24.194","host":"testapi.com","port":"80","monitor_type":"http","monitor_path":"/","monitor_interval":"180","points":"ctc,cuc","bak_ip":"pass","status":"Ok","status_code":"200","sms_notice":"me","email_notice":"me","less_notice":"no","callback_url":"","callback_key":"","monitor_status":"enabled","created_on":"2012-11-24 22:19:09","updated_on":"2012-11-24 22:19:09","bak_ip_status":[]}
     */

    private InfoBean info;

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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public enum StatusCode {
        _7(7, "监控编号错误");
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

    public static class InfoBean {
        /**
         * monitor_id : e91997aa-3641-11e2-bab7-0819a6248970
         * domain : testapi.com
         * domain_id : 2317346
         * domain_grade : D_Plus
         * record_id : 16909160
         * sub_domain : @
         * record_line : 默认
         * ip : 119.180.24.194
         * now_ip : 119.180.24.194
         * host : testapi.com
         * port : 80
         * monitor_type : http
         * monitor_path : /
         * monitor_interval : 180
         * points : ctc,cuc
         * bak_ip : pass
         * status : Ok
         * status_code : 200
         * sms_notice : me
         * email_notice : me
         * less_notice : no
         * callback_url :
         * callback_key :
         * monitor_status : enabled
         * created_on : 2012-11-24 22:19:09
         * updated_on : 2012-11-24 22:19:09
         * bak_ip_status : []
         */

        private String monitor_id;
        private String domain;
        private String domain_id;
        private String domain_grade;
        private String record_id;
        private String sub_domain;
        private String record_line;
        private String ip;
        private String now_ip;
        private String host;
        private String port;
        private String monitor_type;
        private String monitor_path;
        private String monitor_interval;
        private String points;
        private String bak_ip;
        @SerializedName("status")
        private String statusX;
        private String status_code;
        private String sms_notice;
        private String email_notice;
        private String less_notice;
        private String callback_url;
        private String callback_key;
        private String monitor_status;
        private String created_on;
        private String updated_on;
        private List<?> bak_ip_status;

        public String getMonitor_id() {
            return monitor_id;
        }

        public void setMonitor_id(String monitor_id) {
            this.monitor_id = monitor_id;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getDomain_id() {
            return domain_id;
        }

        public void setDomain_id(String domain_id) {
            this.domain_id = domain_id;
        }

        public String getDomain_grade() {
            return domain_grade;
        }

        public void setDomain_grade(String domain_grade) {
            this.domain_grade = domain_grade;
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

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getNow_ip() {
            return now_ip;
        }

        public void setNow_ip(String now_ip) {
            this.now_ip = now_ip;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getMonitor_type() {
            return monitor_type;
        }

        public void setMonitor_type(String monitor_type) {
            this.monitor_type = monitor_type;
        }

        public String getMonitor_path() {
            return monitor_path;
        }

        public void setMonitor_path(String monitor_path) {
            this.monitor_path = monitor_path;
        }

        public String getMonitor_interval() {
            return monitor_interval;
        }

        public void setMonitor_interval(String monitor_interval) {
            this.monitor_interval = monitor_interval;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getBak_ip() {
            return bak_ip;
        }

        public void setBak_ip(String bak_ip) {
            this.bak_ip = bak_ip;
        }

        public String getStatusX() {
            return statusX;
        }

        public void setStatusX(String statusX) {
            this.statusX = statusX;
        }

        public String getStatus_code() {
            return status_code;
        }

        public void setStatus_code(String status_code) {
            this.status_code = status_code;
        }

        public String getSms_notice() {
            return sms_notice;
        }

        public void setSms_notice(String sms_notice) {
            this.sms_notice = sms_notice;
        }

        public String getEmail_notice() {
            return email_notice;
        }

        public void setEmail_notice(String email_notice) {
            this.email_notice = email_notice;
        }

        public String getLess_notice() {
            return less_notice;
        }

        public void setLess_notice(String less_notice) {
            this.less_notice = less_notice;
        }

        public String getCallback_url() {
            return callback_url;
        }

        public void setCallback_url(String callback_url) {
            this.callback_url = callback_url;
        }

        public String getCallback_key() {
            return callback_key;
        }

        public void setCallback_key(String callback_key) {
            this.callback_key = callback_key;
        }

        public String getMonitor_status() {
            return monitor_status;
        }

        public void setMonitor_status(String monitor_status) {
            this.monitor_status = monitor_status;
        }

        public String getCreated_on() {
            return created_on;
        }

        public void setCreated_on(String created_on) {
            this.created_on = created_on;
        }

        public String getUpdated_on() {
            return updated_on;
        }

        public void setUpdated_on(String updated_on) {
            this.updated_on = updated_on;
        }

        public List<?> getBak_ip_status() {
            return bak_ip_status;
        }

        public void setBak_ip_status(List<?> bak_ip_status) {
            this.bak_ip_status = bak_ip_status;
        }
    }
}
