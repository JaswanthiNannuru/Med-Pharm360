package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final int Login1 =  0;
    public static final int Login2 =  0;

    public static final int Signup = 0;

    public void doctorLogin(View v){
        Intent intent = new Intent(this,DoctorHomeActivity.class);
        startActivityForResult(intent,Login1);

    }
    public void patientLogin(View v){
        Intent intent = new Intent(this,PatientHomeActivity.class);
        startActivityForResult(intent,Login2);

    }
    public void signupClick(View v){
        Intent intent = new Intent(this,SelectionActivity.class);
        startActivityForResult(intent,Signup);

    }
}
