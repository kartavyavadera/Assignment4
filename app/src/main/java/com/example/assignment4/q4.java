package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class q4 extends AppCompatActivity {
    AutoCompleteTextView atcText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        atcText1 = findViewById(R.id.atcText1);

        String[] countries = {"Australia","India","USA","Canada"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,countries);
        atcText1.setAdapter(adapter);

        atcText1.setThreshold(1);
    }
}