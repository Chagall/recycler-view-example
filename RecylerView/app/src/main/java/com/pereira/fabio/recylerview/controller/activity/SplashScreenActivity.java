package com.pereira.fabio.recylerview.controller.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.pereira.fabio.recylerview.R;


public class SplashScreenActivity extends AppCompatActivity {

    public static final long SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, CastMembersListActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
