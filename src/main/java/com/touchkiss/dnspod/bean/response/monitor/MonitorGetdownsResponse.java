package com.touchkiss.dnspod.bean.response.monitor;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 18:20
 *
 * @author Touchkiss
 */
public class MonitorGetdownsResponse extends BaseResponse {

    /**
     * info : {"total_count":"1"}
     * monitor_downs : [{"monitor_id":"03e3b268-3643-11e2-bab7-0819a6248970","host":"testapi.com","record_line":"默认","ip":"119.180.24.194","warn_reason":"连接超时|访问您主机时连接超时，并且重试了5次后依然超时，建议您检查下你的服务器是否有网络不稳定的情况移动:timed out网通:timed out电信:timed out","switch_log":[],"created_on":"2012-11-24 22:30:06","updated_on":"0000-00-00 00:00:00"}]
     */

    private InfoBean info;
    private List<MonitorDownsBean> monitor_downs;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<MonitorDownsBean> getMonitor_downs() {
        return monitor_downs;
    }

    public void setMonitor_downs(List<MonitorDownsBean> monitor_downs) {
        this.monitor_downs = monitor_downs;
    }

    public static class InfoBean {
        /**
         * total_count : 1
         */

        private String total_count;

        public String getTotal_count() {
            return total_count;
        }

        public void setTotal_count(String total_count) {
            this.total_count = total_count;
        }
    }

    public static class MonitorDownsBean {
        /**
         * monitor_id : 03e3b268-3643-11e2-bab7-0819a6248970
         * host : testapi.com
         * record_line : 默认
         * ip : 119.180.24.194
         * warn_reason : 连接超时|访问您主机时连接超时，并且重试了5次后依然超时，建议您检查下你的服务器是否有网络不稳定的情况移动:timed out网通:timed out电信:timed out
         * switch_log : []
         * created_on : 2012-11-24 22:30:06
         * updated_on : 0000-00-00 00:00:00
         */

        private String monitor_id;
        private String host;
        private String record_line;
        private String ip;
        private String warn_reason;
        private String created_on;
        private String updated_on;
        private List<?> switch_log;

        public String getMonitor_id() {
            return monitor_id;
        }

        public void setMonitor_id(String monitor_id) {
            this.monitor_id = monitor_id;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
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

        public String getWarn_reason() {
            return warn_reason;
        }

        public void setWarn_reason(String warn_reason) {
            this.warn_reason = warn_reason;
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

        public List<?> getSwitch_log() {
            return switch_log;
        }

        public void setSwitch_log(List<?> switch_log) {
            this.switch_log = switch_log;
        }
    }
}
