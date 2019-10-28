package com.meroapp.tibetanhandicraftpurchasingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLogIn,buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogIn=findViewById(R.id.buttonLogIn);
        buttonRegister=findViewById(R.id.buttonRegister);

        buttonLogIn.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.buttonLogIn:
            Intent intent = new Intent(DashboardActivity.this,LogIn_Form.class);
            startActivity(intent);
            break;

            case R.id.buttonRegister:
                Intent intent1 = new Intent(DashboardActivity.this,Register_Form.class);
                startActivity(intent1);
                break;
        }

    }
}
