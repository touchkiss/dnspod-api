package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorModifyResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:49
 *
 * @author Touchkiss
 */
public class MonitorModifyRequest extends BaseRequest<MonitorModifyResponse> {
    /**
     * 监控编号，必选
     */
    private int monitor_id;
    /**
     * 监控端口，比如80，必选
     */
    private int port;
    /**
     * 监控间隔，支持{60|180|360|}，必选
     */
    private int monitor_interval;
    /**
     * 监控类型，支持{http|https|cname|url}，必选
     */
    private String monitor_type;
    /**
     * 监控路径，比如/，必选
     */
    private String monitor_path;
    /**
     * 监控节点，用,分隔多个，只能选择列表中的节点，并且有数量限制，必选
     */
    private String points;
    /**
     * 宕机备用，必选，支持任选以下选项中的一个：
     * pass 只监控，不切换
     * pause 老版智能暂停功能，详见https://support.dnspod.cn/Kb/showarticle/tsid/179
     * pause2 智能暂停v2, 发现ip宕机后直接暂停该记录，无其它规则
     * auto 智能切换
     * 用逗号分隔的IP 设置备用IP
     */
    private String bak_ip;
    /**
     * 监控主机头，比如 www.dnspod.cn，可选
     */
    private String host;
    /**
     * {yes|no} 宕机切换后是否修改ttl，可选，默认为 no
     */
    private String keep_ttl;
    /**
     * 短信通知，me域名所有者，share共享用户，用,分隔多选择，比如me,share, 可选
     */
    private String sms_notice;
    /**
     * 邮件通知，me域名所有者，share共享用户，用,分隔多选择，比如me,share，可选
     */
    private String email_notice;
    /**
     * {yes|no}是否一个小时内只发一次通知，可选
     */
    private String less_notice;
    /**
     * 可选，回调URL，宕机了会将相关的参数提交到此设置的URL，具体参考回调URL说明，可选
     */
    private String callback_url;
    /**
     * 可选，回调密钥，如果设置了回调URL请设置此参数以保证安全，可选
     */
    private String callback_key;

    public int getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(int monitor_id) {
        this.monitor_id = monitor_id;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMonitor_interval() {
        return monitor_interval;
    }

    public void setMonitor_interval(int monitor_interval) {
        this.monitor_interval = monitor_interval;
    }

    public String getMonitor_type() {
        return monitor_type;
    }

    public void setMonitor_type(String monitor_type) {
        this.monitor_type = monitor_type;
    }

    public String getMonitor_path() {
        return monitor_path;
    }

    public void setMonitor_path(String monitor_path) {
        this.monitor_path = monitor_path;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getBak_ip() {
        return bak_ip;
    }

    public void setBak_ip(String bak_ip) {
        this.bak_ip = bak_ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getKeep_ttl() {
        return keep_ttl;
    }

    public void setKeep_ttl(String keep_ttl) {
        this.keep_ttl = keep_ttl;
    }

    public String getSms_notice() {
        return sms_notice;
    }

    public void setSms_notice(String sms_notice) {
        this.sms_notice = sms_notice;
    }

    public String getEmail_notice() {
        return email_notice;
    }

    public void setEmail_notice(String email_notice) {
        this.email_notice = email_notice;
    }

    public String getLess_notice() {
        return less_notice;
    }

    public void setLess_notice(String less_notice) {
        this.less_notice = less_notice;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public String getCallback_key() {
        return callback_key;
    }

    public void setCallback_key(String callback_key) {
        this.callback_key = callback_key;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorModifyResponse> getResponseClass() {
        return MonitorModifyResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_MODIFY;
    }
}
