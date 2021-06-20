package com.example.changxingapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    private Button mBtnlogin;
    private Button mBtnzhuce;
    private EditText Uid;
    private EditText Mima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnlogin = findViewById(R.id.bt_login);
        mBtnzhuce = findViewById(R.id.bt_zhce);
        Uid = findViewById(R.id.et_1);
        Mima = findViewById(R.id.et_2);

        mBtnzhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, zhuceActivity.class);
                startActivity(intent);//跳转到注册页面
            }
        });
        mBtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUid = Uid.getText().toString().trim();
                String strMima = Mima.getText().toString().trim();

                if (strUid.equals("123456") && strMima.equals("123")) {
                    Intent intent = new Intent(MainActivity.this, loginActivity.class);
                    startActivity(intent);// 跳转到登录成功后的界面
                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "用户名和密码输入错误", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}