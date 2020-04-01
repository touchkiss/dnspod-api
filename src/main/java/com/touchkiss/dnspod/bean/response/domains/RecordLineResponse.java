package com.touchkiss.dnspod.bean.response.domains;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 16:05
 *
 * @author Touchkiss
 */
public class RecordLineResponse extends BaseResponse {

    /**
     * line_ids : {"默认":0,"国内":"7=0","国外":"3=0","电信":"10=0","联通":"10=1","教育网":"10=2","移动":"10=3","百度":"90=0","谷歌":"90=1","搜搜":"90=4","有道":"90=2","必应":"90=3","搜狗":"90=5","奇虎":"90=6","搜索引擎":"80=0"}
     * lines : ["默认","国内","国外","电信","联通","教育网","移动","百度","谷歌","搜搜","有道","必应","搜狗","奇虎","搜索引擎"]
     */

    private LineIdsBean line_ids;
    private List<String> lines;

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

    public LineIdsBean getLine_ids() {
        return line_ids;
    }

    public void setLine_ids(LineIdsBean line_ids) {
        this.line_ids = line_ids;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public enum StatusCode {
        _6(6, "域名ID错误、域名等级错误"),
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

    public static class LineIdsBean {
        /**
         * 默认 : 0
         * 国内 : 7=0
         * 国外 : 3=0
         * 电信 : 10=0
         * 联通 : 10=1
         * 教育网 : 10=2
         * 移动 : 10=3
         * 百度 : 90=0
         * 谷歌 : 90=1
         * 搜搜 : 90=4
         * 有道 : 90=2
         * 必应 : 90=3
         * 搜狗 : 90=5
         * 奇虎 : 90=6
         * 搜索引擎 : 80=0
         */

        private int 默认;
        private String 国内;
        private String 国外;
        private String 电信;
        private String 联通;
        private String 教育网;
        private String 移动;
        private String 百度;
        private String 谷歌;
        private String 搜搜;
        private String 有道;
        private String 必应;
        private String 搜狗;
        private String 奇虎;
        private String 搜索引擎;

        public int get默认() {
            return 默认;
        }

        public void set默认(int 默认) {
            this.默认 = 默认;
        }

        public String get国内() {
            return 国内;
        }

        public void set国内(String 国内) {
            this.国内 = 国内;
        }

        public String get国外() {
            return 国外;
        }

        public void set国外(String 国外) {
            this.国外 = 国外;
        }

        public String get电信() {
            return 电信;
        }

        public void set电信(String 电信) {
            this.电信 = 电信;
        }

        public String get联通() {
            return 联通;
        }

        public void set联通(String 联通) {
            this.联通 = 联通;
        }

        public String get教育网() {
            return 教育网;
        }

        public void set教育网(String 教育网) {
            this.教育网 = 教育网;
        }

        public String get移动() {
            return 移动;
        }

        public void set移动(String 移动) {
            this.移动 = 移动;
        }

        public String get百度() {
            return 百度;
        }

        public void set百度(String 百度) {
            this.百度 = 百度;
        }

        public String get谷歌() {
            return 谷歌;
        }

        public void set谷歌(String 谷歌) {
            this.谷歌 = 谷歌;
        }

        public String get搜搜() {
            return 搜搜;
        }

        public void set搜搜(String 搜搜) {
            this.搜搜 = 搜搜;
        }

        public String get有道() {
            return 有道;
        }

        public void set有道(String 有道) {
            this.有道 = 有道;
        }

        public String get必应() {
            return 必应;
        }

        public void set必应(String 必应) {
            this.必应 = 必应;
        }

        public String get搜狗() {
            return 搜狗;
        }

        public void set搜狗(String 搜狗) {
            this.搜狗 = 搜狗;
        }

        public String get奇虎() {
            return 奇虎;
        }

        public void set奇虎(String 奇虎) {
            this.奇虎 = 奇虎;
        }

        public String get搜索引擎() {
            return 搜索引擎;
        }

        public void set搜索引擎(String 搜索引擎) {
            this.搜索引擎 = 搜索引擎;
        }
    }
}
