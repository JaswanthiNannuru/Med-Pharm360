package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class DoctorSignupActivity extends AppCompatActivity{



        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }

   /* public void setContentView(int activity_doctorsignup) {
    }*/

    public static final int doctorSignup = 0;
    public static final int back2 = 0;


    public void doctorSignup(View v){
        EditText username = findViewById(R.id.doctornameET);
        String a = username.getText().toString();

        EditText department = findViewById(R.id.departmentET);
        String b = department.getText().toString();

        EditText phno = findViewById(R.id.doctorphnoET);
        String c = phno.getText().toString();

        EditText doctorpassword = findViewById(R.id.doctorpasswordET);
        String d = doctorpassword.getText().toString();

        EditText doctorconfirmpswrd = findViewById(R.id.doctorpasswordET);
         String e = doctorpassword.getText().toString();



        if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty() || e.isEmpty())
              //  doctorpassword.getText() != doctorconfirmpswrd.getText() )
        {
            //Intent intent = new Intent(this,DoctorSignupActivity.class);
            //startActivityForResult(intent,doctorSignup);

           TextView t = findViewById(R.id.enterdetailsTV);
           t.setText("enter correct details");


        }
        else
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivityForResult(intent,doctorSignup);
            Toast.makeText(getApplicationContext(),
                    "Please login again", Toast.LENGTH_SHORT).show();

        }


    }
    public void back2Click(View v) {
        Intent intent = new Intent(this, SelectionActivity.class);
        startActivityForResult(intent,back2);
    }



}






