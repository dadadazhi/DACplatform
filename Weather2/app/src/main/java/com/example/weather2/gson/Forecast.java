package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 智治 on 2018/2/19.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp_max")
    public String max;
    @SerializedName("tmp_min")
    public String min;
    @SerializedName("cond_txt_d")
    public String info;


}
