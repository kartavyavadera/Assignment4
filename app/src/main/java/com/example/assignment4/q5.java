package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class q5 extends AppCompatActivity {
    SeekBar seekbar;
    TextView message,m2;
    RatingBar ratingBar;
    Button btnGetR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        message= findViewById(R.id.m1);
        seekbar= findViewById(R.id.seekbar);
        m2=findViewById(R.id.m2);
        ratingBar=findViewById(R.id.rb);
        btnGetR=findViewById(R.id.btnGetR);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                message.setText(progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnGetR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating=String.valueOf(ratingBar.getRating());
                m2.setText(rating);
            }
        });

    }
}