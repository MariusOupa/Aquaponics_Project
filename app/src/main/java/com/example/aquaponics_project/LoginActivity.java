package com.example.aquaponics_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onSignInClick(View v){

    }
    public void onSignUpClick(View v){
        Intent iRegister = new Intent(this,RegisterActivity.class);
        startActivity(iRegister);

    }}
