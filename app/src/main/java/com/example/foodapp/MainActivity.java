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

public class MainActivity extends AppCompatActivity {
    Button login , register ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                );

        getSupportActionBar().hide();
        login = findViewById(btSignup);
        login.setOnClickListener(v -> {
            //Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_LONG ).show();
            Intent intent = new Intent(MainActivity.this , Signin_Activity.class);
            startActivity(intent);
        });

        register = findViewById(btRegister);
        Intent intent1 = new Intent(MainActivity.this , SignUp_Activity.class);
      register.setOnClickListener(view -> startActivity(intent1));
    }

}