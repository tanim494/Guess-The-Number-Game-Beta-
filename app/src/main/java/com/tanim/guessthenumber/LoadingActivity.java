package com.tanim.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        new Handler().postDelayed(() -> {
                Intent intent = new Intent(LoadingActivity.this, MainActivity.class);
                startActivity(intent);
            finish(); // Close the splash activity
        }, 3000);
    }
}