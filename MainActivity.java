package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView intro;
    private TextView one;
    private TextView two;
    private TextView sol;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        sol=findViewById(R.id.sol);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();

                int v1=Integer.parseInt(s1);
                int v2=Integer.parseInt(s2);

                double sum=v1+v2;
                double sub=v1-v2;
                sol.setText("\nSum = "+sum+"\n Sub = "+sub);


            }
        });
    }
}