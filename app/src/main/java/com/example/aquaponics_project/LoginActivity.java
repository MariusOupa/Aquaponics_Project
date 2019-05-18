package com.example.aquaponics_project;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoginActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onSignInClick(View v){
        Intent iLogin = new Intent(this,HomeActivity.class);
        startActivity(iLogin);
    }
    public void onSignUpClick(View v){
        Intent iRegister = new Intent(this,RegisterActivity.class);
        startActivity(iRegister);

    }}
