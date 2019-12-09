package com.example.firebase_conn_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.firebase_conn_demo.R;

import java.util.ArrayList;
import java.util.List;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        RecyclerView programmingList = findViewById(R.id.recyclerViewID);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        User u1=new User("Mohsin Ali","bcsf16a002");
        User u2=new User("Hamza Butt","bcsf16a024");
        User u3=new User("Raza Sajjad","bcsf16a032");
        User u4=new User("Shan","bcsf16a033");
        User u5=new User("Hamza Israr","bcsf16a016");
        User u6=new User("Sheraz Ahmed","bcsf16a010");
        User u7=new User("Afzal Ali","bcsf16a012");
        User u8=new User("Shahbaz Naeem","bcsf16a044");
        User u9=new User("Hasham Sabir","bcsf16a043");
        User u10=new User("Usama Masood","bcsf16a004");
        User u11=new User("Bilal Ali","bcsf16a031");
        User u12=new User("Asad Farooqi","bcsf16a037");



        List<User> users=new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);
        users.add(u8);
        users.add(u9);
        users.add(u10);
        users.add(u11);
        users.add(u12);
        programmingList.setAdapter(new Adapter(users));
    }
}
