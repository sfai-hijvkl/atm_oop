package com.example.atmoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Bank bank;
    private EditText input;
    private Button smallbank;
    private Button bigbank;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        smallbank = findViewById(R.id.smallBank);
        bigbank = findViewById(R.id.bigBank);
        output = findViewById(R.id.output);

        bank = new Bank();

        smallbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bank = new smallbank(Double.parseDouble(input.getText().toString()));
                double interest = bank.computeInterest();
                output.setText("Interest "+interest);
                input.setText("");
                output.setText("Interest "+interest);
            }
        });

        bigbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bank = new bigbank(Double.parseDouble(input.getText().toString()));
                double interest = bank.computeInterest();
                output.setText("Interest "+interest);
                input.setText("");
                output.setText("Interest "+interest);
            }
        });

    }
}