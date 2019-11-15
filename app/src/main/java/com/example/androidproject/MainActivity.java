package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

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

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.LogInCallback;



public class MainActivity extends AppCompatActivity {
    EditText username = (EditText) findViewById(R.id.usernameET);
    EditText password = (EditText) findViewById(R.id.passwordET);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final int DoctorLogin =  0;
    public static final int PatientLogin =  0;

    public static final int Signup = 0;

    public void doctorLogin(View v) {
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
        EditText username = (EditText) findViewById(R.id.usernameET);
        EditText password = (EditText) findViewById(R.id.passwordET);


/*
        if (username.getText().toString().equals("sanjana") && password.getText().toString().equals("sanjana")||
                username.getText().toString().equals("harsha") && password.getText().toString().equals("bollam")||
                username.getText().toString().equals("jash") && password.getText().toString().equals("nannuru")) {
            //correct password
            Toast.makeText(getApplicationContext(),
                    "Redirecting...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DoctorHomeActivity.class);
            startActivityForResult(intent, DoctorLogin);
        } else {
            if (username.getText() == null || password.getText() == null) {
                // Credentials not entered
                Toast.makeText(getApplicationContext(),
                        "Enter your Credentials", Toast.LENGTH_LONG).show();
                //Intent intent1 = new Intent(this,MainActivity.class);
                // startActivityForResult(intent1,DoctorLogin);
            } else {
                //incorrect password
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_LONG).show();
                // Intent intent1 = new Intent(this,MainActivity.class);
                // startActivityForResult(intent1,DoctorLogin);
            }
        }


 */
    }
    public void patientLogin(View v) {
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

        /*
        if(username.getText().toString().equals("lekha") && password.getText().toString().equals("doshi")||
                username.getText().toString().equals("supriya") && password.getText().toString().equals("peddi")||
                username.getText().toString().equals("charan") && password.getText().toString().equals("reddy"))
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

         */




        final Button login_button = findViewById(R.id.doctorloginBTN);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validating the log in data
                boolean validationError = false;

                StringBuilder validationErrorMessage = new StringBuilder("Please, insert ");
                if (isEmpty(username)) {
                    validationError = true;
                    validationErrorMessage.append("an username");
                }
                if (isEmpty(password)) {
                    if (validationError) {
                        validationErrorMessage.append(" and ");
                    }
                    validationError = true;
                    validationErrorMessage.append("a password");
                }
                validationErrorMessage.append(".");

                if (validationError) {
                    Toast.makeText(MainActivity.this, validationErrorMessage.toString(), Toast.LENGTH_LONG).show();
                    return;
                }

                //Setting up a progress dialog
                final ProgressDialog dlg = new ProgressDialog(MainActivity.this);
                dlg.setTitle("Please, wait a moment.");
                dlg.setMessage("Logging in...");
                dlg.show();

                ParseUser.logInInBackground(username.getText().toString(), password.getText().toString(), new LogInCallback() {
                    @Override
                    public void done(ParseUser parseUser, ParseException e) {
                        if (parseUser != null) {
                            dlg.dismiss();
                            alertDisplayer("Sucessful Login","Welcome back " + username.getText().toString() + "!");

                        } else {
                            dlg.dismiss();
                            ParseUser.logOut();
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

        final Button signup_button = findViewById(R.id.doctorloginBTN);
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DoctorSignupActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
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

    private void alertDisplayer(String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();


                        //edit the last main activity it had been logout activity
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });
        AlertDialog ok = builder.create();
        ok.show();



        final Button login_button = findViewById(R.id.patientloginBTN);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validating the log in data
                boolean validationError = false;

                StringBuilder validationErrorMessage = new StringBuilder("Please, insert ");
                if (isEmpty(username)) {
                    validationError = true;
                    validationErrorMessage.append("an username");
                }
                if (isEmpty(password)) {
                    if (validationError) {
                        validationErrorMessage.append(" and ");
                    }
                    validationError = true;
                    validationErrorMessage.append("a password");
                }
                validationErrorMessage.append(".");

                if (validationError) {
                    Toast.makeText(MainActivity.this, validationErrorMessage.toString(), Toast.LENGTH_LONG).show();
                    return;
                }

                //Setting up a progress dialog
                final ProgressDialog dlg = new ProgressDialog(MainActivity.this);
                dlg.setTitle("Please, wait a moment.");
                dlg.setMessage("Logging in...");
                dlg.show();

                ParseUser.logInInBackground(username.getText().toString(), password.getText().toString(), new LogInCallback() {
                    @Override
                    public void done(ParseUser parseUser, ParseException e) {
                        if (parseUser != null) {
                            dlg.dismiss();
                            alertDisplayer("Sucessful Login","Welcome back " + username.getText().toString() + "!");

                        } else {
                            dlg.dismiss();
                            ParseUser.logOut();
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

        final Button signup_button = findViewById(R.id.patientloginBTN);
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PatientSignupActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
/*
    private boolean isEmpty(EditText text) {
        if (text.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }

 */

    private void alertDisplayer(String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();


                        //edit the last main activity it had been logout activity
                        Intent intent = new Intent(MainActivity.this, LogoutActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });
        AlertDialog ok = builder.create();
        ok.show();


    }
}

