package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HealthhistoryActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthhistory);
    }
    public static final int healthlogin = 0;
    public static final int back11 = 0;


    public void okCkick(View v){
        Intent intent = new Intent(this,DoctorslistActivity.class);
        startActivityForResult(intent,healthlogin);

    }
    public void back11Click(View v) {
        Intent intent = new Intent(this, HistoryloginActivity.class);
        startActivityForResult(intent,back11);
    }

}
