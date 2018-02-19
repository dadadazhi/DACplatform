package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 智治 on 2018/2/19.
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
