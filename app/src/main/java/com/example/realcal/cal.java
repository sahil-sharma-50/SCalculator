package com.example.realcal;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class cal extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    Button b1,b2,b3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        e1 = (EditText)findViewById(R.id.input1);
        e2 = (EditText)findViewById(R.id.input2);
        t1 = (TextView)findViewById(R.id.result);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = e1.getText().toString();
                String s1 = e2.getText().toString();

                int a = Integer.parseInt(s);
                int b = Integer.parseInt(s1);
                int result = a + b;
                String result1 = String.valueOf(result);
                t1.setText(result1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = e1.getText().toString();
                String s1 = e2.getText().toString();

                int a = Integer.parseInt(s);
                int b = Integer.parseInt(s1);
                int result = a - b;
                String result1 = String.valueOf(result);
                t1.setText(result1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = e1.getText().toString();
                String s1 = e2.getText().toString();

                int a = Integer.parseInt(s);
                int b = Integer.parseInt(s1);
                int result = a * b;
                String result1 = String.valueOf(result);
                t1.setText(result1);
            }
        });
    }
}