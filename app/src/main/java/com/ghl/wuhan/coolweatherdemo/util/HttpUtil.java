package com.ghl.wuhan.coolweatherdemo.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.util
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/23 20:24
 * 修改人：Liting
 * 修改时间：2019/8/23 20:24
 * 修改备注：
 * 版本：
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
