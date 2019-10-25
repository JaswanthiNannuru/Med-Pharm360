package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DoctorSignupActivity extends SelectionActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }

   /* public void setContentView(int activity_doctorsignup) {
    }*/

    public static final int Signup = 0;
    public static final int back2 = 0;


    public void doctorSignup(View v){
        EditText u = findViewById(R.id.doctornameET);
        String a = u.getText().toString();

        EditText x = findViewById(R.id.departmentET);
        String b = x.getText().toString();

        EditText y = findViewById(R.id.doctorphnoET);
        String c = y.getText().toString();

        EditText z = findViewById(R.id.doctorpasswordET);
        String d = z.getText().toString();



        if(a.isEmpty() || b.isEmpty() || c.isEmpty()||d.isEmpty() )
        {
            TextView t = findViewById(R.id.enterdetailsTV);
                    t.setText("enter the details");
        }
        else
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivityForResult(intent,Signup);

        }


    }
    public void back2Click(View v) {
        Intent intent = new Intent(this, SelectionActivity.class);
        startActivityForResult(intent,back2);
    }



}






