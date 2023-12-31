package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private Button button, button2, button3, button4;
    private TextView textView, textView2, textView3, textView4, textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        textView5 = (TextView) findViewById(R.id.textView5);
        button = (Button) findViewById((R.id.button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 100;
                double result = 0.0;

                if (button.getText().toString().equals("")){
                    textView5.setText(R.string.error_message);
                    textView5.setTextColor(Color.RED);

                }
                else {
                    double cmvalue = Double.parseDouble(editText1.getText().toString());
                    result= cmvalue*multiplier;

                    textView5.setTextColor(Color.DKGRAY);
                    textView5.setText(String.format("%.2f", result)+ " cm");
                }
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 0.01;
                double result = 0.0;

                if (button2.getText().toString().equals("")){
                    textView5.setText(R.string.error_message);
                    textView5.setTextColor(Color.RED);

                }
                else {
                    double mvalue = Double.parseDouble(editText1.getText().toString());
                    result= mvalue*multiplier;

                    textView5.setTextColor(Color.DKGRAY);
                    textView5.setText(String.format("%.2f", result)+ " m");
                }
            }

        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier= 1000;
                double result = 0.0;

                if (button3.getText().toString().equals("")){
                    textView5.setText(R.string.error_message);
                    textView5.setTextColor(Color.RED);

                }
                else {
                    double kgvalue = Double.parseDouble(editText1.getText().toString());
                    result= kgvalue*multiplier;

                    textView5.setTextColor(Color.DKGRAY);
                    textView5.setText(String.format("%.2f", result)+ " g");
                }
            }

        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = 0.001;
                double result = 0.0;
                if (button4.getText().toString().equals("")){
                    textView5.setText(R.string.error_message);
                    textView5.setTextColor(Color.RED);

                }
                else {
                    double gvalue = Double.parseDouble(editText1.getText().toString());
                    result= gvalue*multiplier;

                    textView5.setTextColor(Color.DKGRAY);
                    textView5.setText(String.format("%.2f", result)+ " kg");
                }
            }


        });
    }
}