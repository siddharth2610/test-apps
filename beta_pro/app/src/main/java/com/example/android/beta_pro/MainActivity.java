package com.example.android.beta_pro;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



public void add_contact(View view) {
    EditText name=(EditText)findViewById(R.id.name);
    EditText num=(EditText)findViewById(R.id.num);
    String str=name.getText().toString();
    String strn=num.getText().toString();

    Intent intent = new Intent(Intent.ACTION_INSERT);
    intent.setType(ContactsContract.Contacts.CONTENT_TYPE);

    intent.putExtra(ContactsContract.Intents.Insert.NAME,str);
    intent.putExtra(ContactsContract.Intents.Insert.PHONE, strn);


    startActivity(intent);






        }
}