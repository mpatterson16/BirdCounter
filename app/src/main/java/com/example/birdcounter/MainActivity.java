package com.example.birdcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button eagleMinusButton;
    Button eaglePlusButton;
    TextView eagleNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eagleMinusButton=(Button)findViewById(R.id.eagleMinusButton);
        eaglePlusButton=(Button)findViewById(R.id.eaglePlusButton);
        eagleNumber=(TextView)findViewById(R.id.eagleNumber);

        eaglePlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eagleNumber.setText((Integer.parseInt(eagleNumber.getText().toString()) + 1) + "");
            }
        });

        eagleMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(eagleNumber.getText().toString()) > 0) {
                    eagleNumber.setText((Integer.parseInt(eagleNumber.getText().toString()) - 1) + "");
                }


            }
        });

    }




}
