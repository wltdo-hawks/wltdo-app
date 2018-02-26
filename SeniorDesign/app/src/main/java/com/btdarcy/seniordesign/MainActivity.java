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

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText email = (EditText) findViewById(R.id.editText);
        final EditText password = (EditText) findViewById(R.id.editText2);

        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emString = email.getText().toString();
                String paString = password.getText().toString();
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                if((Objects.equals(emString, "btdarcy@yahoo.com")) &&(Objects.equals(paString, "hi")))
                {
                    startActivity(myIntent);
                }else{
                    Toast.makeText(MainActivity.this, "Wrong information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
