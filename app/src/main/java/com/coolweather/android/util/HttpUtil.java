package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by kimdong on 2018/10/8.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();//传入请求地址，并注册一个回调来处理服务器响应
        client.newCall(request).enqueue(callback);
    }
}
