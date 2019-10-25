package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        String f = q.getText().toString();

        EditText r= findViewById(R.id.patientmailidET);
        String g = r.getText().toString();

        EditText s= findViewById(R.id.patientnameET);
        String h = s.getText().toString();

        EditText i= findViewById(R.id.patientnameET);
        String j = i.getText().toString();

        EditText k= findViewById(R.id.patientnameET);
        String l = k.getText().toString();

        if(f.isEmpty()||g.isEmpty()||h.isEmpty()||j.isEmpty()||l.isEmpty())
        {
            TextView o=findViewById(R.id.EnterdetailsTV2);
            o.setText("enter the details");
        }
        else
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivityForResult(intent, Signup1);
            Toast.makeText(getApplicationContext(),
                    "Please login again", Toast.LENGTH_SHORT).show();
        }
    }

    public void back3Click(View v) {
        Intent intent = new Intent(this, SelectionActivity.class);
        startActivityForResult(intent, back3);
    }


}




