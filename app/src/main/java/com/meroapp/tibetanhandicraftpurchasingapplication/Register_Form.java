package com.meroapp.tibetanhandicraftpurchasingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Register_Form extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout editTextFullName, editTextUserName, editTextEmailRegister, editTextPasswordRegister, editTextConfirmPasswordRegister;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__form);

        editTextFullName = findViewById(R.id.editTextFullName);
        editTextUserName = findViewById(R.id.editTextUserName);
        editTextEmailRegister = findViewById(R.id.editTextEmailRegister);
        editTextPasswordRegister = findViewById(R.id.editTextPasswordRegister);
        editTextConfirmPasswordRegister = findViewById(R.id.editTextConfirmPasswordRegister);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.buttonRegister:
                if (TextUtils.isEmpty(editTextFullName.getEditText().getText())) {
                    editTextFullName.setError("Enter Full-Name Please");
                    editTextFullName.requestFocus();
                } else if (TextUtils.isEmpty(editTextUserName.getEditText().getText())) {
                    editTextUserName.setError("Enter Username Please");
                    editTextUserName.requestFocus();
                } else if (TextUtils.isEmpty(editTextEmailRegister.getEditText().getText())) {
                    editTextEmailRegister.setError("Enter Email address Please");
                    editTextEmailRegister.requestFocus();
                } else if (TextUtils.isEmpty(editTextPasswordRegister.getEditText().getText())) {
                    editTextPasswordRegister.setError("Enter Password Please");
                    editTextPasswordRegister.requestFocus();
                } else if (TextUtils.isEmpty(editTextConfirmPasswordRegister.getEditText().getText())) {
                    editTextConfirmPasswordRegister.setError("Enter Confirm-Password Please");
                    editTextConfirmPasswordRegister.requestFocus();
                }else{
                    Toast.makeText(this, "Registered", Toast.LENGTH_LONG).show();
                }
                break;


        }
    }
}
