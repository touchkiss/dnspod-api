package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 15:17
 *
 * @author Touchkiss
 */
public class DomainaliasListResponse extends BaseResponse {

    private List<AliasBean> alias;

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

    public List<AliasBean> getAlias() {
        return alias;
    }

    public void setAlias(List<AliasBean> alias) {
        this.alias = alias;
    }

    public enum StatusCode {
        _6(6, "域名ID错误"),
        _7(7, "非域名所有者"),
        _8(8, "域名无效"),
        _13(13, "当前域名有误，请返回重新操作");
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
         * domain : dnspodapi.com
         */
        /**
         * 域名别名绑定的ID
         */
        private String id;
        /**
         * 绑定的域名
         */
        private String domain;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }
}
