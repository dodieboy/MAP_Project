package com.example.alantan.shapecalculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class cal_3d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_3d);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("3D Shape");
    }
}
