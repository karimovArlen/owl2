package com.example.aren;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        getSupportActionBar().setTitle( "⬅           REGISTER");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#8dc138"));
        actionBar.setBackgroundDrawable(colorDrawable);
    }
}