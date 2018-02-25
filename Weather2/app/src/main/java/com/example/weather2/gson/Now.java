package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 智治 on 2018/2/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String info;
    @SerializedName("wind_dir")
    public String winddir;
    @SerializedName("wind_sc")
    public String windsc;

}
