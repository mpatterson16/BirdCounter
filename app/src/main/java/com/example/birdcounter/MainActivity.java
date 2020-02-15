package com.example.birdcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button eagleMinusButton;
    Button eaglePlusButton;
    TextView eagleNumber;
    Spinner birdSpinner;
    Bird[] birdArray;
    ImageView birdImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eagleMinusButton=(Button)findViewById(R.id.eagleMinusButton);
        eaglePlusButton=(Button)findViewById(R.id.eaglePlusButton);
        eagleNumber=(TextView)findViewById(R.id.eagleNumber);
        birdImage = (ImageView) findViewById(R.id.birdImage);

        birdArray = new Bird[]{new Bird("Eagle", R.drawable.screamingeagle + ""), new Bird("Puffin", R.drawable.screaming_puffin + "")};
        birdSpinner = (Spinner) findViewById(R.id.birdSpinner);
        ArrayAdapter<Bird> adapter = new ArrayAdapter<Bird>(this,
                android.R.layout.simple_spinner_dropdown_item, birdArray);
        birdSpinner.setAdapter(adapter);

        birdSpinner.setOnItemSelectedListener(this);

        eaglePlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eagleNumber.setText((Integer.parseInt(eagleNumber.getText().toString()) + 1) + "");

                birdArray[birdSpinner.getSelectedItemPosition()].setCount(eagleNumber.getText() + "");
            }
        });

        eagleMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(eagleNumber.getText().toString()) > 0) {
                    eagleNumber.setText((Integer.parseInt(eagleNumber.getText().toString()) - 1) + "");
                    birdArray[birdSpinner.getSelectedItemPosition()].setCount(eagleNumber.getText() + "");
                }
            }
        });

    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        eagleNumber.setText(birdArray[pos].getCount());
        birdImage.setImageResource(Integer.parseInt(birdArray[pos].getPicture()));
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }



}
