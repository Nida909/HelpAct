package com.example.chatting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CantFindNearestMilkMan extends AppCompatActivity {
TextView reg5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cant_find_nearest_milk_man);
        reg5=findViewById(R.id.reg5);

        reg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(CantFindNearestMilkMan.this);
                alert.setTitle("Here is Your Answer");
                alert.setMessage("Make sure you are connected to the Internet\nMake sure your GPS is enabled on your device");
                alert.setPositiveButton("OK", null);
                alert.show();
            }

        });

    }
}