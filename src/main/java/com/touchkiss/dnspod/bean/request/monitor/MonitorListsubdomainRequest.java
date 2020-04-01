package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorListsubdomianResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:23
 *
 * @author Touchkiss
 */
public class MonitorListsubdomainRequest extends BaseRequest<MonitorListsubdomianResponse> {
    /**
     * 必选
     */
    private int domain_id;
    private String domain;

    public int getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(int domain_id) {
        this.domain_id = domain_id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorListsubdomianResponse> getResponseClass() {
        return MonitorListsubdomianResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_LIST_SUBDOMAIN;
    }
}
