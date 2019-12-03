package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class DoctordataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctordata);


        CheckBox c1 = findViewById(R.id.checkbox5);
        CheckBox c2 = findViewById(R.id.checkbox6);
        CheckBox c3 = findViewById(R.id.checkbox7);
        CheckBox c4 = findViewById(R.id.checkbox8);

        c1.setChecked(true);
        c2.setChecked(true);
        c3.setChecked(true);
        c4.setChecked(true);

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
