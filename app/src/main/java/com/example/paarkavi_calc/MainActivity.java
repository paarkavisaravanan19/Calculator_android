package com.example.paarkavi_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView res=findViewById(R.id.result);
        EditText input1=findViewById(R.id.input1);
        EditText input2=findViewById(R.id.input2);
        Button add =findViewById(R.id.add);
        Button sub =findViewById(R.id.sub);
        Button mul =findViewById(R.id.mul);
        Button div =findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(input1.getText().toString());
                int b=Integer.parseInt(input2.getText().toString());
                res.setText(Integer.toString(a+b));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(input1.getText().toString());
                int b=Integer.parseInt(input2.getText().toString());
                res.setText(Integer.toString(a-b));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(input1.getText().toString());
                int b=Integer.parseInt(input2.getText().toString());
                res.setText(Integer.toString(a*b));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(input1.getText().toString());
                int b=Integer.parseInt(input2.getText().toString());
                res.setText(Integer.toString(a/b));

            }
        });


    }
}