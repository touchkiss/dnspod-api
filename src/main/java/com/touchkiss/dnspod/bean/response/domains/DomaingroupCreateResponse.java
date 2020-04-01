package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 15:31
 *
 * @author Touchkiss
 */
public class DomaingroupCreateResponse extends BaseResponse {

    /**
     * groups : {"id":"1985"}
     */

    private GroupsBean groups;

    public GroupsBean getGroups() {
        return groups;
    }

    public void setGroups(GroupsBean groups) {
        this.groups = groups;
    }

    @Override
    public String statusDetail() {
        String msg = super.statusDetail();
        if (msg == null) {
            try {
                return StatusCode.valueOf("_" + getStatus().getCode().replace("-", "n")).getDetails();
            } catch (Exception e) {

            }
        }
        return null;
    }

    public enum StatusCode {
        _7(7, "分组名称错误"),
        _8(8, "分组名称已经存在"),
        _9(9, "分组数量超出限制");
        private int code;
        private String details;

        StatusCode(int code, String details) {
            this.code = code;
            this.details = details;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }
    }

    public static class GroupsBean {
        /**
         * id : 1985
         */
        /**
         * 域名分组的 ID
         */
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
