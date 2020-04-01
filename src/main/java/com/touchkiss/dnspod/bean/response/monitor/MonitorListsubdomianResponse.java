package com.touchkiss.dnspod.bean.response.monitor;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 17:21
 *
 * @author Touchkiss
 */
public class MonitorListsubdomianResponse extends BaseResponse {

    /**
     * domain : {"id":2317346,"name":"testapi.com","punycode":"testapi.com","grade":"D_Plus","owner":"api@dnspod.com"}
     * subdomain : ["@"]
     */

    private DomainBean domain;
    private List<String> subdomain;

    public DomainBean getDomain() {
        return domain;
    }

    public void setDomain(DomainBean domain) {
        this.domain = domain;
    }

    public List<String> getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(List<String> subdomain) {
        this.subdomain = subdomain;
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
        _6(6, "当前域名有误，请返回重新操作"),
        _7(7, "域名编号错误"),
        _8(8, "此域名没有任何记录");
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

    public static class DomainBean {
        /**
         * id : 2317346
         * name : testapi.com
         * punycode : testapi.com
         * grade : D_Plus
         * owner : api@dnspod.com
         */

        private int id;
        private String name;
        private String punycode;
        private String grade;
        private String owner;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPunycode() {
            return punycode;
        }

        public void setPunycode(String punycode) {
            this.punycode = punycode;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }
}
