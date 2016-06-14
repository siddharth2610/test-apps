package com.example.siddharth.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void after(View view)
    {
    image();
        text();
    }
    private void image()
    {
        ImageView image=(ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.after_cookie);
    }
    private void text()
    {
        TextView txt=(TextView) findViewById(R.id.txt);
        txt.setText("I am not hungry");
    }
}
