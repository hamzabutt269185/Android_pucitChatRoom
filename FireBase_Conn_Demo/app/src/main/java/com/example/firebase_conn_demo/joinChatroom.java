package com.example.firebase_conn_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class joinChatroom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_chatroom);
    }

    public void joinChatRoom(View view) {
        Toast toast=Toast. makeText(getApplicationContext(),"You have been joined chatroom successfully",Toast. LENGTH_SHORT);
        toast. show();
    }
}
