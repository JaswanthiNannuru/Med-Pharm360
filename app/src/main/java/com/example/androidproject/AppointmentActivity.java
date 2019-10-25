package com.example.androidproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AppointmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
    }

    public static final int appointment = 0;
    public static final int back10 = 0;
    public static final int H1 =0;

    public void conform1Click(View v) {

        TextView d = findViewById(R.id.doctordataTV);
        d.setText("Sanjana Baswa Dermetologist ");

        CheckBox c1 = findViewById(R.id.checkbox1);
        CheckBox c2 = findViewById(R.id.checkbox2);
        CheckBox c3 = findViewById(R.id.checkbox3);
        CheckBox c4 = findViewById(R.id.checkbox4);
        TextView tv = findViewById(R.id.doctordataTV);

        if(c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked())
        {

            tv.setText("Confirmed ");

        }
        else
        {
            tv.setText("Please select time ");
        }




    }
    public void scheduleClick(View v)
    {
        Intent intent = new Intent(this, PatientHomeActivity.class);
        startActivityForResult(intent, appointment);
    }
    public void back10Click(View v) {
        Intent intent = new Intent(this, DoctorslistActivity.class);
        startActivityForResult(intent,back10);
    }
   // public void onActivityResult(int requestCode,int resultCode,Intent data)
    //{
      //  if(resultCode ==H1)
        //{
          //  TextView t = findViewById(R.id.doctordataTV);
            //String v = data.getStringExtra("H1");
            //t.setText("fsvfsv ");
        //}
    //}


}