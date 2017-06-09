package com.example.thanyani.rudzanicoffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the button order is clicked.
     */
    public void submitOrder(View view){
        display(1);
    }
    /**
     * This method will display the given quantity value on the screen.
     */
    private void display(int number){
        TextView quantityTextView= (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }
    /**
     * This method will display the price on the screen.
     */
    private void displayPrice(int number){
        
    }
}
