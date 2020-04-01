package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 15:09
 *
 * @author Touchkiss
 */
public class DomainLockResponse extends BaseResponse {

    /**
     * lock : {"domain_id":"2059079","lock_code":"fdd638","lock_end":"2015-01-21"}
     */

    private LockBean lock;

    public LockBean getLock() {
        return lock;
    }

    public void setLock(LockBean lock) {
        this.lock = lock;
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

    public static class LockBean {
        /**
         * domain_id : 2059079
         * lock_code : fdd638
         * lock_end : 2015-01-21
         */
        /**
         * 域名ID, 即为 domain_id
         */
        private String domain_id;
        /**
         * 域名解锁码
         */
        private String lock_code;
        /**
         * 域名自动解锁日期
         */
        private String lock_end;

        public String getDomain_id() {
            return domain_id;
        }

        public void setDomain_id(String domain_id) {
            this.domain_id = domain_id;
        }

        public String getLock_code() {
            return lock_code;
        }

        public void setLock_code(String lock_code) {
            this.lock_code = lock_code;
        }

        public String getLock_end() {
            return lock_end;
        }

        public void setLock_end(String lock_end) {
            this.lock_end = lock_end;
        }
    }

    public enum StatusCode {
        _n15(-15, "域名已被封禁"),
        _6(6, "域名ID错误"),
        _7(7, "非域名所有者"),
        _8(8, "锁定天数错误"),
        _13(13, "当前域名有误，请返回重新操作"),
        _21(21, "域名已经被锁定");
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
