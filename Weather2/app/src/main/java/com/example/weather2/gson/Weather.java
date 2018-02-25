package com.example.weather2.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 智治 on 2018/2/19.
 */

public class Weather {
    public String status;
    public com.example.weather2.gson.Basic basic;
    public com.example.weather2.gson.AQI aqi;
    public com.example.weather2.gson.Now now;
    public com.example.weather2.gson.Update update;
    @SerializedName("daily_forecast")
    public List<com.example.weather2.gson.Forecast> forecastList;
    @SerializedName("lifestyle")
    public List<com.example.weather2.gson.Suggestion> suggestionList;
}
