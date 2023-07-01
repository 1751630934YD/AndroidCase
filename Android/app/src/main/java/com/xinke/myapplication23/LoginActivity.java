package com.xinke.myapplication23;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity{
    EditText user;
    EditText password;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    TextView reg=findViewById(R.id.reg);
    Intent t=new Intent();
    Button btn=findViewById(R.id.GotoMain);
//    btn.setOnClickListener(Btn());
    EditText user=findViewById(R.id.loginuser);

    EditText password=findViewById(R.id.loginpassword);

    this.user=user;
    this.password=password;
    user.setText(t.getStringExtra("User"));
    password.setText(t.getStringExtra("Password"));

        }

    public void onclick(View v) {
//        Intent t=new Intent(LoginActivity.this, RegistrationActivity.class);
//        startActivity(t);
        showExitDialog02();


    }
    public void onMian(View v) {
    if (user.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
      Intent t=new Intent(LoginActivity.this, MainActivity.class);
        startActivity(t);
    }
    else {
        Log.i("user",user.getText().toString());
        showExitDialog03();
    }

    }

    private void showExitDialog02(){
        new AlertDialog.Builder(this)
                .setTitle("提示")
                .setMessage("账号为：admin\n"+"密码为：admin")
                .setPositiveButton("确定", null)

                .show();
    }
    private void showExitDialog03(){
        new AlertDialog.Builder(this)
                .setTitle("提示")
                .setMessage("账号或密码错误")
                .setPositiveButton("确定", null)

                .show();
    }



}
