package com.touchkiss.dnspod.bean.response.accounts;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 9:59
 *
 * @author Touchkiss
 */
public class UserDetailResponse extends BaseResponse {

    /**
     * info : {"user":{"real_name":"","user_type":"personal","telephone":"187****3214","im":"","nick":"DNSPod 先生","id":"625033","email":"api@dnspod.com","status":"enabled","email_verified":"no","telephone_verified":"no","weixin_binded":"no","agent_pending":false,"balance":0,"smsbalance":0,"user_grade":"DP_Free"},"agent":{"discount":"100","points":"0","balance_limit":"yes","users":"1"}}
     */

    private InfoBean info;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * user : {"real_name":"","user_type":"personal","telephone":"187****3214","im":"","nick":"DNSPod 先生","id":"625033","email":"api@dnspod.com","status":"enabled","email_verified":"no","telephone_verified":"no","weixin_binded":"no","agent_pending":false,"balance":0,"smsbalance":0,"user_grade":"DP_Free"}
         * agent : {"discount":"100","points":"0","balance_limit":"yes","users":"1"}
         */

        private UserBean user;
        private AgentBean agent;//仅当前是代理用户时，返回该字段，包含代理及其名下用户信息

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public AgentBean getAgent() {
            return agent;
        }

        public void setAgent(AgentBean agent) {
            this.agent = agent;
        }

        public static class UserBean {
            /**
             * real_name :
             * user_type : personal
             * telephone : 187****3214
             * im :
             * nick : DNSPod 先生
             * id : 625033
             * email : api@dnspod.com
             * status : enabled
             * email_verified : no
             * telephone_verified : no
             * weixin_binded : no
             * agent_pending : false
             * balance : 0
             * smsbalance : 0
             * user_grade : DP_Free
             */

            private String real_name;//用户名称, 企业用户对应为公司名称
            private String user_type;//账号类型：[“personal”,”enterprise”]，分别对应个人用户和企业用户
            private String telephone;//电话号码
            private String im;//用户 IM (已废弃)
            private String nick;//用户昵称
            private String id;//用户 ID, 即为 user_id
            private String email;//用户账号, 邮箱格式
            private String status;//账号状态：”enabled”: 正常；”disabled”: 被封禁
            private String email_verified;//邮箱是否通过验证：”yes”: 通过；”no”: 未通过
            private String telephone_verified;//手机是否通过验证：”yes”: 通过；”no”: 未通过
            private String weixin_binded;//是否绑定微信：”yes”: 通过；”no”: 未通过
            private boolean agent_pending;//是否正在申请成为代理：true: 是；false: 否
            private int balance;//账号余额
            private int smsbalance;//剩余短信条数
            private String user_grade;//账号等级, 按照用户账号下域名等级排序, 选取一个最高等级为账号等级, 具体对应情况参见域名等级

            public String getReal_name() {
                return real_name;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
            }

            public String getUser_type() {
                return user_type;
            }

            public void setUser_type(String user_type) {
                this.user_type = user_type;
            }

            public String getTelephone() {
                return telephone;
            }

            public void setTelephone(String telephone) {
                this.telephone = telephone;
            }

            public String getIm() {
                return im;
            }

            public void setIm(String im) {
                this.im = im;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getEmail_verified() {
                return email_verified;
            }

            public void setEmail_verified(String email_verified) {
                this.email_verified = email_verified;
            }

            public String getTelephone_verified() {
                return telephone_verified;
            }

            public void setTelephone_verified(String telephone_verified) {
                this.telephone_verified = telephone_verified;
            }

            public String getWeixin_binded() {
                return weixin_binded;
            }

            public void setWeixin_binded(String weixin_binded) {
                this.weixin_binded = weixin_binded;
            }

            public boolean isAgent_pending() {
                return agent_pending;
            }

            public void setAgent_pending(boolean agent_pending) {
                this.agent_pending = agent_pending;
            }

            public int getBalance() {
                return balance;
            }

            public void setBalance(int balance) {
                this.balance = balance;
            }

            public int getSmsbalance() {
                return smsbalance;
            }

            public void setSmsbalance(int smsbalance) {
                this.smsbalance = smsbalance;
            }

            public String getUser_grade() {
                return user_grade;
            }

            public void setUser_grade(String user_grade) {
                this.user_grade = user_grade;
            }
        }

        public static class AgentBean {
            /**
             * discount : 100
             * points : 0
             * balance_limit : yes
             * users : 1
             */

            private String discount;
            private String points;
            private String balance_limit;
            private String users;

            public String getDiscount() {
                return discount;
            }

            public void setDiscount(String discount) {
                this.discount = discount;
            }

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }

            public String getBalance_limit() {
                return balance_limit;
            }

            public void setBalance_limit(String balance_limit) {
                this.balance_limit = balance_limit;
            }

            public String getUsers() {
                return users;
            }

            public void setUsers(String users) {
                this.users = users;
            }
        }
    }
}
