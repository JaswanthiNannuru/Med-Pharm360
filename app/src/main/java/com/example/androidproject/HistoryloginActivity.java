package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryloginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historylogin);
    }
    public static final int patient1 =  0;
    public static final int patient2 =  0;
    public static final int patient3 =  0;
    public static final int healthlogin = 0;
    public static final int back6 = 0;

    /*public void okCkick(View v){
        Intent intent = new Intent(this, PatientsrecordActivity.class);
        startActivityForResult(intent,1);
        //startActivity(intent);

    }*/
    //public void onSearch(View v)
  //  {
     //   Intent intent = new Intent(this, PatientsrecordActivity.class);
      //  startActivityForResult(intent,1);
   // }

    public void patient1(View v){
        Intent intent = new Intent(this, HealthhistoryPVActivity.class);
        startActivityForResult(intent,patient1);
    }
    public void Patient2(View v){
        Intent intent = new Intent(this, HealthhistoryPVActivity.class);
        startActivityForResult(intent,patient2);

    }
    public void Patient3(View v){
        Intent intent = new Intent(this, HealthhistoryPVActivity.class);
        startActivityForResult(intent,patient3);

    }
    public void back6Click(View v) {
        Intent intent = new Intent(this, HistoryloginActivity.class);
        startActivityForResult(intent,back6);
    }



}
