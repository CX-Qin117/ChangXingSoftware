package com.example.changxingapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class zhuceActivity extends AppCompatActivity {
    private EditText zhanghao;
    private EditText password;
    private EditText apassword;
    private Button azhuce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        zhanghao = findViewById(R.id.et_3);
        password = findViewById(R.id.et_4);
        apassword = findViewById(R.id.et_5);
        azhuce = findViewById(R.id.bt_zhuce);
        azhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpd = password.getText().toString().trim();
                String strapd = apassword.getText().toString().trim();
                String strzh = zhanghao.getText().toString().trim();
                if(TextUtils.isEmpty(strpd)||TextUtils.isEmpty(strapd)||TextUtils.isEmpty(strzh)){
                    Toast.makeText(zhuceActivity.this, "请输入正确的账号和密码，并确认密码", Toast.LENGTH_LONG).show();
                }
                else{
                    if(!(strpd.equals(strapd))){
                        Toast.makeText(zhuceActivity.this, "两次输入的密码不同，请重新输入", Toast.LENGTH_LONG).show();
                    }
                else {
                    if(strpd.equals(strapd))
                    Toast.makeText(zhuceActivity.this, "注册成功", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(zhuceActivity.this, MainActivity.class);
                    startActivity(intent);
                }


            }
        }
    });
}
}