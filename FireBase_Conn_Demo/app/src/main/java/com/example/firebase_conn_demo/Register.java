package com.example.firebase_conn_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void openLoginPage(View view) {
        Intent intent = new Intent(this,Login.class);     //explicit intent   //in explicit this keywords come,means
        startActivity(intent);
    }
}
