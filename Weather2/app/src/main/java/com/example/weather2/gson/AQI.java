package com.example.weather2.gson;

/**
 * Created by 智治 on 2018/2/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
