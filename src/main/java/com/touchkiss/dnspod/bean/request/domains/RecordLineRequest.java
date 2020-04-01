package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.RecordLineResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 16:07
 *
 * @author Touchkiss
 */
public class RecordLineRequest extends BaseRequest<RecordLineResponse> {
    /**
     * 必须
     * 分别对应域名ID和域名, 提交其中一个即可
     */
    private int domain_id;
    private String domain;
    /**
     * 必须
     * 域名等级, 分别为：
     * 旧套餐：D_Free、D_Plus、D_Extra、D_Expert、D_Ultra 分别对应免费套餐、个人豪华、企业1、企业2、企业3
     * 新套餐：DP_Free、DP_Plus、DP_Extra、DP_Expert、DP_Ultra 分别对应新免费、个人专业版、企业创业版、企业标准版、企业旗舰版
     */
    private String domain_grade;

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

    public String getDomain_grade() {
        return domain_grade;
    }

    public void setDomain_grade(String domain_grade) {
        this.domain_grade = domain_grade;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<RecordLineResponse> getResponseClass() {
        return RecordLineResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.RECORD_LINE;
    }
}
