package com.touchkiss.dnspod.bean.response;

/**
 * Created on 2020/03/31 9:43
 *
 * @author Touchkiss
 */
public abstract class BaseResponse {
    private StatusBean status;

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public String statusDetail() {
        try {
            return StatusCode.valueOf("_" + getStatus().getCode().replace("-", "n")).getDetails();
        } catch (Exception e) {

        }
        return null;
    }

    public enum StatusCode {
        _n1(-1, "登陆失败"),
        _n2(-2, "API使用超出限制"),
        _n3(-3, "不是合法代理 (仅用于代理接口)"),
        _n4(-4, "不在代理名下 (仅用于代理接口)"),
        _n7(-7, "无权使用此接口"),
        _n8(-8, "登录失败次数过多，帐号被暂时封禁"),
        _85(85, "帐号异地登录，请求被拒绝.该帐户开启了登录区域保护，当前IP不在允许的区域内"),
        _n99(-99, "此功能暂停开放，请稍候重试"),
        _1(1, "操作成功"),
        _2(2, "只允许POST方法"),
        _3(3, "未知错误"),
        _6(6, "用户ID错误 (仅用于代理接口)"),
        _7(7, "用户不在您名下 (仅用于代理接口)"),
        _83(83, "该帐户已经被锁定，无法进行任何操作");
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

    public static class StatusBean {
        private String code;
        private String message;
        private String created_at;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }
}
