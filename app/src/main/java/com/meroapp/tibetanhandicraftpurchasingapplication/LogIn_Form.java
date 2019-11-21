package com.meroapp.tibetanhandicraftpurchasingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LogIn_Form extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout editTextEmailLogIn,editTextPasswordLogIn;
    private Button buttonLoginLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in__form);

        editTextEmailLogIn=findViewById(R.id.editTextEmailLogIn);
        editTextPasswordLogIn=findViewById(R.id.editTextPasswordLogIn);
        buttonLoginLogin=findViewById(R.id.buttonLoginLogin);

        buttonLoginLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.buttonLoginLogin:

                if (TextUtils.isEmpty(editTextEmailLogIn.getEditText().getText())) {
                    editTextEmailLogIn.setError("Enter Email Address Please");
                    editTextEmailLogIn.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(editTextPasswordLogIn.getEditText().getText())) {
                    editTextPasswordLogIn.setError("Enter Password Please");
                    editTextPasswordLogIn.requestFocus();
                    return;
                }else{
                if(editTextEmailLogIn.getEditText().toString().equals("Admin") && editTextPasswordLogIn.getEditText().toString().equals("admin") ){
                    Intent intent = new Intent(LogIn_Form.this,DashboardActivity.class);
                    startActivity(intent);
                    Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Wrong Username and Password", Toast.LENGTH_SHORT).show();
                }
                }



        }
    }
}
