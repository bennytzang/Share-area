package com.example.osfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity_cur extends AppCompatActivity {
    private int gridHeight,gridWidth;
    private RelativeLayout layout;
    private RelativeLayout tmpLayout;
    private static boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cur);
        tmpLayout = (RelativeLayout) findViewById(R.id.Monday);
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(isFirst) {
            isFirst = false;
            gridWidth = tmpLayout.getWidth();
            gridHeight = tmpLayout.getHeight()/12;
        }
    }





    private EditText created(int start,int end,String text)
    {
        EditText et = new EditText(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(gridWidth,gridHeight*(end - start+1));
        et.setY(gridHeight*(start-1));
        et.setLayoutParams(params);
        et.setGravity(Gravity.CENTER);
        et.setText(text);

        return et;
    }
    private void addView(int i,int start,int end,String text) {
        EditText et;
        switch (i){
            case 1:
                layout = (RelativeLayout) findViewById(R.id.Monday);
                break;
            case 2:
                layout = (RelativeLayout) findViewById(R.id.Tuesday);
                break;
            case 3:
                layout = (RelativeLayout) findViewById(R.id.Wednesday);
                break;
            case 4:
                layout = (RelativeLayout) findViewById(R.id.Thursday);
                break;
            case 5:
                layout = (RelativeLayout) findViewById(R.id.Friday);
                break;
            case 6:
                layout = (RelativeLayout) findViewById(R.id.Saturday);
                break;
            case 7:
                layout = (RelativeLayout) findViewById(R.id.Sunday);
                break;
        }
        et= created(start,end,text);
         et.setBackgroundColor(Color.argb(100,start*5,(start)*20,0));
        // et.setTextSize(12);
        layout.addView(et);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        int i ,j;
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent();
            intent.setClass(MainActivity_cur.this, MainActivity_cur2.class);
            startActivity(intent);
            String t = " " ;

            addView(1,1,2,t);
            addView(7,2,3,t);
            addView(5,9,10,t);
            addView(4,2,3,t);
            addView(3,5,5,t);
            addView(4,10,12,t);

            for (i = 1; i < 13; i++) {
                for (j = 1; j < 8; j++) {
                    addView(j, i, 1, t);
                }
            }
            for (i = 1; i < 8; i++) {
                addView(i, 2, 2, t);
            }
            return true;
        }
        if(id == R.id.action_save)
        {

        }

        return super.onOptionsItemSelected(item);
    }


}


