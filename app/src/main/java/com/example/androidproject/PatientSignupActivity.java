package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PatientSignupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientsignup);
    }


    /*public void setContentView(int activity_patientsignup) {
    }*/

    public static final int Signup1 = 0;
    public static final int back3 = 0;



    public void patientSignup(View v) {
        EditText q= findViewById(R.id.patientnameET);
        String e = q.getText().toString();

        EditText r= findViewById(R.id.patientmailidET);
        String f = r.getText().toString();

        EditText s= findViewById(R.id.patientnameET);
        String g = s.getText().toString();

        EditText i= findViewById(R.id.patientnameET);
        String h = i.getText().toString();

        EditText k= findViewById(R.id.patientnameET);
        String p = k.getText().toString();

        if(e.isEmpty()||f.isEmpty()||g.isEmpty()||h.isEmpty()||p.isEmpty())
        {
            TextView o=findViewById(R.id.EnterdetailsTV2);
            o.setText("enter the details");
        }
        else
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivityForResult(intent, Signup1);
        }
    }

    public void back3Click(View v) {
        Intent intent = new Intent(this, SelectionActivity.class);
        startActivityForResult(intent, back3);
    }


}




