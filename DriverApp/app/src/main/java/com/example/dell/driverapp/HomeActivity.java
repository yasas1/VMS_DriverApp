package com.example.dell.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView textViewEmail;// , textV2;

    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email=getIntent().getExtras().getString("email");

        textViewEmail=(TextView)findViewById(R.id.emailTextView);

        textViewEmail.setText(email);
    }
}
