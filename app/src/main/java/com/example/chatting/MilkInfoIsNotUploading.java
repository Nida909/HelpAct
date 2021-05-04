package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MilkInfoIsNotUploading extends AppCompatActivity {
TextView reg6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_info_is_not_uploading);
        reg6=findViewById(R.id.reg6);

        reg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(MilkInfoIsNotUploading.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Make sure you are not leaving any field empty");
                alert.setPositiveButton("OK", null);
                alert.show();
            }

        });
    }
}