package com.example.firebase_conn_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    public void openAllContacts(View view) {
        Toast toast=Toast. makeText(getApplicationContext(),"Contact has been added successfully",Toast. LENGTH_SHORT);
        toast. show();
        Intent intent = new Intent(this,Contact.class);     //explicit intent   //in explicit this keywords come,means
        startActivity(intent);
    }
}
