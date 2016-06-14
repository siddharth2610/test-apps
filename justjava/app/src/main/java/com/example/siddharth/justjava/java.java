package com.example.siddharth.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;


import static android.R.attr.id;

/**
 * This app displays an order form to order coffee.
 */
public class java extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
    }
    int num=0;
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(num*5);

        num=0;

    }
    public void composeEmail(String addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_TEXT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void ordersum(View view) {
        CheckBox ck=(CheckBox)findViewById(R.id.checkbox) ;
        EditText et=(EditText)findViewById(R.id.name);
        String str="Name:"+et.getText()+ "\nQty : "+ num +" \nprice : " + num*5+"\nWhippedcream: "+ ck.isChecked();
        composeEmail(str,str);
        displayMessage(str);
        num=0;

    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    public void add(View view) {

        num=num+1;

        display(num);


    }
    public void sub(View view) {

        num=num-1;

        display(num);


    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}