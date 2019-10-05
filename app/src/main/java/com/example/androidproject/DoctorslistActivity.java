package com.example.androidproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DoctorslistActivity extends AppointmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorslist);
    }
    public static final int list =  0;

    public void conformClick(View v){
        Intent intent = new Intent(this, AppointmentActivity.class);
        startActivityForResult(intent,list);

    }

}
