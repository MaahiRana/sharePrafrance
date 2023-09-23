package com.example.loginshareprafrance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {
                SharedPreferences pref=getSharedPreferences("login",MODE_PRIVATE);
               Boolean check= pref.getBoolean("flag",false);
                Intent INEXT;
               if (check){
                   INEXT=new Intent( MainActivity.this,LogOut.class );

               }else {
                   INEXT=new Intent( MainActivity.this,Login.class );

               }
               startActivity(INEXT);


            }

        }, 3*1000); // wait for 5 seconds

    }
}