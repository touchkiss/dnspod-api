package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorGethistoryResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 18:07
 *
 * @author Touchkiss
 */
public class MonitorGethistoryRequest extends BaseRequest<MonitorGethistoryResponse> {
    /**
     * 必须
     * 监控编号
     */
    private String monitor_id;
    /**
     * 非必须
     * 获取最近多少个小时的记录
     */
    private int hours;
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorGethistoryResponse> getResponseClass() {
        return MonitorGethistoryResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_GETHISTORY;
    }
}
