package com.example.androidproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AppointmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctordata);
    }

    public static final int appointment = 0;

    public void conformClick(View v) {
        Intent intent = new Intent(this, AppCompatActivity.class);
        startActivityForResult(intent, appointment);

    }
}