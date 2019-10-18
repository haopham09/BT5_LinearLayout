package com.thohao.baitap05_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn01, btn02, btn03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controller();

    }
    private void Controller(){
        btn01=(Button)findViewById(R.id.btn_01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Layout01_Activity.class);
                startActivity(intent);
            }
        });
        btn02=(Button)findViewById(R.id.btn_02);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Layout02_Activity.class);
                startActivity(intent);
            }
        });
        btn03=(Button)findViewById(R.id.btn_03);
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Layout03_Activity.class);
                startActivity(intent);
            }
        });
    }
}
