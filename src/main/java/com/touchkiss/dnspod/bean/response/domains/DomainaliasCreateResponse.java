package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 15:21
 *
 * @author Touchkiss
 */
public class DomainaliasCreateResponse extends BaseResponse {

    /**
     * alias : {"id":"18737","punycode":"dnspodapi.com"}
     */

    private AliasBean alias;

    public AliasBean getAlias() {
        return alias;
    }

    public void setAlias(AliasBean alias) {
        this.alias = alias;
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
        _n15(-15, "域名已被封禁"),
        _6(6, "域名ID错误"),
        _7(7, "非域名所有者"),
        _8(8, "域名已存在"),
        _9(9, "别名已存在"),
        _10(10, "别名数量已经达到限制"),
        _13(13, "当前域名有误，请返回重新操作"),
        _21(21, "域名被锁定");
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

    public static class AliasBean {
        /**
         * id : 18737
         * punycode : dnspodapi.com
         */
        /**
         * 域名别名绑定的 ID
         */
        private String id;
        /**
         * 别名绑定的域名
         */
        private String punycode;

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
    }
}
