package com.example.changxingapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WodeActivity extends AppCompatActivity {
    private Button btnGongneng;
    private Button btnxioaxi;
    private Button btnshouye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wode);
        btnGongneng=findViewById(R.id.bt_gongneng);
        btnxioaxi=findViewById(R.id.bt_xiaoxi);
        btnshouye=findViewById(R.id.bt_shouye);
        btnshouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WodeActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
        btnxioaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WodeActivity.this, XiaoxiActivity.class);
                startActivity(intent);
            }
        });
        btnGongneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WodeActivity.this, GongnengActivity.class);
                startActivity(intent);
            }
        });
    }
}