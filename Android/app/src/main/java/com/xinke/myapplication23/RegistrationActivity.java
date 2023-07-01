package com.xinke.myapplication23;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ImageView img=findViewById(R.id.Recede);
        final EditText user=findViewById(R.id.User);
        final EditText password=findViewById(R.id.Password);
        Button registration=findViewById(R.id.registration);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(RegistrationActivity.this, LoginActivity.class);
                t.putExtra("User",user.getText().toString());
                t.putExtra("Password",password.getText().toString());
                startActivity(t);
            }
        });
    }
}