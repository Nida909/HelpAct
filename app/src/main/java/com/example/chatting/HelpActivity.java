package com.example.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {
    String[] months={"Can't Create My Account","Can't Log In to My Account","Can't Find Nearest Milk Man","Can't Update Milk Info","Chat Box Is Not Working"};
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, months);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,months);
        ListView listView=(ListView)findViewById(R.id.mobile_list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String s = listView.getItemAtPosition(position).toString();
                switch (s) {

                    case "Can't Create My Account":
                        startActivity(new Intent(HelpActivity.this, Registration.class));
                        break;
                    case "Can't Log In to My Account":
                        startActivity(new Intent(HelpActivity.this, LogIn.class));
                        break;
                    case "Can't Find Nearest Milk Man":
                        startActivity(new Intent(HelpActivity.this, CantFindNearestMilkMan.class));
                        break;
                    case "Can't Update Milk Info":
                        startActivity(new Intent(HelpActivity.this, MilkInfoIsNotUploading.class));
                        break;
                    case "Chat Box Is Not Working":
                        startActivity(new Intent(HelpActivity.this, ChatBoxNotWorking.class));
                        break;

                }


            }
        });
    }
}