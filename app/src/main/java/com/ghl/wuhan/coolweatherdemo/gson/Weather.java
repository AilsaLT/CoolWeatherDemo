package com.ghl.wuhan.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.gson
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/24 11:07
 * 修改人：Liting
 * 修改时间：2019/8/24 11:07
 * 修改备注：
 * 版本：
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
