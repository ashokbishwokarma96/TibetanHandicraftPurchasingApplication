package com.meroapp.tibetanhandicraftpurchasingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLogInDashboard,buttonRegisterDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogInDashboard=findViewById(R.id.buttonLogInDashboard);
        buttonRegisterDashboard=findViewById(R.id.buttonRegisterDashboard);

        buttonLogInDashboard.setOnClickListener(this);
        buttonRegisterDashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.buttonLogInDashboard:
            Intent intent = new Intent(DashboardActivity.this,LogIn_Form.class);
            startActivity(intent);
            break;

            case R.id.buttonRegisterDashboard:
                Intent intent1 = new Intent(DashboardActivity.this,Register_Form.class);
                startActivity(intent1);
                break;
        }

    }
}
