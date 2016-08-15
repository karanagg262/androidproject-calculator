package com.example.karan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et1, et2;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.editText);
        et2=(EditText) findViewById(R.id.editText2);
        tv=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                String s1 = et2.getText().toString();
                int flag=0;
                int a=Integer.parseInt(s);
                int b=Integer.parseInt(s1);
                if(flag==0) {
                    int c = a + b;
                    tv.setText(Integer.toString(c));
                }
                else if(flag==1) {
                    int c = a - b;
                    tv.setText(Integer.toString(c));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                String s1 = et2.getText().toString();
                int a=Integer.parseInt(s);
                int b=Integer.parseInt(s1);
                int c = a-b;
                tv.setText(Integer.toString(c));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                String s1 = et2.getText().toString();
                int a=Integer.parseInt(s);
                int b=Integer.parseInt(s1);
                int c = a*b;
                tv.setText(Integer.toString(c));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                String s1 = et2.getText().toString();
                int a=Integer.parseInt(s);
                int b=Integer.parseInt(s1);
                int c = a/b;
                tv.setText(Integer.toString(c));
            }
        });
    }
}
