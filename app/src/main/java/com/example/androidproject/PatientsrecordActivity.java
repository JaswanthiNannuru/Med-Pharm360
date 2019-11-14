package com.example.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PatientsrecordActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientsrecord);
    }
    public static final int back12 = 0;
    public void back12Click(View v) {
        Intent intent = new Intent(this, DoctorHomeActivity.class);
        startActivityForResult(intent,back12);
    }

}
