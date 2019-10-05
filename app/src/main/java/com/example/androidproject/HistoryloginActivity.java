package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoryloginActivity extends DoctorHomeActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorhome);
    }
    public static final int healthlogin = 0;


    public void doctorSignup(View v){
        Intent intent = new Intent(this,DoctorHomeActivity.class);
        startActivityForResult(intent,healthlogin);

    }


}
