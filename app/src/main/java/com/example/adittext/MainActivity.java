package com.example.adittext;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView tv1;TextView tv2;TextView tv3;TextView tv4;TextView tv5;TextView tv6;
    EditText et1;EditText et2;EditText et3;
    ImageView iv1;ImageView iv2;ImageView iv3;
    Button btn1;Button btn2;Button btn3;Button btn4;
    Random rnd = new Random();
    Scanner in = new Scanner(System.in);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        int random_num1 = rnd.nextInt(89)+10;
        tv1.setText(String.valueOf(random_num1));
        int random_num2 = rnd.nextInt(89)+10;
        tv2.setText(String.valueOf(random_num2));
    }

    public void pressed1(View view) {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        String ET1 = et1.getText().toString();
        int ansEt1 = Integer.parseInt(ET1);
        String TV1 = tv1.getText().toString();
        int ranTv1 = Integer.parseInt(TV1);
        String TV2 = tv2.getText().toString();
        int ranTv2 = Integer.parseInt(TV2);
        if(ansEt1==ranTv1+ranTv2)
        {
            iv1.setImageResource(R.drawable.v);
            et1.setEnabled(false);
            Toast.makeText(this, "1/3", Toast.LENGTH_SHORT).show();
        }
        else
        {
            iv1.setImageResource(R.drawable.x);
            et1.setEnabled(false);
            Toast.makeText(this, "0/3", Toast.LENGTH_SHORT).show();
        }
        tv3.setText(String.valueOf(ranTv1+ranTv2));
        int random_num3 = rnd.nextInt(89)+10;
        tv4.setText(String.valueOf(random_num3));
        btn2.setEnabled(true);
    }

    public void pressed2(View view) {
        btn2.setEnabled(false);
        btn1.setEnabled(false);
        btn3.setEnabled(false);
        String ET2 = et2.getText().toString();
        int ansEt2 = Integer.parseInt(ET2);
        String TV3 = tv3.getText().toString();
        int ranTv3 = Integer.parseInt(TV3);
        String TV4 = tv4.getText().toString();
        int ranTv4 = Integer.parseInt(TV4);
        if(ansEt2==ranTv3+ranTv3)
        {
            iv2.setImageResource(R.drawable.v);
            et2.setEnabled(false);
            Toast.makeText(this, "2/3", Toast.LENGTH_SHORT).show();
        }
        else
        {
            iv2.setImageResource(R.drawable.x);
            et2.setEnabled(false);
            Toast.makeText(this, "1/3", Toast.LENGTH_SHORT).show();
        }
        tv5.setText(String.valueOf(ranTv3+ranTv4));
        int random_num4 = rnd.nextInt(89)+10;
        tv6.setText(String.valueOf(random_num4));
        btn3.setEnabled(true);
    }

    public void pressed3(View view) {
        btn3.setEnabled(false);
        btn2.setEnabled(false);
        btn1.setEnabled(false);
        String ET3 = et3.getText().toString();
        int ansEt3 = Integer.parseInt(ET3);
        String TV5 = tv5.getText().toString();
        int ranTv5 = Integer.parseInt(TV5);
        String TV6 = tv6.getText().toString();
        int ranTv6 = Integer.parseInt(TV6);
        if(ansEt3==ranTv5+ranTv6)
        {
            iv3.setImageResource(R.drawable.v);
            et3.setEnabled(false);
            Toast.makeText(this, "3/3", Toast.LENGTH_SHORT).show();
        }
        else
        {
            iv3.setImageResource(R.drawable.x);
            et3.setEnabled(false);
            Toast.makeText(this, "2/3", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
        tv1.setText("TextView");
        tv2.setText("TextView");
        tv3.setText("TextView");
        tv4.setText("TextView");
        tv5.setText("TextView");
        tv6.setText("TextView");
        et1.setText("");
        et2.setText("");
        et3.setText("");
        iv1.setImageBitmap(null);
        iv2.setImageBitmap(null);
        iv3.setImageBitmap(null);
        et1.setEnabled(true);
        et2.setEnabled(true);
        et3.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        int random_num1 = rnd.nextInt(89)+10;
        tv1.setText(String.valueOf(random_num1));
        int random_num2 = rnd.nextInt(89)+10;
        tv2.setText(String.valueOf(random_num2));
    }
}