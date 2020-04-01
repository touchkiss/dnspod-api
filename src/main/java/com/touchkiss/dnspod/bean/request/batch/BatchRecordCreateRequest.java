package com.touchkiss.dnspod.bean.request.batch;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.batch.BatchRecordCreateResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:04
 *
 * @author Touchkiss
 */
public class BatchRecordCreateRequest extends BaseRequest<BatchRecordCreateResponse> {
    /**
     * 域名ID，多个 domain_id 用英文逗号进行分割
     */
    private String domain_id;
    /**
     * 待批量添加的记录详情，JSON 字符串。形如：
     * [{“sub_domain”:”www,wap,bbs”,”record_type”:”A”,”record_line”:”默认”,”value”:”11.22.33.44”,”ttl”:600}]
     * [{“sub_domain”:”www,wap,bbs”,”record_type”:”A”,”record_line”:”默认”,”value”:”11.22.33.44”,”ttl”:600},{“sub_domain”:””,”record_type”:”MX”,”record_line”:”默认”,”value”:”mx.qq.com”,”ttl”:600,”MX”:10}]
     */
    private String records;

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<BatchRecordCreateResponse> getResponseClass() {
        return BatchRecordCreateResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.BATCH_RECORD_CREATE;
    }

    public static class BatchRecordCreateItem {
        private String sub_domain;
        private String record_type;
        private String record_line;
        private String value;
        private int ttl;

        public String getSub_domain() {
            return sub_domain;
        }

        public void setSub_domain(String sub_domain) {
            this.sub_domain = sub_domain;
        }

        public String getRecord_type() {
            return record_type;
        }

        public void setRecord_type(String record_type) {
            this.record_type = record_type;
        }

        public String getRecord_line() {
            return record_line;
        }

        public void setRecord_line(String record_line) {
            this.record_line = record_line;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getTtl() {
            return ttl;
        }

        public void setTtl(int ttl) {
            this.ttl = ttl;
        }
    }
}
