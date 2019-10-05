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
    public static final int back10 = 0;

    public void conformClick(View v) {
        Intent intent = new Intent(this, AppCompatActivity.class);
        startActivityForResult(intent, appointment);

    }
    public void back10Click(View v) {
        Intent intent = new Intent(this, DoctorslistActivity.class);
        startActivityForResult(intent,back10);
    }

}