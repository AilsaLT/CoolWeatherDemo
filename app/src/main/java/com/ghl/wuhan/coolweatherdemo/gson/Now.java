package com.ghl.wuhan.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.gson
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/24 10:57
 * 修改人：Liting
 * 修改时间：2019/8/24 10:57
 * 修改备注：
 * 版本：
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
