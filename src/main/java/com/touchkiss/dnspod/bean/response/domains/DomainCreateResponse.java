package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 13:43
 *
 * @author Touchkiss
 */
public class DomainCreateResponse extends BaseResponse {

    /**
     * domain : {"id":"1992403","punycode":"api2.com","domain":"api2.com"}
     */

    private DomainBean domain;

    public DomainBean getDomain() {
        return domain;
    }

    public void setDomain(DomainBean domain) {
        this.domain = domain;
    }

    @Override
    public String statusDetail() {
        String msg = super.statusDetail();
        if (msg == null) {
            try {
                return StatusCode.valueOf("_" + getStatus().getCode().replace("-", "n")).getDetails();
            }catch (Exception e){

            }
        }
        return null;
    }

    public static class DomainBean {
        /**
         * id : 1992403
         * punycode : api2.com
         * domain : api2.com
         */

        private String id;//域名 ID, 即为 domain_id
        private String punycode;//使用 punycode 转码之后的域名
        private String domain;//添加的域名

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPunycode() {
            return punycode;
        }

        public void setPunycode(String punycode) {
            this.punycode = punycode;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }

    public enum StatusCode {
        _6(6, "域名无效"),
        _7(7, "域名已存在"),
        _11(11, "域名已经存在并且是其它域名的别名"),
        _12(12, "域名已经存在并且您没有权限管理");
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
}
