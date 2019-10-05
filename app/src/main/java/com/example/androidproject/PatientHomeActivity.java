package com.example.androidproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;

public class PatientHomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patienthome);
    }
    public static final int doctorsmenu = 0;
    public static final int healthhistory = 0;
    public static final int back8 = 0;



    public void doctorlistClick(View v){
        Intent intent = new Intent(this,DoctorslistActivity.class);
        startActivityForResult(intent,doctorsmenu);

    }
    public void healthhistoryClick(View v){
        Intent intent = new Intent(this,PatientsrecordActivity.class);
        startActivityForResult(intent,healthhistory);

    }
    public void back8Click(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent,back8);
    }
}
