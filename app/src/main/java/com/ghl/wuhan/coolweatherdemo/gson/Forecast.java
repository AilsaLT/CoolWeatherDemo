package com.ghl.wuhan.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.gson
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/24 11:04
 * 修改人：Liting
 * 修改时间：2019/8/24 11:04
 * 修改备注：
 * 版本：
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
