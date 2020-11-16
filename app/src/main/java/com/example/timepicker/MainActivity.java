package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void showDialog(View view){
        DialogHandler dialogHandler = new DialogHandler();
        dialogHandler.show(getSupportFragmentManager(),"time_picker");
    }

    public void datePicker(View view){
        DateDialogHandler dateDialogHandler = new DateDialogHandler();
        dateDialogHandler.show(getSupportFragmentManager(),"date_picker");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}