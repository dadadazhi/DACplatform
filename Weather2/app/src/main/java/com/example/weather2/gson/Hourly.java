package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bzz on 2018/3/1.
 */

public class Hourly {
    @SerializedName("time")
    public String htime;
    @SerializedName("tmp")
    public String htmp;
    @SerializedName("cond_text")
    public String hcond;
}
