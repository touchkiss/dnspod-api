package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorListResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:40
 *
 * @author Touchkiss
 */
public class MonitorListRequest extends BaseRequest<MonitorListResponse> {
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorListResponse> getResponseClass() {
        return MonitorListResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_LIST;
    }
}
