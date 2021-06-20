package com.example.changxingapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GongnengActivity extends AppCompatActivity {
    private Button btnxioaxi;
    private Button btnwode;
    private Button btnshouye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gongneng);
        btnxioaxi=findViewById(R.id.bt_xiaoxi);
        btnwode=findViewById(R.id.bt_wode);
        btnshouye=findViewById(R.id.bt_shouye);
        btnshouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GongnengActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
        btnwode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GongnengActivity.this, WodeActivity.class);
                startActivity(intent);
            }
        });
        btnxioaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GongnengActivity.this, XiaoxiActivity.class);
                startActivity(intent);
            }
        });
    }
}