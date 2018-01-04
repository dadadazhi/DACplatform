package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
public class radiobutton extends AppCompatActivity {
    //变量定义
    private EditText editText;
    private String operator="",s="",bzz="";            //操作符：记录 + - * / 符号
    private double n1 , n2 ,Result;     //操作数：操作符两端的数字，n1为左操作数，n2为右操作数。
    private TextView textView;          //文本框：显示计算过程和计算结果
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;   //按钮：十个数字
    private boolean aBoolean =true;
    private NotificationManager manger;
    public static final int TYPE_Normal = 1;
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v == editText) {
            menu.add(0, 1, 0, "复制");
            menu.add(0, 2, 0, "粘贴");
            menu.add(0, 3, 0, "关闭");

        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                bzz=(String)editText.getText().toString().subSequence(1, editText.getText().toString().length());
                editText.setText("");
                textView.setText("");
                operator="";
                s="";
                break;
            case 2:
                textView.setText("");
                editText.setText(bzz);
                operator="";
                s="";
                break;
            case 3:
                onDialogClick1();
                break;

        }
        return true;
    }
    private View.OnClickListener lisenter = new View.OnClickListener() {//侦听器
        @Override
        public void onClick(View view) {//点击事件

            editText.setCursorVisible(false);//隐藏输入框光标
            String str;
            Button button = (Button)view;   //把点击获得的id信息传递给button
            DecimalFormat MyFormat = new DecimalFormat("###.##");//控制Double转为String的格式

            try{
                switch(button.getId())//获取点击按钮的ID，通过ID选择对应的选项执行
                {
                    case R.id.button1://如果点击了按钮：“1”
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + 1);//输入框末尾，添加一个“1”
                        break;
                    }
                    case R.id.button2://2
                    {
                        if(!aBoolean&&bzz.equals(""))
                        {
                            editText.setText("");
                            textView.setText("");
                            aBoolean=true;
                        }
                        editText.setText(editText.getText().toString() + 2);
                        break;
                    }
                    case R.id.button3://3
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + 3);
                        break;
                    }
                    case R.id.button4://4
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + + 4);
                        break;
                    }
                    case R.id.button5://5
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() + 5);
                        break;
                    }
                    case R.id.button6://6
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() +  6);
                        break;
                    }
                    case R.id.button7://7
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() +  7);
                        break;
                    }
                    case R.id.button8://8
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        editText.setText(editText.getText().toString() +   8);
                        break;
                    }
                    case R.id.button9://9
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }

                        editText.setText(editText.getText().toString() +  9);
                        break;
                    }
                    case R.id.button0://0
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText("");
                        textView.setText("");
                        aBoolean=true;
                    }
                        str = editText.getText().toString();
                        //此处可以考虑添加代码，限制用户输入00,000等 2017.6.15
                        editText.setText(str + 0);
                        break;
                    }
                    case R.id.buttonqing://Clear
                    {
                        editText.setText("");
                        textView.setText("");
                        s="";
                        Result = 0;
                        operator="";
                        n1=0;
                        n2=0;
                        Toast.makeText(getApplicationContext(),"长按换个计算器",Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.buttontui:
                    {
                        editText.setText(editText.getText().toString().substring(0,editText.getText().toString().length()-1));
                        break;
                    }
                    case R.id.buttonbian:
                        if(!aBoolean&&bzz.equals(""))
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                    {   if(editText.getText().toString().subSequence(0, 1).equals("-"))
                    {
                        editText.setText(editText.getText().toString().substring(1,editText.getText().toString().length()));
                    }
                    else
                    {
                        editText.setText("-"+editText.getText().toString());
                    }

                        break;
                    }
                    case R.id.buttondian://.
                    {
                        if(!aBoolean&&bzz.equals(""))
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        str = editText.getText().toString();
                        if(str.indexOf(".") != -1) //判断字符串中是否已包含小数点，如果有，就什么也不做
                        {}
                        else //如果没有小数点
                        {
                            if(str.equals("0"))//如果开始为0
                                editText.setText(("0" + ".").toString());
                            else if(str.equals(""))//如果初时显示为空，就什么也不做
                            {}
                            else
                                editText.setText(str + ".");
                        }
                        break;
                    }
                    case R.id.buttonjia://操作符+
                    {
                        if(!aBoolean&&bzz.equals(""))
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "+";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");
                        }
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                operator = "+";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                operator = "+";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "×")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                operator = "+";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                operator = "+";
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if(n2 == 0)
                                {
                                    textView.setText(textView.getText().toString()  + editText.getText().toString());
                                    editText.setText("=∞");
                                    Toast.makeText(getApplicationContext(),"除数不能为零",Toast.LENGTH_LONG).show();
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }
                    case R.id.buttonjian://操作符-
                    {
                        if(!aBoolean&&bzz.equals(""))
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "-";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");}
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                s=MyFormat.format(Result);
                                operator = "-";
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                s=MyFormat.format(Result);
                                operator = "-";
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "×")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                s=MyFormat.format(Result);
                                operator = "-";
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                operator = "-";
                                if(n2 == 0)
                                {
                                    textView.setText(textView.getText().toString()  + editText.getText().toString());
                                    editText.setText("=∞");
                                    Toast.makeText(getApplicationContext(),"除数不能为零",Toast.LENGTH_LONG).show();
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }
                    case R.id.buttoncheng://操作符*
                    {
                        if(!aBoolean&&bzz.equals(""))
                        {
                            editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                            textView.setText("");
                            aBoolean=true;
                        }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "×";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");}
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                operator = "×";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                operator = "×";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "*")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                operator = "×";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                operator = "×";
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if(n2 == 0)
                                {
                                    textView.setText(textView.getText().toString()  + editText.getText().toString());
                                    editText.setText("=∞");
                                    Toast.makeText(getApplicationContext(),"除数不能为零",Toast.LENGTH_LONG).show();
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }

                    case R.id.buttonchu://操作符 /
                    {   if(!aBoolean&&bzz.equals(""))
                    {
                        editText.setText(editText.getText().toString().subSequence(1, editText.getText().toString().length()));
                        textView.setText("");
                        aBoolean=true;
                    }
                        if(s=="")
                        {
                            str = editText.getText().toString();
                            n1 = Double.parseDouble(str);
                        }
                        else
                        {
                            n1=Double.parseDouble(s);
                        }
                        if(operator=="")
                        {
                            operator = "÷";
                            s=editText.getText().toString();
                            textView.setText(editText.getText().toString() + operator);
                            editText.setText("");}
                        else
                        {
                            if(operator == "+")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 + n2;
                                operator = "÷";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "-")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 - n2;
                                operator = "÷";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "×")
                            {
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                Result = n1 * n2;
                                operator = "÷";
                                s=MyFormat.format(Result);
                                textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                editText.setText("");
                            }
                            else if(operator == "÷")
                            {
                                operator = "÷";
                                str = editText.getText().toString();
                                n2 = Double.parseDouble(str);
                                if(n2 == 0)
                                {
                                    textView.setText(textView.getText().toString()  + editText.getText().toString());
                                    editText.setText("=∞");
                                    Toast.makeText(getApplicationContext(),"除数不能为零",Toast.LENGTH_LONG).show();
                                    break;
                                }
                                else
                                {
                                    Result = n1 / n2;
                                    s=MyFormat.format(Result);
                                    textView.setText(textView.getText().toString() +editText.getText().toString() + operator  );
                                    editText.setText("");
                                }
                            }
                        }
                        break;
                    }
                    case R.id.buttonEqual://操作符=
                    {
                        if(operator == "+")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            Result = n1 + n2;
                            textView.setText(textView.getText().toString()  + editText.getText().toString()  );
                            editText.setText("=" +MyFormat.format(Result)+"");
                            operator="";
                            s="";
                            bzz="";


                        }
                        else if(operator == "-")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            Result = n1 - n2;
                            textView.setText(textView.getText().toString()  + editText.getText().toString()   );
                            editText.setText("=" +MyFormat.format(Result)+"");
                            operator="";
                            s="";
                            bzz="";

                        }
                        else if(operator == "×")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            Result = n1 * n2;
                            textView.setText(textView.getText().toString()  + editText.getText().toString()  );
                            editText.setText("=" +MyFormat.format(Result)+"");
                            operator="";
                            s="";
                            bzz="";
                        }
                        else if(operator == "÷")
                        {
                            str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            n1=Double.parseDouble(s);
                            if(n2 == 0)
                            {
                                textView.setText(textView.getText().toString()  + editText.getText().toString());
                                editText.setText("=∞");
                                Toast.makeText(getApplicationContext(),"除数不能为零",Toast.LENGTH_LONG).show();
                                break;
                            }
                            else
                            {
                                Result = n1 / n2;
                                textView.setText(textView.getText().toString()  + editText.getText().toString()  );
                                editText.setText("=" +MyFormat.format(Result)+"");
                                operator="";
                                s="";
                                bzz="";
                            }
                        }
                        aBoolean=false;
                        Toast.makeText(getApplicationContext(),"长按发现更多功能",Toast.LENGTH_LONG).show();
                        if(Result==666)
                        {simpleNotify();}
                        break;
                    }
                    default:
                        break;
                }
            }catch(Exception e){}

        }
    };

    private void simpleNotify(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        //Ticker是状态栏显示的提示
        builder.setTicker("简单Notification");
        //第一行内容  通常作为通知栏标题
        builder.setContentTitle("标题");
        //第二行内容 通常是通知正文
        builder.setContentText("通知内容");
        //第三行内容 通常是内容摘要什么的 在低版本机器上不一定显示
        builder.setSubText("这里显示的是通知第三行内容！");
        //ContentInfo 在通知的右侧 时间的下面 用来展示一些其他信息
        //builder.setContentInfo("2");
        builder.setAutoCancel(true);
        builder.setNumber(2);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.push));
        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(this,1,intent,0);
        builder.setContentIntent(pIntent);
        //设置震动
        long[] vibrate = {100,200,100,200};
        builder.setVibrate(vibrate);
        builder.setDefaults(NotificationCompat.DEFAULT_ALL);
        Notification notification = builder.build();
        manger.notify(TYPE_Normal,notification);

    }
    public void onDialogClick1( ){
        new AlertDialog.Builder(radiobutton.this)
                .setIcon(android.R.drawable.alert_dark_frame)
                .setTitle("注意!!!")
                .setMessage("确定要退出么???")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();//Exit Activity
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                }).create().show();

    }
    private void showPopupMenu(View view) {
        // View当前PopupMenu显示的相对View的位置
        PopupMenu popupMenu = new PopupMenu(this, view);
        // menu布局
        popupMenu.getMenuInflater().inflate(R.menu.main, popupMenu.getMenu());
        // menu的item点击事件
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                if( item.getTitle().equals("复制"))
                {
                    bzz=(String)editText.getText().toString().subSequence(1, editText.getText().toString().length());
                    editText.setText("");
                    textView.setText("");
                    operator="";
                    s="";

                }
                else if( item.getTitle().equals("粘贴"))
                {
                    textView.setText("");
                    editText.setText(bzz);
                    operator="";
                    s="";

                }
                else if ( item.getTitle().equals("关闭"))
                {
                    onDialogClick1();
                }
                return false;
            }
        });

        popupMenu.show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
        manger = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //获取按钮的id
        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.buttonjia);
        btn11= (Button) findViewById(R.id.buttonjian);
        btn12= (Button) findViewById(R.id.buttoncheng);
        btn13= (Button) findViewById(R.id.buttondian);
        btn14= (Button) findViewById(R.id.buttontui);
        btn15= (Button) findViewById(R.id.buttonchu);
        btn16= (Button) findViewById(R.id.buttonbian);
        btn17= (Button) findViewById(R.id.buttonqing);
        btn18= (Button) findViewById(R.id.buttonEqual);
        //为按钮添加监听器
        btn1.setOnClickListener(lisenter);
        btn2.setOnClickListener(lisenter);
        btn3.setOnClickListener(lisenter);
        btn4.setOnClickListener(lisenter);
        btn5.setOnClickListener(lisenter);
        btn6.setOnClickListener(lisenter);
        btn7.setOnClickListener(lisenter);
        btn8.setOnClickListener(lisenter);
        btn9.setOnClickListener(lisenter);
        btn0.setOnClickListener(lisenter);
        btn10.setOnClickListener(lisenter);
        btn11.setOnClickListener(lisenter);
        btn12.setOnClickListener(lisenter);
        btn13.setOnClickListener(lisenter);
        btn14.setOnClickListener(lisenter);
        btn15.setOnClickListener(lisenter);
        btn16.setOnClickListener(lisenter);
        btn17.setOnClickListener(lisenter);
        btn17. setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent();
                intent.setClass(radiobutton.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"就是换个背景。。。",Toast.LENGTH_LONG).show();
                finish();
                return false;
            }

        });
        btn18.setOnClickListener(lisenter);
        btn18. setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                showPopupMenu(btn18);
                return false;
            }

        });
        editText = (EditText)findViewById(R.id.editviewdavid);//与XML中定义好的EditText控件绑定
        textView = (TextView)findViewById(R.id.textviewdavid);//与XML中定义好的TextView控件绑定
        registerForContextMenu(editText);




    }
}