package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorSignupActivity extends SelectionActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }

    public void setContentView(int activity_doctorsignup) {
    }

    public static final int Signup = 0;
    public static final int back2 = 0;


        public void doctorSignup(View v){
        Intent intent = new Intent(this,DoctorHomeActivity.class);
        startActivityForResult(intent,Signup);

    }
    public void back1Click(View v) {
        Intent intent = new Intent(this, SelectionActivity.class);
        startActivityForResult(intent,back2);
    }



}






