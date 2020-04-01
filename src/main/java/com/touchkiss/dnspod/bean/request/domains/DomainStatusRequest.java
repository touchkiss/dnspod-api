package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainStatusResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 14:23
 *
 * @author Touchkiss
 */
public class DomainStatusRequest extends BaseRequest<DomainStatusResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 域名状态，”enable” 、”disable” 分别代表启用和暂停
     */
    private String status;

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainStatusResponse> getResponseClass() {
        return DomainStatusResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_STATUS;
    }
}
