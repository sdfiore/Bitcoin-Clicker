/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.cat_bat.bitcoinclicker
 * If you get an error when copying this code into Android studio, update it to match the package name found
 * in the project's AndroidManifest.xml file.
 **/
package com.example.cat_bat.bitcoinclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    double bit = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method generates a random double, and adds the value to bit.
     */
    public void generate(View view) {
        bit = bit + rand.nextDouble();
        TextView bitcoin = (TextView)findViewById(R.id.number);
        String bitString = String.valueOf(bit);
        bitcoin.setText(bitString);
    }

    /**
     * This method resets the value of bit by subtracting it from itself,
     * and converts the value of double bit to int 0.
     */
    public void reset(View view) {
        bit = bit - bit;
        int zero = (int)bit;
        TextView bitcoin = (TextView)findViewById(R.id.number);
        String resetString = String.valueOf(zero);
        bitcoin.setText(resetString);
    }
}
