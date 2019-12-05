package com.example.androidproject;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AppointmentActivity extends AppCompatActivity {

    CheckBox checked;


    public static final int appointment = 0;
    public static final int back10 = 0;
    public static final int H1 =0;

    public static final String checkbox = "checkbox";
    public static final Boolean value = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

      //  checked = findViewById(R.id.checkbox1);


        TextView tv = findViewById(R.id.doctordataTV);

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("checkbox", 0);

       /* final SharedPreferences.Editor editor = preferences.edit();

        checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean c1 = checked.isChecked();
                editor.putBoolean("checkbox", value);
                editor.commit();

               // Toast.makeText(AppointmentActivity.this, "Done", Toast.LENGTH_LONG).show();


            }

        });
    }*/
    }
    public void conform1Click(View v) {

        CheckBox c1 = findViewById(R.id.checkbox1);
        CheckBox c2 = findViewById(R.id.checkbox2);
        CheckBox c3 = findViewById(R.id.checkbox3);
        CheckBox c4 = findViewById(R.id.checkbox4);



        //boolean c1 = checked.isChecked();

        if(c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked()) {
            Toast.makeText(AppointmentActivity.this, "Appoinment confirmed", Toast.LENGTH_SHORT).show();

            SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            preferences.getBoolean("checkbox",value);
            TextView tv = findViewById(R.id.appConformTV);
            editor.putBoolean("checkbox", value);
            editor.commit();


            Integer rand = ThreadLocalRandom.current().nextInt(100000, 10000000);
            tv.setText("Your Confirmation Number:  "+ "CN"+rand.toString() );

        }

        else {
            Toast.makeText(AppointmentActivity.this, "please select time", Toast.LENGTH_LONG).show();
            /*SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.commit();*/
        }
    }

        /*if(preferences.contains("checked") && preferences.getBoolean("checked",false) == true) {
            Toast.makeText(AppointmentActivity.this, "Booked", Toast.LENGTH_LONG).show();
            c1.setChecked(true);

        }else {
            c1.setChecked(false);
            Toast.makeText(AppointmentActivity.this, "not Done", Toast.LENGTH_LONG).show();

        }

    }
*/


        /*if(!c1.isChecked() || !c2.isChecked() || !c3.isChecked() || !c4.isChecked())
        {
            Toast.makeText(AppointmentActivity.this, "Please select time", Toast.LENGTH_LONG).show();




            //tv.setText("Appointment scheduled ");

        }
        else if(c1.isChecked())
        {
            Toast.makeText(AppointmentActivity.this, "Appointment scheduled", Toast.LENGTH_LONG).show();
            c1.setVisibility(View.INVISIBLE);

        }
        else
        {
            Toast.makeText(AppointmentActivity.this, "Appointment scheduled", Toast.LENGTH_LONG).show();
        }

    }*/
   /* public void scheduleClick(View v)
    {
        Intent intent = new Intent(this, PatientHomeActivity.class);
        startActivityForResult(intent, appointment);
    }*/
    public void back10Click(View v) {
        Intent intent = new Intent(this, DoctorslistActivity.class);
        startActivityForResult(intent,back10);
    }

}