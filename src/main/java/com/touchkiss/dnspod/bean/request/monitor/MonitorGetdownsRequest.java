package com.touchkiss.dnspod.bean.request.monitor;

import com.touchkiss.dnspod.bean.request.BaseRequest;
import com.touchkiss.dnspod.bean.response.monitor.MonitorGetdownsResponse;
import com.touchkiss.dnspod.constants.URLConstants;

/**
 * Created on 2020/03/31 18:21
 *
 * @author Touchkiss
 */
public class MonitorGetdownsRequest extends BaseRequest<MonitorGetdownsResponse> {
    /**
     * 非必须
     * 记录开始的偏移，第一条记录为 0，依次类推
     */
    private int offset;
    /**
     * 非必须
     * 共要获取的记录的数量，比如获取20条，则为20
     */
    private int length;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Class getRequestClass() {
        return this.getClass();
    }

    @Override
    public Class<MonitorGetdownsResponse> getResponseClass() {
        return MonitorGetdownsResponse.class;
    }

    @Override
    public URLConstants getURLInfo() {
        return URLConstants.MONITOR_GET_DOWNS;
    }
}
