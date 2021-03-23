package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etf1;
    Button btnf1;
    EditText etf2;
    Button btnf2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnf1=findViewById(R.id.btnf1);
        btnf2=findViewById(R.id.btnf2);
        etf1=findViewById(R.id.etf1);
        etf2=findViewById(R.id.etf2);


        btnf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etf1.setText("Hii Kartavya");
            }
        });

        btnf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etf2.setText("Hii Vadera");
            }
        });

    }
}