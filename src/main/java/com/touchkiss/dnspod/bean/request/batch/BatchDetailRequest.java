package com.touchkiss.dnspod.bean.request.batch;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.batch.BatchDetailResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 17:18
 *
 * @author Touchkiss
 */
public class BatchDetailRequest extends BaseRequest<BatchDetailResponse> {
    /**
     * 必须
     * 任务ID
     */
    private String job_id;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<BatchDetailResponse> getResponseClass() {
        return BatchDetailResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.BATCH_DETAIL;
    }
}
