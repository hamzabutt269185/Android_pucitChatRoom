package com.example.firebase_conn_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddChatRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_chat_room);
    }

    public void addChatRoom(View view) {
        Toast toast=Toast. makeText(getApplicationContext(),"ChatRoom has been added successfully",Toast. LENGTH_SHORT);
        toast. show();
    }
}
