package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Patient1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient1);

        //TextView patient1 = findViewById(R.id.patient1reportTV);
        //patient1.setText("Name: abcd"+ \n + "Age: 23");

    }
    public static final int patient1back = 0;



    public void patient1backClick(View v) {
        Intent intent = new Intent(this, HistoryloginActivity.class);
        startActivityForResult(intent,patient1back);
    }

}
