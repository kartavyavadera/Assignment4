package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        Button btnOrder;
        CheckBox cb1,cb2,cb3,cb4;
        btnOrder=findViewById(R.id.btnOrder);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="";
                int tot=0;
                if(cb1.isChecked())
                {
                    msg=msg+cb1.getText().toString();
                    tot=tot+50;
                }
                if(cb2.isChecked())
                {
                    msg=msg+cb2.getText().toString();
                    tot=tot+50;
                }
                if(cb3.isChecked())
                {
                    msg=msg+cb3.getText().toString();
                    tot=tot+10;
                }
                if(cb4.isChecked())
                {
                    msg=msg+cb4.getText().toString();
                    tot=tot+20;
                }
                Toast.makeText(getApplicationContext(),"You have ordered " + msg +"Total amount : "+ tot, Toast.LENGTH_LONG).show();
            }
        });
    }
}