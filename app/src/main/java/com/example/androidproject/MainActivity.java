package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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
        /*

       EditText j = findViewById(R.id.usernameET);
        String a = j.getText().toString();

        EditText w = findViewById(R.id.passwordET);
        String b = w.getText().toString();

        if(a.isEmpty() || b.isEmpty() )
        {
            TextView t = findViewById(R.id.EnterdetailsET3);
            t.setText("enter the details");
        }
        else
        {
            Intent intent = new Intent(this,DoctorHomeActivity.class);
            startActivityForResult(intent,DoctorLogin);
        }

       // Intent intent = new Intent(this,DoctorHomeActivity.class);
       // startActivityForResult(intent,DoctorLogin);

  */
        EditText username = (EditText)findViewById(R.id.usernameET);
        EditText password = (EditText)findViewById(R.id.passwordET);

        if(username.getText().toString().equals("doctor1") && password.getText().toString().equals("doctor1"))
        {
            //correcct password
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,DoctorHomeActivity.class);
            startActivityForResult(intent,DoctorLogin);
        }else

            {if (username.getText() == null || password.getText() == null) {
            // Credentials not entered
            Toast.makeText(getApplicationContext(),
                    "Enter your Credentials", Toast.LENGTH_SHORT).show();
                //Intent intent1 = new Intent(this,MainActivity.class);
               // startActivityForResult(intent1,DoctorLogin);
        } else {
            //incorrect password
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
               // Intent intent1 = new Intent(this,MainActivity.class);
               // startActivityForResult(intent1,DoctorLogin);
        }
        }
    }
    public void patientLogin(View v){
/*

        EditText j = findViewById(R.id.usernameET);
        String a = j.getText().toString();

        EditText w = findViewById(R.id.passwordET);
        String b = w.getText().toString();

        if(a.isEmpty() || b.isEmpty() )
        {
            TextView t = findViewById(R.id.EnterdetailsET3);
            t.setText("enter the details");
        }
        else{
            Intent intent = new Intent(this,PatientHomeActivity.class);
            startActivityForResult(intent,PatientLogin);
        }
       // Intent intent = new Intent(this,PatientHomeActivity.class);
        //startActivityForResult(intent,PatientLogin);
*/

        EditText username = (EditText)findViewById(R.id.usernameET);
        EditText password = (EditText)findViewById(R.id.passwordET);

        if(username.getText().toString().equals("patient1") && password.getText().toString().equals("patient1"))
        {
            //correct password
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,PatientHomeActivity.class);
            startActivityForResult(intent,PatientLogin);
        }
        else {
            if (username.getText() == null || password.getText() == null) {
                // Credentials not entered
                Toast.makeText(getApplicationContext(),
                        "Enter Credentials", Toast.LENGTH_SHORT).show();
               // Intent intent = new Intent(this,MainActivity.class);
               // startActivityForResult(intent,PatientLogin);
            } else {
                //incorrect password
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
               // Intent intent = new Intent(this,MainActivity.class);
              //  startActivityForResult(intent,PatientLogin);
            }
        }
    }
    public void signupClick(View v){
        Intent intent = new Intent(this,SelectionActivity.class);
        startActivityForResult(intent,Signup);
        

    }

}
