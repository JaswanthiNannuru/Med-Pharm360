package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HealthhistoryPVActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthhistorydv);
    }
    public static final int records = 0;
    public static final int back11 = 0;

    public void patient1Click(View v) {
        Intent intent = new Intent(this, PatientsrecordActivity.class);
        startActivityForResult(intent, records);
    }
    public void patient2Click(View v){
            Intent intent = new Intent(this, PatientsrecordActivity.class);
            startActivityForResult(intent,records);
        }
    public void patient3Click(View v) {
        Intent intent = new Intent(this, PatientsrecordActivity.class);
        startActivityForResult(intent, records);

    }
        public void back11Click(View v) {
        Intent intent = new Intent(this, PatientHomeActivity.class);
        startActivityForResult(intent,back11);
    }

}
