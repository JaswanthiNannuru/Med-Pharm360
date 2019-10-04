package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorHomeActivity extends DoctordataActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }
    public static final int Signup = 0;


    public void doctorSignup(View v){
        Intent intent = new Intent(this, DoctordataActivity.class);
        startActivityForResult(intent,Signup);

    }

}






