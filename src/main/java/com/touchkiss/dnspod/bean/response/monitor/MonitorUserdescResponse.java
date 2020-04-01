package com.touchkiss.dnspod.bean.response.monitor;

import com.touchkiss.dnspod.bean.response.BaseResponse;

/**
 * Created on 2020/03/31 18:17
 *
 * @author Touchkiss
 */
public class MonitorUserdescResponse extends BaseResponse {
    /**
     * desc : {"unmoniting_count":3,"moniting_count":1,"down_count":1}
     * user : {"max_count":28,"use_count":1}
     */

    private DescBean desc;
    private UserBean user;

    public DescBean getDesc() {
        return desc;
    }

    public void setDesc(DescBean desc) {
        this.desc = desc;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class DescBean {
        /**
         * unmoniting_count : 3
         * moniting_count : 1
         * down_count : 1
         */

        private int unmoniting_count;
        private int moniting_count;
        private int down_count;

        public int getUnmoniting_count() {
            return unmoniting_count;
        }

        public void setUnmoniting_count(int unmoniting_count) {
            this.unmoniting_count = unmoniting_count;
        }

        public int getMoniting_count() {
            return moniting_count;
        }

        public void setMoniting_count(int moniting_count) {
            this.moniting_count = moniting_count;
        }

        public int getDown_count() {
            return down_count;
        }

        public void setDown_count(int down_count) {
            this.down_count = down_count;
        }
    }

    public static class UserBean {
        /**
         * max_count : 28
         * use_count : 1
         */

        private int max_count;
        private int use_count;

        public int getMax_count() {
            return max_count;
        }

        public void setMax_count(int max_count) {
            this.max_count = max_count;
        }

        public int getUse_count() {
            return use_count;
        }

        public void setUse_count(int use_count) {
            this.use_count = use_count;
        }
    }
}
