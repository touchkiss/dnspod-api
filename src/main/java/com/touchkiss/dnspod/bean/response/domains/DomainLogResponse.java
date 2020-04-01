package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 14:36
 *
 * @author Touchkiss
 */
public class DomainLogResponse extends BaseResponse {
    private List<String> log;

    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
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
        _8(8, "域名无效");
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
