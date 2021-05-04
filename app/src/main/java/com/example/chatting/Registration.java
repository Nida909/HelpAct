package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    TextView reg1,reg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        reg1=findViewById(R.id.reg1);
        reg2=findViewById(R.id.reg2);
        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(Registration.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Password should  not be weak, it must have 1 uppercase letter, 1 lowercase letter, 1 digit and 1 special letter");
                alert.setPositiveButton("OK", null);
                alert.show();
            }

        });
        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(Registration.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Be Careful that you provide us all the required Information");
                alert.setPositiveButton("OK", null);
                alert.show();


            }

        });
    }
    }
