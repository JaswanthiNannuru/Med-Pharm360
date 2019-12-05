package com.example.androidproject;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.util.Arrays;
import java.util.List;

public class PatientsrecordActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientsrecord);
    }

    public static final int back12 = 0;

    public void back12Click(View v) {
        Intent intent = new Intent(this, PatientHomeActivity.class);
        startActivityForResult(intent, back12);
    }

    public void dataBTN(View v) {

        EditText et1 = findViewById(R.id.editText);
        EditText et2 = findViewById(R.id.editText2);
        EditText et3 = findViewById(R.id.editText3);
        EditText et4 = findViewById(R.id.editText4);
        EditText et5 = findViewById(R.id.editText5);


        ParseObject entity = new ParseObject("B4aVehicle");

        entity.put("AppNum", "CN897987099");


        // Saves the new object.
        // Notice that the SaveCallback is totally optional!
        entity.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                // Here you can handle errors, if thrown. Otherwise, "e" should be null
            }
        });


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
}