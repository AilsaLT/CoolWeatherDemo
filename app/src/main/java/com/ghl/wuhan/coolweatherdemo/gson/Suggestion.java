package com.ghl.wuhan.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.gson
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/24 10:59
 * 修改人：Liting
 * 修改时间：2019/8/24 10:59
 * 修改备注：
 * 版本：
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
