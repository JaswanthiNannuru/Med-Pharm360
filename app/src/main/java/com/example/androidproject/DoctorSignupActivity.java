package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorSignupActivity extends DoctorHomeActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }

    public void setContentView(int activity_doctorsignup) {
    }

    public static final int Signup = 0;


        public void doctorSignup(View v){
        Intent intent = new Intent(this, DoctorHomeActivity.class);
        startActivityForResult(intent,Signup);

    }

}






