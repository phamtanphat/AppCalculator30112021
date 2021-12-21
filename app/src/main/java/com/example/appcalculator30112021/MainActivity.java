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
    EditText mnumber1 , mnumber2;
    TextView mresult;
    Button mbuttonAdd, mbuttonMinus , mbuttonMultipli, mbuttonDev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        mnumber1 = findViewById(R.id.number1);
        mnumber2 = findViewById(R.id.number2);
        mresult = findViewById(R.id.result);
        mbuttonAdd = findViewById(R.id.buttonAdd);
        mbuttonMinus = findViewById(R.id.buttonMinus);
        mbuttonMultipli = findViewById(R.id.buttonMultipli);
        mbuttonDev = findViewById(R.id.buttonDev);

        //Hàm kiểm tra giá trị
//        int a = 5;
//
//        Log.d("BBB",String.valueOf(a) );
        //Hàm hiển thị thông báo
        Toast.makeText(MainActivity.this, "Phạm Hoàng Thư", Toast.LENGTH_SHORT).show();
        //bắt sự kiện
        mbuttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lấy dữ liệu input
                String number1 = mnumber1.getText().toString();
                String number2 = mnumber2.getText().toString();
                if(number1.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ nhất đi kìa", Toast.LENGTH_SHORT).show();
                }
                else if(number2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ hai đi kìa", Toast.LENGTH_SHORT).show();
                }
                else{
                    String result = String.valueOf((Float.valueOf(number1)  + Float.valueOf(number2))) ;
                    mresult.setText(result);

                }

                Log.d("BBB", "text number 1: " + number1);
                Log.d("BBB", "text number 2: " + number2);


            }
        });
        mbuttonDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lấy dữ liệu input
                String number1 = mnumber1.getText().toString();
                String number2 = mnumber2.getText().toString();
                String result;
                if(number1.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ nhất đi kìa", Toast.LENGTH_SHORT).show();
                }
                else if(number2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ hai đi kìa", Toast.LENGTH_SHORT).show();
                }
                else if(number2.equals(0))
                {
                    Toast.makeText(MainActivity.this, "Không chia cho 0 được nhoa", Toast.LENGTH_SHORT).show();
                }
                else{

                    result = String.valueOf((Float.valueOf(number1) / Float.valueOf(number2)));
                    mresult.setText(result);

                }

                Log.d("BBB", "text number 1: " + number1);
                Log.d("BBB", "text number 2: " + number2);


            }

        });
        mbuttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lấy dữ liệu input
                String number1 = mnumber1.getText().toString();
                String number2 = mnumber2.getText().toString();
                String result;
                if(number1.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ nhất đi kìa", Toast.LENGTH_SHORT).show();
                }
                else if(number2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ hai đi kìa", Toast.LENGTH_SHORT).show();
                }
                else{

                    result = String.valueOf((Float.valueOf(number1) - Float.valueOf(number2)));
                    mresult.setText(result);

                }

                Log.d("BBB", "text number 1: " + number1);
                Log.d("BBB", "text number 2: " + number2);


            }

        });
        mbuttonMultipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lấy dữ liệu input
                String number1 = mnumber1.getText().toString();
                String number2 = mnumber2.getText().toString();
                String result;
                if(number1.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ nhất đi kìa", Toast.LENGTH_SHORT).show();
                }
                else if(number2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Nhập vô ô thứ hai đi kìa", Toast.LENGTH_SHORT).show();
                }
                else{

                    result = String.valueOf((Float.valueOf(number1) * Float.valueOf(number2)));
                    mresult.setText(result);

                }

                Log.d("BBB", "text number 1: " + number1);
                Log.d("BBB", "text number 2: " + number2);


            }

        });




//        //tham tri
//        int a = 5;
//        int b = 10;
//
//        a= b;
//        //b thay dooir a ko thay ddoi

        //thham chieu

//        Object obj1 = new Object();
//        Log.d("BBB" , "Before obj 1" +obj1);
//        Object obj2 = new Object();
//        Log.d("BBB" , "Before obj 2" + obj2);
//        obj1 =obj2;
//        Log.d("BBB" , "after obj 1" + obj1);
//        Log.d("BBB" , "after obj 2"+ obj2);

    }
}