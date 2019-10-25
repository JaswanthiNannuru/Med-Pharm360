package com.example.androidproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.PublicKey;

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

    public void doctor1(View v)
    {
        TextView t = findViewById(R.id.DoctorinfoTV);
        t.setText("Dermatologist");

    }

    public void doctor2(View v)
    {
        TextView t = findViewById(R.id.DoctorinfoTV);
        t.setText("oncologist");

    }
    public void doctor3(View v)
    {
        TextView t = findViewById(R.id.DoctorinfoTV);
        t.setText("cardiologist");

    }
}
