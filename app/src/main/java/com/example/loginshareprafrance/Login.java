package com.example.loginshareprafrance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {
Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);
            SharedPreferences.Editor editor=pref.edit();
            editor.putBoolean("flag",true);
            editor.apply();
            Intent intent=new Intent( Login.this,LogOut.class );
            startActivity(intent);
        });

    }
}