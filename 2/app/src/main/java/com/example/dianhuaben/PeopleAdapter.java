package com.example.dianhuaben;

/**
 * Created by 智治 on 2018/1/30.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {

    private int resourceId;
    //private ImageView img_fruit;
    //private TextView tv_fruit;

    public PeopleAdapter(Context context, int textViewResourceId,
                         List<String> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        People people = getItem(position); // 获取当前项的people实例
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.peopleImage = (ImageView) view.findViewById (R.id.people_image);
            viewHolder.peopleName = (TextView) view.findViewById (R.id.people_name);
            view.setTag(viewHolder); // 将ViewHolder存储在View中
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag(); // 重新获取ViewHolder
        }
        viewHolder.peopleImage.setImageResource(people.getImgId());
        viewHolder.peopleName.setText(people.getName());
        return view;
    }

    class ViewHolder {

        ImageView peopleImage;

        TextView peopleName;

    }

}
