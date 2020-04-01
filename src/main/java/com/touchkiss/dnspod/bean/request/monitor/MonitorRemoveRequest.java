package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorRemoveResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:53
 *
 * @author Touchkiss
 */
public class MonitorRemoveRequest extends BaseRequest<MonitorRemoveResponse> {
    /**
     * 监控编号
     */
    private String monitor_id;

    public String getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(String monitor_id) {
        this.monitor_id = monitor_id;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorRemoveResponse> getResponseClass() {
        return MonitorRemoveResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_REMOVE;
    }
}
