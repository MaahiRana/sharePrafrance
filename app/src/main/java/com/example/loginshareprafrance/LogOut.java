package com.example.loginshareprafrance;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class LogOut extends AppCompatActivity {
    Button button2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);
        button2=findViewById(R.id.bTN);
        button2.setOnClickListener(view -> {
            SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);
            SharedPreferences.Editor editor=pref.edit();
            editor.putBoolean("flag",false);
            editor.apply();
            Intent intent=new Intent( LogOut.this,MainActivity.class );
            startActivity(intent);
        });


    }
}