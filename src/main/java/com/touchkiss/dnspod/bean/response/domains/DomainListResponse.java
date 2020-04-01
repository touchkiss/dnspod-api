package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 14:01
 *
 * @author Touchkiss
 */
public class DomainListResponse extends BaseResponse {

    /**
     * info : {"domain_total":2,"all_total":2,"mine_total":2,"share_total":0,"vip_total":0,"ismark_total":0,"pause_total":0,"error_total":2,"lock_total":0,"spam_total":0,"vip_expire":0,"share_out_total":0}
     * domains : [{"id":2238269,"status":"enable","grade":"D_Free","group_id":"1","searchengine_push":"yes","is_mark":"no","ttl":"300","cname_speedup":"disable","remark":"","created_on":"2015-01-19 08:20:03","updated_on":"2015-01-19 18:54:35","punycode":"xn--vnqp08b.cn","ext_status":"dnserror","name":"我们.cn","grade_title":"免费套餐","grade_ns":["ns3.dnsv3.com","ns4.dnsv3.com"],"is_vip":"no","owner":"api@dnspod.com","records":"4","vip_start_at":"2019-07-17 00:00:00","vip_end_at":"2020-08-26 23:59:59","vip_auto_renew":"default"},{"id":10360095,"status":"enable","grade":"DP_Free","group_id":"1","searchengine_push":"yes","is_mark":"no","ttl":"600","cname_speedup":"disable","remark":"","created_on":"2014-11-25 16:56:31","updated_on":"2015-01-19 16:56:31","punycode":"usertest.com","ext_status":"dnserror","name":"usertest.com","grade_title":"新免费套餐","grade_ns":["f1g1ns1.dnspod.net","f1g1ns2.dnspod.net"],"is_vip":"no","owner":"api@dnspod.com","records":"2","auth_to_anquanbao":true}]
     */

    private InfoBean info;
    private List<DomainsBean> domains;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<DomainsBean> getDomains() {
        return domains;
    }

