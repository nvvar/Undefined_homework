package com.nwar.dsm2018.undefined_homework_1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setTheme(android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
