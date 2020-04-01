package com.touchkiss.dnspod;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.io.IOException;

/**
 * Created on 2020/03/31 11:13
 *
 * @author Touchkiss
 */
public interface BaseClient {
    <T extends BaseResponse> BaseResponse doAction(BaseRequest<T> request) throws IOException;

    <T extends BaseResponse> BaseResponse doAction(BaseRequest<T> request, boolean autoRetry, int maxRetryCounts);
}
