package com.example.androidproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class PatientSignupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientsignup);

        final EditText patientusername = (EditText) findViewById(R.id.patientnameET);
        final EditText patientmailid = (EditText) findViewById(R.id.patientmailidET);
        final EditText patientphno = (EditText) findViewById(R.id.patientphnoET);
        final EditText patientpassword = (EditText) findViewById(R.id.patientpasswordET);
        final EditText patientconformpassword = (EditText) findViewById(R.id.patientconfimpasswordET);
        Button patientsignupbutton = findViewById(R.id.patientsignupBTN);


        Button backButton3 = findViewById(R.id.back3BTN);


        backButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog dlg = new ProgressDialog(PatientSignupActivity.this);
                dlg.setTitle("Please, wait a moment.");
                dlg.setMessage("Returning to the login section...");
                dlg.show();
                Intent intent = new Intent(PatientSignupActivity.this, MainActivity.class);
                dlg.dismiss();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


        patientsignupbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Validating the log in data
                boolean validationError = false;

                StringBuilder validationErrorMessage = new StringBuilder("Please, insert ");
                if (isEmpty(patientusername)) {
                    validationError = true;
                    validationErrorMessage.append("username");
                }
                if (isEmpty(patientmailid)) {
                    if (validationError) {
                        validationErrorMessage.append("patient mailid");
                    }
                    validationError = true;
                    validationErrorMessage.append(" ");
                }
                if (isEmpty(patientphno)) {
                    if (validationError) {
                        validationErrorMessage.append("patient phonenumber");
                    }
                    validationError = true;
                    validationErrorMessage.append(" ");
                }
                if (isEmpty(patientpassword)) {
                    if (validationError) {
                        validationErrorMessage.append("  ");
                    }
                    validationError = true;
                    validationErrorMessage.append("password");
                }
                if (isEmpty(patientconformpassword)) {
                    if (validationError) {
                        validationErrorMessage.append("  ");
                    }
                    validationError = true;
                    validationErrorMessage.append(" ");
                } else {
                    if (!isMatching(patientpassword, patientconformpassword)) {
                        if (validationError) {
                            validationErrorMessage.append(" and ");
                        }
                        validationError = true;
                        validationErrorMessage.append("confirm password again");
                    }
                }
                validationErrorMessage.append(".");

                if (validationError) {
                    Toast.makeText(PatientSignupActivity.this, validationErrorMessage.toString(), Toast.LENGTH_LONG).show();
                    return;
                }

                //Setting up a progress dialog
                final ProgressDialog dlg = new ProgressDialog(PatientSignupActivity.this);
                dlg.setTitle("Please, wait a moment.");
                dlg.setMessage("Signing up...");
                dlg.show();

                ParseUser user = new ParseUser();
                user.setUsername(patientusername.getText().toString());
                user.setPassword(patientpassword.getText().toString());
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            dlg.dismiss();
                            alertDisplayer("Sucessful Login", "Welcome " + patientusername.getText().toString() + "!");

                        } else {
                            dlg.dismiss();
                            ParseUser.logOut();
                            Toast.makeText(PatientSignupActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }

        });
    }

    private boolean isEmpty(EditText text) {
        if (text.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isMatching(EditText text1, EditText text2) {
        if (text1.getText().toString().equals(text2.getText().toString())) {
            return true;
        } else {
            return false;
        }
    }

    private void alertDisplayer(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(PatientSignupActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Intent intent = new Intent(PatientSignupActivity.this, MainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });
        AlertDialog ok = builder.create();
        ok.show();
    }
}
/*
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
 */