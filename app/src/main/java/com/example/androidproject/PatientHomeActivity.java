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
        setContentView(R.layout.activity_doctorhome);
    }
    public static final int doctorsmenu = 0;
    public static final int healthhistory = 0;


    public void doctorlistClick(View v){
        Intent intent = new Intent(this,AppCompatActivity.class);
        startActivityForResult(intent,doctorsmenu);

    }
    public void healthhistoryClick(View v){
        Intent intent = new Intent(this,AppCompatActivity.class);
        startActivityForResult(intent,healthhistory);

    }
}
