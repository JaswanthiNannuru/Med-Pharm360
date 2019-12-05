package com.example.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryloginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historylogin);
    }

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

/*public void okClick(View v){

    EditText et1 = findViewById(R.id.editText);
    EditText et2 = findViewById(R.id.editText2);
    EditText et3 = findViewById(R.id.editText3);
    EditText et4 = findViewById(R.id.editText4);
    EditText et5 = findViewById(R.id.editText5);

    TextView tv = findViewById(R.id.displaymainTV);
    tv.setText("Appointment number: " + et1.getText().toString()+
            "\n"+
            "Doctor Name: " + et2.getText().toString() +
            "\n"+
            "Appointment date: " + et3.getText().toString() +
            "\n"+
            "Reason: " + et4.getText().toString() +
            "\n"+
            "Medication: " + et5.getText().toString() +
            "\n");
}
   */




    public void back6Click(View v) {
        Intent intent = new Intent(this, DoctorHomeActivity.class);
        startActivityForResult(intent,back6);
    }



}
