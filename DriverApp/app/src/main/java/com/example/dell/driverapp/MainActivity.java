package com.example.dell.driverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //private Button loginButton;
    private EditText loginEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loginButton = (Button) findViewById(R.id.loginbutton);
        loginEmail=(EditText)findViewById(R.id.email);
    }

    public void onLogin(View view){

        String email = loginEmail.getText().toString();

        Intent intent = new Intent(this,HomeActivity.class);//("com.example.dell.driverapp.HomeActivity");
        intent.putExtra("email",email);
        startActivity(intent);
    }
}
