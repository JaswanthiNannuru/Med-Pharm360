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
    public static final int records = 0;


    public void patient1Click(View v){
        Intent intent = new Intent(this,HistoryloginActivity.class);
        startActivityForResult(intent,records);

    }
    public void patient2Click(View v){
        Intent intent = new Intent(this,HistoryloginActivity.class);
        startActivityForResult(intent,records);

    }
    public void patient3Click(View v){
        Intent intent = new Intent(this,HistoryloginActivity.class);
        startActivityForResult(intent,records);

    }

}
