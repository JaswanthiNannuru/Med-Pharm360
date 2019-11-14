package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctordataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctordata);
    }
    public static final int data =  0;
    public static final int back5 =  0;

    public void conformClick(View v){
        Intent intent = new Intent(this,DoctorHomeActivity.class);
        startActivityForResult(intent,data);

    }
    public void back5Click(View v) {
        Intent intent = new Intent(this, DoctorHomeActivity.class);
        startActivityForResult(intent,back5);
    }


}
