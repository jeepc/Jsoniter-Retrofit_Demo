package com.jeepc.jsoniter_retrofit_demo;

import java.util.List;

/**
 * Created by jeepc on 2017/10/10.
 */

public class Logistics {

    /**
     * message : ok
     * nu : 11111111111
     * ischeck : 0
     * condition : B00
     * com : yuantong
     * status : 200
     * state : 1
     * data : [{"time":"2017-09-26 11:24:53","ftime":"2017-09-26 11:24:53","context":"南航大活圆通代理点取件妈妈驿站已发出自提短信,请上门自提,如有疑问请联系18014730012","location":null},{"time":"2017-09-26 11:24:52","ftime":"2017-09-26 11:24:52","context":"快件已到达南航大活圆通代理点取件妈妈驿站,如有疑问请联系18014730012","location":null},{"time":"2017-09-01 20:12:51","ftime":"2017-09-01 20:12:51","context":"环东广场圆通快递云兰租车部妈妈驿站已发出自提短信,请上门自提,如有疑问请联系18552351543","location":null},{"time":"2017-09-01 20:12:51","ftime":"2017-09-01 20:12:51","context":"快件已到达环东广场圆通快递云兰租车部妈妈驿站,如有疑问请联系18552351543","location":null},{"time":"2017-08-30 09:02:31","ftime":"2017-08-30 09:02:31","context":"圆通合作点【收发室】快件已到达前台驿站,如有疑问请联系13337713618","location":null},{"time":"2017-08-23 09:12:48","ftime":"2017-08-23 09:12:48","context":"东师人文西校区快递中心妈妈驿站已发出自提短信,请上门自提,如有疑问请联系17743125815","location":null},{"time":"2017-08-23 09:12:48","ftime":"2017-08-23 09:12:48","context":"快件已到达东师人文西校区快递中心妈妈驿站,如有疑问请联系17743125815","location":null},{"time":"2017-07-24 21:17:01","ftime":"2017-07-24 21:17:01","context":"快件已到达派送中妈妈驿站,如有疑问请联系63762999","location":null},{"time":"2017-07-19 11:51:15","ftime":"2017-07-19 11:51:15","context":"快件已到达寨沙移动公司正对面圆通快递点妈妈驿站,如有疑问请联系13677824226","location":null},{"time":"2017-06-22 13:26:09","ftime":"2017-06-22 13:26:09","context":"快件已到达联盟路与向阳交叉南100米圆通妈妈驿站,如有疑问请联系13014796333","location":null},{"time":"2017-06-22 13:26:09","ftime":"2017-06-22 13:26:09","context":"联盟路与向阳交叉南100米圆通妈妈驿站已发出自提短信,请上门自提,如有疑问请联系13014796333","location":null},{"time":"2017-06-07 11:21:03","ftime":"2017-06-07 11:21:03","context":"快件已到达北服小北门圆通速递妈妈驿站,如有疑问请联系13370110797","location":null},{"time":"2017-06-07 11:21:03","ftime":"2017-06-07 11:21:03","context":"北服小北门圆通速递妈妈驿站已发出自提短信,请上门自提,如有疑问请联系13370110797","location":null}]
     */

    private String message;
    private String nu;

    @Override
    public String toString() {
        return "Logistics{" +
                "message='" + message + '\'' +
                ", nu='" + nu + '\'' +
                ", ischeck='" + ischeck + '\'' +
                ", condition='" + condition + '\'' +
                ", com='" + com + '\'' +
                ", status='" + status + '\'' +
                ", state='" + state + '\'' +
                ", data=" + data +
                '}';
    }

    private String ischeck;
    private String condition;
    private String com;
    private String status;
    private String state;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * time : 2017-09-26 11:24:53
         * ftime : 2017-09-26 11:24:53
         * context : 南航大活圆通代理点取件妈妈驿站已发出自提短信,请上门自提,如有疑问请联系18014730012
         * location : null
         */

        private String time;
        private String ftime;
        private String context;
        private Object location;

        @Override
        public String toString() {
            return "DataBean{" +
                    "time='" + time + '\'' +
                    ", ftime='" + ftime + '\'' +
                    ", context='" + context + '\'' +
                    ", location=" + location +
                    '}';
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getFtime() {
            return ftime;
        }

        public void setFtime(String ftime) {
            this.ftime = ftime;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public Object getLocation() {
            return location;
        }

        public void setLocation(Object location) {
            this.location = location;
        }
    }
}
