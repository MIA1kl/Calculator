package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add_btn = (Button) findViewById(R.id.addBtn);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);
                TextView res = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                double result = num1 + num2;
                res.setText(Double.toString(result));
            }
        });

        Button mul_btn = (Button) findViewById(R.id.mulBtn);
        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);
                TextView res = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                double result = num1 * num2;
                res.setText(Double.toString(result));
            }
        });

        Button div_btn = (Button) findViewById(R.id.divBtn);
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);
                TextView res = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                double result = num1 / num2;
                res.setText(Double.toString(result));
            }
        });

        Button sub_btn = (Button) findViewById(R.id.subBtn);
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);
                TextView res = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                double result = num1 - num2;
                res.setText(Double.toString(result));
            }
        });
    }
}