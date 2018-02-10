package com.example.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 智治 on 2018/2/10.
 */

public class HttpUtil {
    public static void sendOkHtpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request=new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}