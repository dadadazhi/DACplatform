package com.example.btnlongtouch;

import com.example.btnlongtouch.LongTouchBtn.LongTouchListener;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView Tv1;
    private LongTouchBtn Btn1;
    private int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tv1 = (TextView)findViewById(R.id.tv1);
        Btn1 = (LongTouchBtn)findViewById(R.id.btn2);
        Btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Log.i("huahua", "自定义按钮处理单击");

            }
        });
        Btn1.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                Log.i("huahua", "自定义按钮处理长按一次相应");
                return false;
            }
        });

        /**
         * 这是一个自定义的接口 专门负责处理长按逻辑
         *   @param listener
         *            监听器。
         * @param time
         *            第2个参数传入1000 ,表示1秒处理一次onLongTouch()方法
         */
        Btn1.setOnLongTouchListener(new LongTouchListener() {

            @Override
            public void onLongTouch() {
                num++;
                Tv1.setText(num+"");
                Log.i("huahua", "正在长按");

            }
        },1000);
    }
}