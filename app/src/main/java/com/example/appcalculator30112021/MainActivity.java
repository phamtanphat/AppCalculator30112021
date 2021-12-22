package com.example.appcalculator30112021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEdtNumber1,mEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus,mBtnMinus,mBtnDivision,mBtnMultiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ánh xạ
        mEdtNumber1 = findViewById(R.id.edittextNumber1);
        mEdtNumber2 = findViewById(R.id.edittextNumber2);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnMinus = findViewById(R.id.buttonMinus);
        mBtnDivision = findViewById(R.id.buttonDivision);
        mBtnMultiplication = findViewById(R.id.buttonMultiplication);


        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = mEdtNumber1.getText().toString();
                String n2 = mEdtNumber2.getText().toString();
                if (n1.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else if (n2.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else {
                    String kq = String.valueOf((Float.valueOf(n1)) + (Float.valueOf(n2)));
                    mTvResult.setText(kq);
                }
            }
        });

        mBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = mEdtNumber1.getText().toString();
                String n2 = mEdtNumber2.getText().toString();
                if (n1.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else if (n2.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else {
                    String kq = String.valueOf((Float.valueOf(n1)) - (Float.valueOf(n2)));
                    mTvResult.setText(kq);
                }
            }
        });

        mBtnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = mEdtNumber1.getText().toString();
                String n2 = mEdtNumber2.getText().toString();
                if (n1.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else if (n2.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else {
                    String kq = String.valueOf((Float.valueOf(n1)) * (Float.valueOf(n2)));
                    mTvResult.setText(kq);
                }
            }
        });

        mBtnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = mEdtNumber1.getText().toString();
                String n2 = mEdtNumber2.getText().toString();
                if (n1.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                } else if (n2.equals("")) {
                    Toast.makeText(MainActivity.this, "Nhập dữ liệu", Toast.LENGTH_SHORT).show();
                }
                else if (n2.equals("0")) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập dữ liệu khác số 0 ", Toast.LENGTH_SHORT).show();
                } else {
                    String kq = String.valueOf((Float.valueOf(n1)) / (Float.valueOf(n2)));
                    mTvResult.setText(kq);
                }
            }
        });

    }
}