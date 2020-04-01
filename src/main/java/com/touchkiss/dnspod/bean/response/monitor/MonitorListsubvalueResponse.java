package com.touchkiss.dnspod.bean.response.monitor;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 17:34
 *
 * @author Touchkiss
 */
public class MonitorListsubvalueResponse extends BaseResponse {

    /**
     * domain : {"id":2317346,"name":"testapi.com","punycode":"testapi.com","grade":"D_Plus"}
     * points : {"max":999,"list":{"ctc":"电信","cuc":"联通"}}
     * records : [{"id":"16909160","area":"默认","value":"119.180.24.194"}]
     */

    private DomainBean domain;
    private PointsBean points;
    private List<RecordsBean> records;

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

    public DomainBean getDomain() {
        return domain;
    }

    public void setDomain(DomainBean domain) {
        this.domain = domain;
    }

    public PointsBean getPoints() {
        return points;
    }

    public void setPoints(PointsBean points) {
        this.points = points;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public enum StatusCode {
        _6(6, "当前域名有误，请返回重新操作"),
        _7(7, "域名编号错误");
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
         */

        private int id;
        private String name;
        private String punycode;
        private String grade;

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
    }

    public static class PointsBean {
        /**
         * max : 999
         * list : {"ctc":"电信","cuc":"联通"}
         */

        private int max;
        private ListBean list;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * ctc : 电信
             * cuc : 联通
             */

            private String ctc;
            private String cuc;

            public String getCtc() {
                return ctc;
            }

            public void setCtc(String ctc) {
                this.ctc = ctc;
            }

            public String getCuc() {
                return cuc;
            }

            public void setCuc(String cuc) {
                this.cuc = cuc;
            }
        }
    }

    public static class RecordsBean {
        /**
         * id : 16909160
         * area : 默认
         * value : 119.180.24.194
         */

        private String id;
        private String area;
        private String value;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
