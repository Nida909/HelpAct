package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChatBoxNotWorking extends AppCompatActivity {
    TextView reg7;
    TextView reg8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_box_not_working);
        reg7=findViewById(R.id.reg7);
        reg8=findViewById(R.id.reg8);
        reg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(ChatBoxNotWorking.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Make sure that you have a strong internet connection");
                alert.setPositiveButton("OK", null);
                alert.show();
            }

        });
        reg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(ChatBoxNotWorking.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Make sure you are connected to Internet, otherwise you will not get OTP");
                alert.setPositiveButton("OK", null);
                alert.show();


            }

        });
    }
}