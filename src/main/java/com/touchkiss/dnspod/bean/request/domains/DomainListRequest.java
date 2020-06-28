package com.touchkiss.dnspod.bean.request.domains;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.domains.DomainListResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 14:02
 *
 * @author Touchkiss
 */
public class DomainListRequest extends BaseRequest<DomainListResponse> {
    /**
     * 非必须
     * 域名分组类型, 默认为’all’. 包含以下类型：
     * all：所有域名
     * mine：我的域名
     * share：共享给我的域名
     * ismark：星标域名
     * pause：暂停域名
     * vip：VIP域名
     * recent：最近操作过的域名
     * share_out：我共享出去的域名
     */
    private String type;
    /**
     * 非必须
     * 记录开始的偏移, 第一条记录为 0, 依次类推
     */
    private int offset;
    /**
     * 非必须
     * 要获取的域名数量, 比如获取20个, 则为20
     */
    private int length;
    /**
     * 非必须
     * 分组ID, 获取指定分组的域名。可以通过 获取域名分组 获取 group_id
     */
    private String group_id;
    /**
     * 非必须
     * 搜索的关键字, 如果指定则只返回符合该关键字的域名
     */
    private String keyword;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<DomainListResponse> getResponseClass() {
        return DomainListResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.DOMAIN_LIST;
    }
}
