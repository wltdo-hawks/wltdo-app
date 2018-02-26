package com.btdarcy.seniordesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends AppCompatActivity {

    Button bt,bt2,bt3;
    ToggleButton tg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bt = (Button) findViewById(R.id.logout);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Go back to login screen
                Intent myIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        tg = (ToggleButton) findViewById(R.id.lockButton);
        tg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(SecondActivity.this, "Locked", Toast.LENGTH_SHORT).show();
                    //send signal to door that door is locked
                }
                else{
                    Toast.makeText(SecondActivity.this, "Unlocked", Toast.LENGTH_SHORT).show();
                    //send signal to door that door is unlocked
                }
            }
        });
        bt2 = (Button) findViewById(R.id.logs);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Goto logs screen
                Intent logs = new Intent(SecondActivity.this, DataLogs.class);
                startActivity(logs);
            }
        });
        bt3 = (Button) findViewById(R.id.timed);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Go to the screen to deal with timed locks
                Intent timedLock = new Intent(SecondActivity.this, TimedLock.class);
                startActivity(timedLock);
            }
        });
    }
}
