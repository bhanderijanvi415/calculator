package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView ans_text;
    String temp = "";
    int a,b;
    Button ac_btn, divide_btn, pr_btn, cross_btn, seven_btn, eight_btn, nine_btn, multi_btn, four_btn, five_btn, six_btn,
            sub_btn, one_btn, two_btn, three_btn, add_btn, tzero_btn, zero_btn, dot_btn, equal_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // multi();
                add();
               // sub();
                //divide();
                //pr();
            }
        });

        ac_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans_text.setText("");
                temp = "";
            }
        });

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += seven_btn.getText().toString();
                ans_text.setText(temp);
                b = 7;
            }
        });

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += eight_btn.getText().toString();
                ans_text.setText(temp);
                b = 8;
            }
        });

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += nine_btn.getText().toString();
                ans_text.setText(temp);
                b=9;
            }
        });

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += four_btn.getText().toString();
                ans_text.setText(temp);
                b=4;
            }
        });

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += five_btn.getText().toString();
                ans_text.setText(temp);
                b=5;
            }
        });


        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += six_btn.getText().toString();
                ans_text.setText(temp);
                b=6;
            }
        });

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += one_btn.getText().toString();
                ans_text.setText(temp);
                b = 1;
            }
        });

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += two_btn.getText().toString();
                ans_text.setText(temp);
                b = 2;
            }
        });

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += three_btn.getText().toString();
                ans_text.setText(temp);
                b = 3;
            }
        });

        tzero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += tzero_btn.getText().toString();
                ans_text.setText(temp);
            }
        });

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += zero_btn.getText().toString();
                ans_text.setText(temp);
                b = 0;
            }
        });

        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += dot_btn.getText().toString();
                ans_text.setText(temp);
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += divide_btn.getText().toString();
                ans_text.setText(temp);
                a = Integer.parseInt(temp);
            }
        });

        pr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += pr_btn.getText().toString();
                ans_text.setText(temp);
                a = Integer.parseInt(temp);
            }
        });

        cross_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += cross_btn.getText().toString();
                ans_text.setText(temp);
            }
        });

        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += multi_btn.getText().toString();
                ans_text.setText(temp);
                a = Integer.parseInt(temp);
            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp += sub_btn.getText().toString();
                ans_text.setText(temp);
                a = Integer.parseInt(temp);
            }
        });

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(temp);
                temp += add_btn.getText().toString();
                ans_text.setText(temp);
            }
        });



    }


    void binding() {
        ans_text = findViewById(R.id.ans_text);
        ac_btn = findViewById(R.id.ac_btn);
        divide_btn = findViewById(R.id.divide_btn);
        pr_btn = findViewById(R.id.pr_btn);
        cross_btn = findViewById(R.id.cross_btn);
        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        multi_btn = findViewById(R.id.multi_btn);
        four_btn = findViewById(R.id.four_btn);
        five_btn = findViewById(R.id.five_btn);
        six_btn = findViewById(R.id.six_btn);
        sub_btn = findViewById(R.id.sub_btn);
        one_btn = findViewById(R.id.one_btn);
        two_btn = findViewById(R.id.two_btn);
        three_btn = findViewById(R.id.three_btn);
        add_btn = findViewById(R.id.add_btn);
        tzero_btn = findViewById(R.id.tzero_btn);
        zero_btn = findViewById(R.id.zero_btn);
        dot_btn = findViewById(R.id.dot_btn);
        equal_btn = findViewById(R.id.equal_btn);
    }


    void sub()
    {
        int c = a-b;
        ans_text.setText(c+"");
    }

    void multi()
    {
        int c = a*b;
        ans_text.setText(c+"");
    }

    void divide()
    {
        int c = a/b;
        ans_text.setText(c+"");
    }


    void pr()
    {
        int c = a%b;
        ans_text.setText(c+"");
    }

    void add()
    {
        int c = a+b;
        ans_text.setText(c+"");
    }
}











