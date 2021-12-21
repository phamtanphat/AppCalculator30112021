package com.example.appcalculator30112021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    }
}