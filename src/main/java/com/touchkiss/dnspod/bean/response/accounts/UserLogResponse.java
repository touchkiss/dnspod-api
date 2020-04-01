package com.touchkiss.dnspod.bean.response.accounts;

import com.touchkiss.dnspod.bean.response.BaseResponse;

import java.util.List;

/**
 * Created on 2020/03/31 10:04
 *
 * @author Touchkiss
 */
public class UserLogResponse extends BaseResponse {

    private List<String> log;

    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }
}
