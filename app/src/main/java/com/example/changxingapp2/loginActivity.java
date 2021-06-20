package com.example.changxingapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
public class loginActivity extends AppCompatActivity {
    private Button btnGongneng;
    private Button btnxioaxi;
    private Button btnwode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnGongneng=findViewById(R.id.bt_gongneng);
        btnxioaxi=findViewById(R.id.bt_xiaoxi);
        btnwode=findViewById(R.id.bt_wode);
        btnwode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, WodeActivity.class);
                startActivity(intent);
            }
        });
        btnxioaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, XiaoxiActivity.class);
                startActivity(intent);
            }
        });
        btnGongneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, GongnengActivity.class);
                startActivity(intent);
            }
        });
        }

}