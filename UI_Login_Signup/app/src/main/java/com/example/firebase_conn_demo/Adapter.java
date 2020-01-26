package com.example.firebase_conn_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder1> {
    List<User> data ;
    public Adapter(List<User> data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public Adapter.viewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view, parent, false);
        return new viewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder1 holder, int position) {
        User temp = data.get(position);
        holder.txtTitle.setText(temp.name);
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public class viewHolder1 extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;
        TextView userId;

        public viewHolder1(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }
}
