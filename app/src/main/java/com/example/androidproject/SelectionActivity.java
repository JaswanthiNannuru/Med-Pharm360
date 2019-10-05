package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectionActivity extends DoctorSignupActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public static final int Doctor = 0;
    public static final int Patient = 0;

    public void doctorClick(View v){
        Intent intent = new Intent(this,DoctorSignupActivity.class);
        startActivityForResult(intent,Doctor);

    }
    public void patientClick(View v){
        Intent intent = new Intent(this,PatientSignupActivity.class);
        startActivityForResult(intent,Patient);

    }


}
