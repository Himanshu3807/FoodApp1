package com.example.foodapp;

import static com.example.foodapp.R.id.btRegister;
import static com.example.foodapp.R.id.btSignup;
import static com.example.foodapp.R.id.btnregister1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class SignUp_Activity extends AppCompatActivity {
     Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        register = findViewById(btnregister1);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SignUp_Activity.this , Signin_Activity.class);
                startActivity(intent);
            }
        });
    }
}