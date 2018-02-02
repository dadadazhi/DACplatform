package com.example.dianhuaben;

import android.app.NotificationManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.NOTIFICATION_SERVICE;

/**
 * Created by 智治 on 2018/1/31.
 */

public class Person extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;
    private TextView name ,number;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person);
        //获取按钮的id
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        name=(TextView)findViewById(R.id.name);
        number=(TextView)findViewById(R.id.number);
        Bundle bundle=getIntent().getExtras();
        name.setText(bundle.getString("displayName"));
        number.setText(bundle.getString("number"));







    }
}
