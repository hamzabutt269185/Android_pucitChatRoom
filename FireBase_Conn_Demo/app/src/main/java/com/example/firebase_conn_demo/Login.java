package com.example.firebase_conn_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openDashBoard(View view) {
        Intent intent = new Intent(this,NavDrawer_Activity.class);     //explicit intent   //in explicit this keywords come,means
        startActivity(intent);
    }

    public void openRegister(View view) {
        Intent intent = new Intent(this,Register.class);     //explicit intent   //in explicit this keywords come,means
        startActivity(intent);
    }
}
