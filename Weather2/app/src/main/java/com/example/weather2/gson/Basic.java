package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 智治 on 2018/2/19.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

}
