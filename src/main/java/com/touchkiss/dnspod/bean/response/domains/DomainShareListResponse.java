package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 14:52
 *
 * @author Touchkiss
 */
public class DomainShareListResponse extends BaseResponse {

    /**
     * share : [{"share_to":"yizerowu@dnspod.com","mode":"rw","status":"enabled"}]
     * owner : api@dnspod.com
     */
    /**
     * 域名所有者的账号
     */
    private String owner;
    private List<ShareBean> share;

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<ShareBean> getShare() {
        return share;
    }

    public void setShare(List<ShareBean> share) {
        this.share = share;
    }

    public enum StatusCode {
        _6(6, "域名ID错误"),
        _7(7, "非域名所有者"),
        _8(8, "域名无效、VIP域名不可以删除"),
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

    public static class ShareBean {
        /**
         * share_to : yizerowu@dnspod.com
         * mode : rw
         * status : enabled
         */
        /**
         * 共享给其他 DNSPod 的账号
         */
        private String share_to;
        /**
         * 域名共享模式
         * “rw”: 可读写
         * “r”: 只读
         */
        private String mode;
        /**
         * 域名的共享状态
         * “enabled”: 共享成功
         * “pending”: 共享到的账号不存在, 等待注册
         */
        private String status;

        public String getShare_to() {
            return share_to;
        }

        public void setShare_to(String share_to) {
            this.share_to = share_to;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
