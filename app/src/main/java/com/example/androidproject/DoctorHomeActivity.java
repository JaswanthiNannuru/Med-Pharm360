package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DoctorHomeActivity extends DoctordataActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorhome);
    }
    public static final int hours = 0;
    public static final int history = 0;


    public void hoursClick(View v){
        Intent intent = new Intent(this, DoctordataActivity.class);
        startActivityForResult(intent,hours);

    }
    public void historyClick(View v){
        Intent intent = new Intent(this,DoctordataActivity.class);
        startActivityForResult(intent,history);

    }

}






