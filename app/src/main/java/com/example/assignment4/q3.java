package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        EditText username,password;
        TextView tvCourse,tvName;
        Button btnSubmit;
        RadioGroup rg;
        RadioButton r1;
        RadioButton r2;
        RadioButton r3;
        RadioButton r4;
        RadioButton r5;
        final RadioButton[] selectedRadioButton = new RadioButton[1];

        rg=findViewById(R.id.radio);
        r1=findViewById(R.id.java);
        r2=findViewById(R.id.python);
        r3=findViewById(R.id.c1);
        r4=findViewById(R.id.C2);
        r5=findViewById(R.id.android);
        tvCourse=findViewById(R.id.tvCourse);
        tvName=findViewById(R.id.tvName);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedRadioButtonId = rg.getCheckedRadioButtonId();
                if (selectedRadioButtonId != -1) {
                    selectedRadioButton[0] = findViewById(selectedRadioButtonId);
                    String selectedRbText = selectedRadioButton[0].getText().toString();
                    tvCourse.setText(selectedRbText + " is Selected");
                    tvName.setText(username.getText().toString());
                } else {
                    tvName.setText(username.getText().toString());

                    tvCourse.setText("Nothing selected from the radio group");
                }

            }
        });
    }
}