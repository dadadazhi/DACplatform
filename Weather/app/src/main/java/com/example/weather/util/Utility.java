package com.example.weather.util;

import android.text.TextUtils;

import com.example.weather.db.City;
import com.example.weather.db.Province;
import com.example.weather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 智治 on 2018/2/10.
 */

public class Utility {
    /**
     * 解析处理服务器传回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject province0bject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(province0bject.getString("name"));
                    province.setProvinceCode(province0bject.getInt(" id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /*解析处理服务器传回的县级数据*/
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject county0bject = allCounties.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(county0bject.getString("name"));
                    province.setProvinceCode(county0bject.getInt(" id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /*解析处理服务器传回的市级数据*/
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject city0bject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(city0bject.getString("name"));
                    city.setCityCode(city0bject.getInt(" id"));
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static Weather handleWeatherResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("Heweather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }//将返回的JOSN数据解析成weather实体类
}
