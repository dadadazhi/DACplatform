package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 智治 on 2018/2/19.
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
