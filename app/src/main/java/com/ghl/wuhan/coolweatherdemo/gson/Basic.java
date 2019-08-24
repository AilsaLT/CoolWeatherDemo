package com.ghl.wuhan.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.gson
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/24 10:52
 * 修改人：Liting
 * 修改时间：2019/8/24 10:52
 * 修改备注：
 * 版本：
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
