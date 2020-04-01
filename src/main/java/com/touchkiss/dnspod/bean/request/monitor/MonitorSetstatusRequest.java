package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorSetstatusResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 18:01
 *
 * @author Touchkiss
 */
public class MonitorSetstatusRequest extends BaseRequest<MonitorSetstatusResponse> {
    /**
     * 必须
     * 监控编号
     */
    private String monitor_id;
    /**
     * 必须
     * {enabled|disabled} 新的状态
     */
    private String status;

    public String getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(String monitor_id) {
        this.monitor_id = monitor_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorSetstatusResponse> getResponseClass() {
        return MonitorSetstatusResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_SET_STATUS;
    }
}
