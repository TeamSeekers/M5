package com.example.seekers.wheresmystuff;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegistrationScreenActivity extends AppCompatActivity {

    private EditText enterName;
    private EditText enterUsername;
    private EditText enterPassword;
    private Button registrationEnter;
    private RadioButton userAccountType;
    private RadioButton adminAccountType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);

        enterName = (EditText) findViewById(R.id.enterName);
        enterUsername = (EditText) findViewById(R.id.enterUsername);
        enterPassword = (EditText) findViewById(R.id.enterPassword);
        registrationEnter = (Button) findViewById(R.id.registrationEnter);
        userAccountType = (RadioButton) findViewById(R.id.userAccountType);
        adminAccountType = (RadioButton) findViewById(R.id.adminAccountType);
    }

    protected void onRegistrationEnterPressed(View view) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Registration Successful");
        builder1.setCancelable(true);
        AlertDialog alert11 = builder1.create();
        alert11.show();
        finish();
    }

    protected void onRegistrationCancelPressed(View view) {
        finish();
    }
}
