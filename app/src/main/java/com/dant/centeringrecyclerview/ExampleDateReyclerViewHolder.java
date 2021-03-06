package com.dant.centeringrecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.recyclerview.widget.RecyclerView;

public class ExampleDateReyclerViewHolder extends RecyclerView.ViewHolder {

    public ExampleDateReyclerViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.example_date_viewholder, parent, false));
    }

    public void setDate(Date date) {
        ((TextView)(itemView.findViewById(R.id.date_text))).setText(new SimpleDateFormat("EEE d").format(date));
        ((TextView)(itemView.findViewById(R.id.month_text))).setText(new SimpleDateFormat("MMM").format(date));
    }
}
