package com.example.birdcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button eagleMinusButton;
    Button eaglePlusButton;
    EditText eagleNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eagleMinusButton=(Button)findViewById(R.id.eagleMinusButton);
        eaglePlusButton=(Button)findViewById(R.id.eaglePlusButton);
        eagleNumber=(EditText)findViewById(R.id.eagleNumber);

        eaglePlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }




}
