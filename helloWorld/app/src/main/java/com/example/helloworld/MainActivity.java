package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myImageView = findViewById(R.id.myImageView);
        myImageView.setImageResource(R.drawable.tree);

        TextView myTextView = findViewById(R.id.myTextView);
        myTextView.setText("Hello World!");

        EditText myEditText = findViewById(R.id.myEditText);



        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(v -> {
            myTextView.setText(myEditText.getText().toString());

            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        });
    }
}