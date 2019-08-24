package com.ghl.wuhan.coolweatherdemo.gson;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.gson
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/24 10:55
 * 修改人：Liting
 * 修改时间：2019/8/24 10:55
 * 修改备注：
 * 版本：
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
