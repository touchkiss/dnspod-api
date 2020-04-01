package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 14:56
 *
 * @author Touchkiss
 */
public class DomainShareModifyResponse extends BaseResponse {

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
        _8(8, "域名id无效"),
        _13(13, "当前域名有误，请返回重新操作"),
        _21(21, "域名被锁定"),
        _23(23, "子域名级数超出限制"),
        _24(24, "泛解析级数超出限制");
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