    public void setDomains(List<DomainsBean> domains) {
        this.domains = domains;
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
        _6(6, "记录开始的偏移无效"),
        _7(7, "共要获取的记录的数量无效"),
        _9(9, "没有任何域名");
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

    public static class InfoBean {
        /**
         * domain_total : 2
         * all_total : 2
         * mine_total : 2
         * share_total : 0
         * vip_total : 0
         * ismark_total : 0
         * pause_total : 0
         * error_total : 2
         * lock_total : 0
         * spam_total : 0
         * vip_expire : 0
         * share_out_total : 0
         */
        /**
         * 域名总数
         */
        private int domain_total;
        /**
         * 域名总数
         */
        private int all_total;
        /**
         * 自己创建的域名总数(不包括共享得到的域名)
         */
        private int mine_total;
        /**
         * 共享得到的域名总数
         */
        private int share_total;
        /**
         * VIP 域名总数
         */
        private int vip_total;
        /**
         * 星标域名的总数
         */
        private int ismark_total;
        /**
         * 暂停解析的域名总数
         */
        private int pause_total;
        /**
         * DNS 设置错误的域名总数(包括未注册的和 NS 地址没有改到 DNSPod 的域名)
         */
        private int error_total;
        /**
         * 已锁定的域名总数
         */
        private int lock_total;
        /**
         * 已被封禁的域名总数
         */
        private int spam_total;
        /**
         * VIP 即将到期的域名总数(30天之内)
         */
        private int vip_expire;
        /**
         * 共享出去的域名总数
         */
        private int share_out_total;

        public int getDomain_total() {
            return domain_total;
        }

        public void setDomain_total(int domain_total) {
            this.domain_total = domain_total;
        }

        public int getAll_total() {
            return all_total;
        }

        public void setAll_total(int all_total) {
            this.all_total = all_total;
        }

        public int getMine_total() {
            return mine_total;
        }

        public void setMine_total(int mine_total) {
            this.mine_total = mine_total;
        }

        public int getShare_total() {
            return share_total;
        }

        public void setShare_total(int share_total) {
            this.share_total = share_total;
        }

        public int getVip_total() {
            return vip_total;
        }

        public void setVip_total(int vip_total) {
            this.vip_total = vip_total;
        }

        public int getIsmark_total() {
            return ismark_total;
        }

        public void setIsmark_total(int ismark_total) {
            this.ismark_total = ismark_total;
        }

        public int getPause_total() {
            return pause_total;
        }

        public void setPause_total(int pause_total) {
            this.pause_total = pause_total;
        }

        public int getError_total() {
            return error_total;
        }

        public void setError_total(int error_total) {
            this.error_total = error_total;
        }

        public int getLock_total() {
            return lock_total;
        }

        public void setLock_total(int lock_total) {
            this.lock_total = lock_total;
        }

        public int getSpam_total() {
            return spam_total;
        }

        public void setSpam_total(int spam_total) {
            this.spam_total = spam_total;
        }

        public int getVip_expire() {
            return vip_expire;
        }

        public void setVip_expire(int vip_expire) {
            this.vip_expire = vip_expire;
        }

        public int getShare_out_total() {
            return share_out_total;
        }

        public void setShare_out_total(int share_out_total) {
            this.share_out_total = share_out_total;
        }
    }

    public static class DomainsBean {
        /**
         * id : 2238269
         * status : enable
         * grade : D_Free
         * group_id : 1
         * searchengine_push : yes
         * is_mark : no
         * ttl : 300
         * cname_speedup : disable
         * remark :
         * created_on : 2015-01-19 08:20:03
         * updated_on : 2015-01-19 18:54:35
         * punycode : xn--vnqp08b.cn
         * ext_status : dnserror
         * name : 我们.cn
         * grade_title : 免费套餐
         * grade_ns : ["ns3.dnsv3.com","ns4.dnsv3.com"]
         * is_vip : no
         * owner : api@dnspod.com
         * records : 4
         * vip_start_at : 2019-07-17 00:00:00
         * vip_end_at : 2020-08-26 23:59:59
         * vip_auto_renew : default
         * auth_to_anquanbao : true
         */
        /**
         * 域名 ID, 即为 domain_id
         */
        private int id;
        /**
         * 域名状态
         * “enable”: 正常
         * “pause”: 已暂停解析
         * “spam”: 已被封禁
         * “lock”: 已被锁定
         */
        private String status;
        /**
         * 域名等级
         * “D_Free”: 旧免费套餐 (旧套餐)
         * “D_Plus”: 个人豪华套餐 (旧套餐)
         * “D_Extra”: 企业Ⅰ (旧套餐)
         * “D_Expert” 企业Ⅱ (旧套餐)
         * “D_Ultra”: 企业Ⅲ (旧套餐)
         * “DP_Free” 免费套餐
         * “DP_Plus”: 个人专业版
         * “DP_Extra”: 企业创业版
         * “DP_Expert”: 企业标准版
         * “DP_Ultra”: 企业旗舰版
         */
        private String grade;
        /**
         * 域名等级对应的ns服务器地址
         */
        private String grage_ns;
        /**
         * 域名分组 ID
         */
        private String group_id;
        /**
         * 是否开启搜索引擎推送功能
         * “yes”: 已开启
         * “no”: 未开启
         */
        private String searchengine_push;
        /**
         * 是否设置域名星标
         * “yes”: 已设置
         * “no”: 未设置
         */
        private String is_mark;
        /**
         * 域名默认的 TTL 值
         */
        private String ttl;
        /**
         * CNAME 加速状态
         * “enable”: 已启用
         * “disable”: 已禁用
         */
        private String cname_speedup;
        /**
         * 域名备注
         */
        private String remark;
        /**
         * 添加域名的时间
         */
        private String created_on;
        /**
         * 域名最后修改时间
         */
        private String updated_on;
        /**
         * 使用 punycode 转码之后的域名
         */
        private String punycode;
        /**
         * 域名扩展的状态
         * “notexist”: 域名没有注册
         * “dnserror”: DNS 设置错误
         * “”: 正常
         */
        private String ext_status;
        /**
         * 域名
         */
        private String name;
        /**
         * 域名等级(中文说明)
         */
        private String grade_title;
        /**
         * 是否是VIP 等级
         * “yes”: 是 VIP
         * “no”: 不是 VIP
         */
        private String is_vip;
        /**
         * 域名所有者
         */
        private String owner;
        /**
         * 域名下记录总条数
         */
        private String records;
        private String vip_start_at;
        private String vip_end_at;
        private String vip_auto_renew;
        private boolean auth_to_anquanbao;
        private List<String> grade_ns;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrage_ns() {
            return grage_ns;
        }

        public void setGrage_ns(String grage_ns) {
            this.grage_ns = grage_ns;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getSearchengine_push() {
            return searchengine_push;
        }

        public void setSearchengine_push(String searchengine_push) {
            this.searchengine_push = searchengine_push;
        }

        public String getIs_mark() {
            return is_mark;
        }

        public void setIs_mark(String is_mark) {
            this.is_mark = is_mark;
        }

        public String getTtl() {
            return ttl;
        }

        public void setTtl(String ttl) {
            this.ttl = ttl;
        }

        public String getCname_speedup() {
            return cname_speedup;
        }

        public void setCname_speedup(String cname_speedup) {
            this.cname_speedup = cname_speedup;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCreated_on() {
            return created_on;
        }

        public void setCreated_on(String created_on) {
            this.created_on = created_on;
        }

        public String getUpdated_on() {
            return updated_on;
        }

        public void setUpdated_on(String updated_on) {
            this.updated_on = updated_on;
        }

        public String getPunycode() {
            return punycode;
        }

        public void setPunycode(String punycode) {
            this.punycode = punycode;
        }

        public String getExt_status() {
            return ext_status;
        }

        public void setExt_status(String ext_status) {
            this.ext_status = ext_status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGrade_title() {
            return grade_title;
        }

        public void setGrade_title(String grade_title) {
            this.grade_title = grade_title;
        }

        public String getIs_vip() {
            return is_vip;
        }

        public void setIs_vip(String is_vip) {
            this.is_vip = is_vip;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getRecords() {
            return records;
        }

        public void setRecords(String records) {
            this.records = records;
        }

        public String getVip_start_at() {
            return vip_start_at;
        }

        public void setVip_start_at(String vip_start_at) {
            this.vip_start_at = vip_start_at;
        }

        public String getVip_end_at() {
            return vip_end_at;
        }

        public void setVip_end_at(String vip_end_at) {
            this.vip_end_at = vip_end_at;
        }

        public String getVip_auto_renew() {
            return vip_auto_renew;
        }

        public void setVip_auto_renew(String vip_auto_renew) {
            this.vip_auto_renew = vip_auto_renew;
        }

        public boolean isAuth_to_anquanbao() {
            return auth_to_anquanbao;
        }

        public void setAuth_to_anquanbao(boolean auth_to_anquanbao) {
            this.auth_to_anquanbao = auth_to_anquanbao;
        }

        public List<String> getGrade_ns() {
            return grade_ns;
        }

        public void setGrade_ns(List<String> grade_ns) {
            this.grade_ns = grade_ns;
        }
    }
}
