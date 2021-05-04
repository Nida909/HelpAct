package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
    TextView reg3,reg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        reg3=findViewById(R.id.reg3);
        reg4=findViewById(R.id.reg4);
        reg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Make sure you are entering right name and password\nMake sure you have created your account on this app once\nIf you dont have an account, create your account first");
                alert.setPositiveButton("OK", null);
                alert.show();
            }

        });
        reg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(LogIn.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Use your name used to create the account and your password to log in to your account.");
                alert.setPositiveButton("OK", null);
                alert.show();


            }

        });
    }
}