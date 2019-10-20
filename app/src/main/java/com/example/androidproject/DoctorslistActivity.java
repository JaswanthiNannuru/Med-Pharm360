package com.example.androidproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoctorslistActivity extends AppointmentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorslist);
    }
    public static final int doctor1 =  0;
    public static final int doctor2 =  0;
    public static final int doctor3 =  0;
    public static final int back9 = 0;


    public void doctor1Click(View v){
        TextView t = findViewById(R.id.InfoTV);
        t.setText("willam , Dermitologist");


    }
    public void doctor2Click(View v){
        TextView t = findViewById(R.id.InfoTV);
        t.setText("Dheeraj , Cardiologist");


    }

    public void doctor3Click(View v){
        TextView t = findViewById(R.id.InfoTV);
        t.setText("Maria , Oncologist");




    }

    public void proceed1(View v){
        Intent intent = new Intent(this, AppointmentActivity.class);
        startActivityForResult(intent,doctor1);


    }
    public void proceed2(View v){
        Intent intent = new Intent(this, AppointmentActivity.class);
        startActivityForResult(intent,doctor2);

    }
    public void proceed3(View v){
        Intent intent = new Intent(this, AppointmentActivity.class);
        startActivityForResult(intent,doctor3);

    }



    public void back9Click(View v) {
        Intent intent = new Intent(this, PatientHomeActivity.class);
        startActivityForResult(intent,back9);
    }

}
