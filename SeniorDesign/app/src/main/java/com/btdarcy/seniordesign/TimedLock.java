package com.btdarcy.seniordesign;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimedLock extends AppCompatActivity {

    Dialog nightTime;
    int hour_s,minute_s,hour_e,minute_e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timed_lock);
        nightTime = new Dialog(this);
    }

    public void ShowMyDialog(View view){
        nightTime.setContentView(R.layout.set_time);
        Button saveTimeBt = nightTime.findViewById(R.id.saveButton);
        final TimePicker start = nightTime.findViewById((R.id.timePicker));
        final TimePicker end = nightTime.findViewById((R.id.timePicker2));
        final TextView time = (TextView) findViewById(R.id.textView6);
        saveTimeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set the start time for nighttime
                hour_s = start.getHour();
                minute_s = start.getMinute();
                //Set the end time for nighttime
                hour_e = end.getHour();
                minute_e = end.getMinute();

                Toast.makeText(TimedLock.this,"Time set for " + hour_s + " : " + minute_s + " to "
                        + hour_e + " : " + minute_e, Toast.LENGTH_SHORT).show();
                //Display nighttime time
                time.setText("Time set for " + hour_s + " : " + minute_s + " to "
                        + hour_e + " : " + minute_e);
            }
        });
        Button closeDialogBt = nightTime.findViewById(R.id.dialog_close);
        closeDialogBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nightTime.dismiss();
            }
        });
        nightTime.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        nightTime.show();
    }
}
