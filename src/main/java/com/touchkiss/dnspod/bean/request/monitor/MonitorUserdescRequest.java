package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorUserdescResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 18:19
 *
 * @author Touchkiss
 */
public class MonitorUserdescRequest extends BaseRequest<MonitorUserdescResponse> {
    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorUserdescResponse> getResponseClass() {
        return MonitorUserdescResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_USERDESC;
    }
}
