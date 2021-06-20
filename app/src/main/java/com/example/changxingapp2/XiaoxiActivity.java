package com.example.changxingapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class XiaoxiActivity extends AppCompatActivity {
    private Button btnwode;
    private Button btnshouye;
    private Button btnGongneng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaoxi);
        btnwode=findViewById(R.id.bt_wode);
        btnshouye=findViewById(R.id.bt_shouye);
        btnGongneng=findViewById(R.id.bt_gongneng);
        btnGongneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiaoxiActivity.this, GongnengActivity.class);
                startActivity(intent);
            }
        });
        btnshouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiaoxiActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
        btnwode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiaoxiActivity.this, WodeActivity.class);
                startActivity(intent);
            }
        });
    }
}