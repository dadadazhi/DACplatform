package com.example.weather2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weather2.gson.Hourly;

import java.util.List;

/**
 * Created by bzz on 2018/3/1.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private List<Hourly> mHourlyList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView weatherImage;
        TextView weatherHour;
        TextView weatherName;
        public ViewHolder(View view){
            super(view);
            weatherImage =(ImageView)view.findViewById(R.id.weather_image);
            weatherHour=(TextView)view.findViewById(R.id.nowtime);
            weatherName=(TextView)view.findViewById(R.id.weather_name);
        }
    }
    public WeatherAdapter(List<Hourly> hourlyList){
        mHourlyList=hourlyList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.houly_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position)
    {
        Hourly hourly=mHourlyList.get(position);
    }
    @Override
    public int getItemCount(){
        return mHourlyList.size();
    }
}
