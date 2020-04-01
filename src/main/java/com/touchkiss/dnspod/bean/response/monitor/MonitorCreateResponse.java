package com.touchkiss.dnspod.bean.response.monitor;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 17:42
 *
 * @author Touchkiss
 */
public class MonitorCreateResponse extends BaseResponse {
    /**
     * monitor : {"monitor_id":"6aac176e-363a-11e2-bab7-0819a6248970","record_id":16909160}
     */

    private MonitorBean monitor;

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

    public MonitorBean getMonitor() {
        return monitor;
    }

    public void setMonitor(MonitorBean monitor) {
        this.monitor = monitor;
    }

    public enum StatusCode {
        _6(6, "域名编号错误"),
        _7(7, "记录编号错误"),
        _8(8, "监控主机头错误"),
        _9(9, "监控端口错误，端口只能是正整数1~65535"),
        _10(10, "监控类型不正确"),
        _11(11, "监控路径不正确"),
        _12(12, "监控间隔不正确"),
        _13(13, "监控节点不正确"),
        _14(14, "监控节点数量超出限制"),
        _15(15, "备用IP不正确"),
        _16(16, "备用url不正确"),
        _17(17, "备用IP不正确"),
        _18(18, "短信设置不正确"),
        _19(19, "邮件设置不正确"),
        _20(20, "此记录已经存在监控"),
        _21(21, "监控数量超出限制"),
        _22(22, "回调URL不正确");
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

    public static class MonitorBean {
        /**
         * monitor_id : 6aac176e-363a-11e2-bab7-0819a6248970
         * record_id : 16909160
         */

        private String monitor_id;
        private int record_id;

        public String getMonitor_id() {
            return monitor_id;
        }

        public void setMonitor_id(String monitor_id) {
            this.monitor_id = monitor_id;
        }

        public int getRecord_id() {
            return record_id;
        }

        public void setRecord_id(int record_id) {
            this.record_id = record_id;
        }
    }
}
