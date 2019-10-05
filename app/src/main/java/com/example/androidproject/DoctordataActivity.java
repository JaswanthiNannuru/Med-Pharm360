package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

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
    public static final int back6 =  0;

    public void conformClick(View v){
        Intent intent = new Intent(this,AppCompatActivity.class);
        startActivityForResult(intent,data);

    }
    public void back6Click(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent,back6);
    }


}
