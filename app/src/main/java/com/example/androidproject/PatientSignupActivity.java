package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PatientSignupActivity extends PatientHomeActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }

    public void setContentView(int activity_doctorsignup) {
    }

    public static final int Signup1 = 0;


    public void patientSignup(View v){
        Intent intent = new Intent(this, PatientHomeActivity.class);
        startActivityForResult(intent,Signup1);

    }

    public void startActivityForResult(Intent intent, int signup1) {
    }

}






