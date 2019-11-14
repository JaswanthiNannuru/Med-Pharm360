package com.example.androidproject;

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

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class DoctorSignupActivity extends AppCompatActivity {
    public static final int doctorSignup = 0;
    public static final int back2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorsignup);
    }

   /* public void setContentView(int activity_doctorsignup) {
    }*/

   
    final Button back_button = findViewById(R.id.back2BTN);
        back_button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        final ProgressDialog dlg = new ProgressDialog(DoctorSignupActivity.this);
        dlg.setTitle("Please, wait a moment.");
        dlg.setMessage("Returning to the login section...");
        dlg.show();
        Intent intent = new Intent(DoctorSignupActivity.this, MainActivity.class);
        dlg.dismiss();
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    });


    EditText doctorusername = (EditText) findViewById(R.id.doctornameET);
    EditText departmentname = (EditText) findViewById(R.id.departmentET);
    EditText doctormailid = (EditText) findViewById(R.id.doctormailidET);
    EditText doctorphno = (EditText) findViewById(R.id.doctorphnoET);
    EditText doctorpassword = (EditText) findViewById(R.id.doctorpasswordET);
    EditText doctorconformpassword = (EditText) findViewById(R.id.doctorconformpasswordET);

        final Button doctorsignupbutton = findViewById(R.id.doctorsignupBTN);
        doctorsignupbutton.setOnClickListener(new View.OnClickListener()

    {

        @Override
        public void onClick (View v){
        //Validating the log in data
        boolean validationError = false;

        StringBuilder validationErrorMessage = new StringBuilder("Please, insert ");
        if (isEmpty(doctorusername)) {
            validationError = true;
            validationErrorMessage.append("username");
        }
        if (isEmpty(departmentname)) {
            if (validationError) {
                validationErrorMessage.append("department name");
            }
            validationError = true;
            validationErrorMessage.append(" ");
        }
        if (isEmpty(doctormailid)) {
            if (validationError) {
                validationErrorMessage.append("doctor mailid");
            }
            validationError = true;
            validationErrorMessage.append(" ");
        }
        if (isEmpty(doctorphno)) {
            if (validationError) {
                validationErrorMessage.append("doctor phonenumber");
            }
            validationError = true;
            validationErrorMessage.append(" ");
        }
        if (isEmpty(doctorpassword)) {
            if (validationError) {
                validationErrorMessage.append("  ");
            }
            validationError = true;
            validationErrorMessage.append("password");
        }
        if (isEmpty(doctorconformpassword)) {
            if (validationError) {
                validationErrorMessage.append("  ");
            }
            validationError = true;
            validationErrorMessage.append(" ");
        } else {
            if (!isMatching(doctorpassword, doctorconformpassword)) {
                if (validationError) {
                    validationErrorMessage.append(" and ");
                }
                validationError = true;
                validationErrorMessage.append("confirm password again");
            }
        }
        validationErrorMessage.append(".");

        if (validationError) {
            Toast.makeText(DoctorSignupActivity.this, validationErrorMessage.toString(), Toast.LENGTH_LONG).show();
            return;
        }

        //Setting up a progress dialog
        final ProgressDialog dlg = new ProgressDialog(DoctorSignupActivity.this);
        dlg.setTitle("Please, wait a moment.");
        dlg.setMessage("Signing up...");
        dlg.show();

        ParseUser user = new ParseUser();
        user.setUsername(doctorusername.getText().toString());
        user.setPassword(doctorpassword.getText().toString());
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    dlg.dismiss();
                    alertDisplayer("Sucessful Login", "Welcome " + doctorusername.getText().toString() + "!");

                } else {
                    dlg.dismiss();
                    ParseUser.logOut();
                    Toast.makeText(DoctorSignupActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
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

    private boolean isMatching(EditText text1, EditText text2){
        if(text1.getText().toString().equals(text2.getText().toString())){
            return true;
        }
        else{
            return false;
        }
    }

    private void alertDisplayer(String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(DoctorSignupActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Intent intent = new Intent(DoctorSignupActivity.this, MainActivity.class);
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





