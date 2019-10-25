package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final int DoctorLogin =  0;
    public static final int PatientLogin =  0;

    public static final int Signup = 0;



    public void doctorLogin(View v){
        Intent intent = new Intent(this,DoctorHomeActivity.class);
        startActivityForResult(intent,DoctorLogin);

        EditText username = (EditText)findViewById(R.id.usernameET);
        EditText password = (EditText)findViewById(R.id.passwordET);

        if(username.getText().toString().equals("doctor1") && password.getText().toString().equals("doctor1"))
        {
            //correcct password
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
        }else
            {if (username.getText() == null || password.getText() == null) {
            // Credentials not entered
            Toast.makeText(getApplicationContext(),
                    "Enter Credentials", Toast.LENGTH_SHORT).show();
        } else {
            //incorrect password
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
        }
        }



    }
    public void patientLogin(View v){
        Intent intent = new Intent(this,PatientHomeActivity.class);
        startActivityForResult(intent,PatientLogin);

        EditText username = (EditText)findViewById(R.id.usernameET);
        EditText password = (EditText)findViewById(R.id.passwordET);

        if(username.getText().toString().equals("patient1") && password.getText().toString().equals("patient1"))
        {
            //correct password
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
        }
        else {
            if (username.getText() == null || password.getText() == null) {
                // Credentials not entered
                Toast.makeText(getApplicationContext(),
                        "Enter Credentials", Toast.LENGTH_SHORT).show();
            } else {
                //incorrect password
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void signupClick(View v){
        Intent intent = new Intent(this,SelectionActivity.class);
        startActivityForResult(intent,Signup);

    }

}
