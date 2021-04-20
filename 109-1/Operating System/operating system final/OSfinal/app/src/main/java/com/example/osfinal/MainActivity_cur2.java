package com.example.osfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity_cur2 extends AppCompatActivity {
    EditText Sub;
    RadioGroup radioGroup,radioGroup2;
    Button Enter;
    TextView staus;

    int M = -1,N=-1;
    String[]Output = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cur2);
        Sub = (EditText) findViewById(R.id.Sub);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        Enter =(Button)findViewById(R.id.Enter);
        staus = (TextView)findViewById(R.id.staus);

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Sub.getText().toString().equals(""))
                    staus.setText("請輸入科目名稱!!!");
                else if(M==-1)
                    staus.setText("請勾選上課日!!!");
                else if (N==-1)
                    staus.setText("請勾選節數!!!");
                else {

                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.Mon:
                        M=1;
                        break;
                    case R.id.Tue:
                        M=2;
                        break;
                    case R.id.Wen:
                        M=3;
                        break;
                    case R.id.Thr:
                        M=4;
                        break;
                    case R.id.Fri:
                        M=5;
                        break;
                    case R.id.Sat:
                        M=6;
                        break;
                    case R.id.Sun:
                        M=7;
                        break;
                }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (radioGroup2.getCheckedRadioButtonId())
                {
                    case R.id.one:
                        N=1;
                        break;
                    case R.id.two:
                        N=2;
                        break;
                    case R.id.three:
                        N=3;
                        break;
                    case R.id.four:
                        N=4;
                        break;
                    case R.id.five:
                        N=5;
                        break;
                    case R.id.six:
                        N=6;
                        break;
                    case R.id.seven:
                        N=7;
                        break;
                    case R.id.eight:
                        N=8;
                        break;
                    case R.id.nine:
                        N=9;
                        break;
                    case R.id.ten:
                        N=10;
                        break;
                    case R.id.eleven:
                        N=11;
                        break;
                    case R.id.twelve:
                        N=12;
                        break;

                }
            }
        });
    }
}
