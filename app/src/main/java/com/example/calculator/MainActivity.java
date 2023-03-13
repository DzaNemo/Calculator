package com.example.calculator;

import static com.example.calculator.R.string.one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//mXparser is an open-source mathematical expressions parser/evaluator providing abilities to calculate various expressions at a run time.
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3,btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_dot, btn_pi, btn_equal, btn_plus,btn_mul, btn_inv,
            btn_minus,  btn_div, btn_sqrt, btn_square, btn_fact, btn_ln, btn_log, btn_tan, btn_cos, btn_sin, btn_b1, btn_b2, btn_c, btn_ac;

    TextView tv_main, tv_sec;

    String pi = "3.14159";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);


        btn_equal = findViewById(R.id.btn_equal);
        btn_plus= findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_min);
        btn_mul= findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);

        btn_pi = findViewById(R.id.btn_pi);
        btn_dot = findViewById(R.id.btn_dot);

        btn_inv = findViewById(R.id.btn_inv);
        btn_sqrt= findViewById(R.id.btn_sqrt);
        btn_fact = findViewById(R.id.btn_fact);
        btn_ln = findViewById(R.id.btn_ln);
        btn_log = findViewById(R.id.btn_log);
        btn_tan = findViewById(R.id.btn_tan);
        btn_sin = findViewById(R.id.btn_sin);
        btn_cos = findViewById(R.id.btn_cos);
        btn_b1 = findViewById(R.id.btn_braces1);
        btn_b2 = findViewById(R.id.btn_braces2);
        btn_c = findViewById(R.id.btn_ac);
        btn_ac = findViewById(R.id.btn_clear);

        btn_square = findViewById(R.id.btn_square);

        tv_main = findViewById(R.id.tv_main);
        tv_sec = findViewById(R.id.tv_sec);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "9");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "0");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + ".");
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText("");
                tv_sec.setText("");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tv_main.getText().toString();
                val = val.substring(0,val.length() - 1);
                tv_main.setText(val);
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "-");
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "×");
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "÷");
            }
        });

        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String val = tv_main.getText().toString();
               double r = Math.sqrt(Double.parseDouble(val));
               tv_main.setText(String.valueOf(r));
            }
        });

        btn_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "(");
            }
        });

        btn_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + ")");
            }
        });

        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_sec.setText(btn_pi.getText());
                tv_main.setText(tv_main.getText() + pi);
            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "sin");
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "cos");
            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "tan");
            }
        });

        btn_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_main.setText(tv_main.getText() + "inv");
            }
        });

        btn_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(tv_main.getText().toString());
                int fact = factorial(val);
                tv_main.setText(String.valueOf(fact));
                tv_sec.setText(val + "!");
            }
        });

        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(tv_main.getText().toString());
                double square = d * d;
                tv_main.setText(String.valueOf(square));
                tv_sec.setText(d + "²");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String val = tv_main.getText().toString();
                val = val.replaceAll("÷","/");
                val = val.replaceAll("×","*");

                /*
                    mXparser is an open-source mathematical expressions parser/evaluator providing
                    abilities to calculate various expressions at a run time.
                 */
                Expression exp = new Expression(val);

                String result = String.valueOf(exp.calculate());

                tv_main.setText(result);
                tv_sec.setText(result);

            }
        });

    }

    int factorial (int n){
        return (n==1 || n==0) ? 1 : n * factorial(n-1);
    }



}