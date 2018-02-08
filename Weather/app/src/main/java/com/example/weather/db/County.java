package com.example.weather.db;

/**
 * Created by 智治 on 2018/2/8.
 */

import org.litepal.crud.DataSupport;


/**
 * Created by 智治 on 2018/2/8.
 */

public class County extends DataSupport {
    private int id;
    private  String countyName;
    private  String weatherId;
    private  int cityId;
    public int getId(){
        return id;
    }
    public void  setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyNameName(String countyName)
    {
        this.countyName=countyName;
    }
    public  String getWeatherCoId(){
        return weatherId;
    }
    public void setWeatherId(String countyName){
        this.countyName=countyName;
    }
    public int getCityId()
    {
        return cityId;
    }
    public void setCityId(int cityId)
    {
        this.cityId=cityId;
    }




}

