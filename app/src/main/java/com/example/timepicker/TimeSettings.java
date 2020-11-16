package com.example.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimeSettings implements TimePickerDialog.OnTimeSetListener {
    Context context;
    String meridiem;
    public TimeSettings(Context context){
        this.context = context;
    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        if(hourOfDay>=13 && hourOfDay<=24){
            hourOfDay -= 12;
            meridiem = "PM";
        }
        else if(hourOfDay==0){
            meridiem="AM";
            hourOfDay = 12;
        }
        else{
            meridiem="AM";
        }


        Toast.makeText(context, "Selected time is "+hourOfDay+" : "+minute +meridiem,Toast.LENGTH_LONG).show();
    }
}
