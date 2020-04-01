package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomaingroupRemoveResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 15:40
 *
 * @author Touchkiss
 */
public class DomaingroupRemoveRequest extends BaseRequest<DomaingroupRemoveResponse> {
    /**
     * 必须
     * 	要删除的分组ID
     */
    private String group_id;

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomaingroupRemoveResponse> getResponseClass() {
        return DomaingroupRemoveResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_GROUP_REMOVE;
    }
}
