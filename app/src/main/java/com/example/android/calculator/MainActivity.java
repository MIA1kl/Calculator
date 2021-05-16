package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    double result=0;
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


                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                result = num1 + num2;
                openActivity2(result);
            }
        });

        Button mul_btn = (Button) findViewById(R.id.mulBtn);
        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);


                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                result = num1 * num2;
                openActivity2(result);
            }
        });

        Button div_btn = (Button) findViewById(R.id.divBtn);
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);


                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                 result = num1 / num2;
                openActivity2(result);
            }
        });

        Button sub_btn = (Button) findViewById(R.id.subBtn);
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText a = (EditText) findViewById(R.id.num1);
                EditText b = (EditText) findViewById(R.id.num2);


                double num1 = Integer.parseInt(a.getText().toString());

                double num2 = Integer.parseInt(b.getText().toString());
                result = num1 - num2;
                openActivity2(result);
            }
        });
    }
    public void openActivity2(Double result){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("key",Double.toString(result));
        startActivity(intent);


    }
}