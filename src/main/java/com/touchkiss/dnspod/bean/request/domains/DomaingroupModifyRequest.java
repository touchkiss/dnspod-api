package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomaingroupModifyResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:37
 *
 * @author Touchkiss
 */
public class DomaingroupModifyRequest extends BaseRequest<DomaingroupModifyResponse> {
    /**
     * 必须
     * 要修改的分组ID
     */
    private String group_id;
    /**
     * 必须
     * 需要修改到的分组名称
     */
    private String group_name;

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomaingroupModifyResponse> getResponseClass() {
        return DomaingroupModifyResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_GROUP_MODIFY;
    }
}
