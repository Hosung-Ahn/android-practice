package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView yardText;
    EditText numberInput;
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yardText = findViewById(R.id.yardText);
        numberInput = findViewById(R.id.numberInput);
        convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(v -> {
            String input = numberInput.getText().toString();
            if (input.isEmpty()) {
                yardText.setText("숫자를 입력해주세요.");
            } else {
                double number = Double.parseDouble(input);
                double result = number * 1.09361;
                yardText.setText(String.valueOf(result));
            }
        });
    }
}