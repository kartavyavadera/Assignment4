package com.example.assignment4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class q6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        CalendarView cv1;
        TextView tvDate;

        cv1=findViewById(R.id.cv1);
        tvDate=findViewById(R.id.tvdate);

        cv1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                tvDate.setText("Date is : " + dayOfMonth +" / " + (month+1) + " / " + year);
            }
        });

        
    }
}