/*
 * CSC 490
 * Assignment #1
 * Authors: Maegan Patterson and Genesis Sarmiento
 * This app allows the user to count a variety of birds
 */

package com.example.birdcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button minusButton;
    Button plusButton;
    TextView birdNumber;
    Spinner birdSpinner;
    Bird[] birdArray;
    ImageView birdImage;

    //Set up the app when opening it
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minusButton =(Button)findViewById(R.id.minusButton);
        plusButton =(Button)findViewById(R.id.plusButton);
        birdNumber =(TextView)findViewById(R.id.birdNumber);
        birdImage = (ImageView) findViewById(R.id.birdImage);

        //All the birds in the spinner
        birdArray = new Bird[]{new Bird("Eagle", String.valueOf(R.drawable.screamingeagle)),
                new Bird("Puffin", R.drawable.screaming_puffin + ""),
                new Bird("Zebra Finch", R.drawable.zebrafinch + ""),
                new Bird("Penguin", R.drawable.penguin + ""),
                new Bird("Flamingo", R.drawable.flamingo + ""),
                new Bird("Emu", R.drawable.emu + ""),
                new Bird("Kiwi", R.drawable.kiwi + ""),
                new Bird("Duck", R.drawable.duck + ""),
                new Bird("Goose", R.drawable.goose + ""),
                new Bird("Chicken", R.drawable.chicken + ""),
                new Bird("Seagull", R.drawable.seagull + ""),
                new Bird("Parrot", R.drawable.parrot + ""),
                new Bird("Cockatiel", R.drawable.cockatiel + ""),
                new Bird("Pigeon", R.drawable.pigeon + ""),
                new Bird("Owl", R.drawable.owl + ""),
                new Bird("Budgerigar", R.drawable.budgie + ""),
                new Bird("Toucan", R.drawable.toucan + ""),
                new Bird("Woodpecker", R.drawable.woodpecker + ""),
                new Bird("Hummingbird", R.drawable.hummingbird + ""),
                new Bird("Blue Jay", R.drawable.bluejay + "")};

        birdSpinner = (Spinner) findViewById(R.id.birdSpinner);
        ArrayAdapter<Bird> adapter = new ArrayAdapter<Bird>(this,
                android.R.layout.simple_spinner_dropdown_item, birdArray);
        birdSpinner.setAdapter(adapter);

        birdSpinner.setOnItemSelectedListener(this);

        //Clicking the plus button increases count
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birdNumber.setText((Integer.parseInt(birdNumber.getText().toString()) + 1) + "");

                birdArray[birdSpinner.getSelectedItemPosition()].setCount(birdNumber.getText() + "");
            }
        });

        //Clicking the minus button decreases count
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(birdNumber.getText().toString()) > 0) {
                    birdNumber.setText((Integer.parseInt(birdNumber.getText().toString()) - 1) + "");
                    birdArray[birdSpinner.getSelectedItemPosition()].setCount(birdNumber.getText() + "");
                }
            }
        });

    }

    /**
     * Method from AdapterView.OnItemSelectedListener interface that allows us to set textview with count
     * of each bird and picture in imageview
     *
     * @param parent is the adapter in the spinner
     * @param view is the selected bird
     * @param pos is the index of the bird
     * @param id is the row ID of the bird
     */
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        birdNumber.setText(birdArray[pos].getCount());
        birdImage.setImageResource(Integer.parseInt(birdArray[pos].getPicture()));
    }

    /**
     * Method from AdapterView.OnItemSelectedListener interface
     * Not used, you have to select one of the items
     *
     * @param parent is the adapter in the spinner
     */
    public void onNothingSelected(AdapterView<?> parent) {}



}
