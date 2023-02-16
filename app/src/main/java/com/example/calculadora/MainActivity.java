package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.CalcStepsRegister;
import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private EditText etNum;
    private Button btSum, btRest, btMult, btDiv, btResult;
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0;
    private TextView tvResult;
    private String exp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNum = findViewById(R.id.etNum);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        bt0 = findViewById(R.id.bt0);

        btSum = findViewById(R.id.btSum);
        btRest = findViewById(R.id.btRest);
        btMult = findViewById(R.id.btMult);
        btDiv = findViewById(R.id.btDiv);

        tvResult = findViewById(R.id.tvResult);

        btSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "+";
                etNum.setText(exp);

            }
        });

        btRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "-";
                etNum.setText(exp);
            }
        });
        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "*";
                etNum.setText(exp);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "/";
                etNum.setText(exp);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "1";
                etNum.setText(exp);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "2";
                etNum.setText(exp);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "3";
                etNum.setText(exp);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "4";
                etNum.setText(exp);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "5";
                etNum.setText(exp);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "6";
                etNum.setText(exp);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "7";
                etNum.setText(exp);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "8";
                etNum.setText(exp);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "9";
                etNum.setText(exp);
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp += "0";
                etNum.setText(exp);
            }
        });

        btResult = findViewById(R.id.btResult);

        btResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Expression e = new Expression(exp);
                CalcStepsRegister c = new CalcStepsRegister();
                String result = e.calculate(c) + "";
                tvResult.setText(result);
            }
        });

    }
}
