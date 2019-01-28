package com.dant.centeringrecyclerview;

import android.os.Bundle;

import com.dant.centersnapreyclerview.SnappingRecyclerView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        SnappingRecyclerView recyclerView = (SnappingRecyclerView) findViewById(R.id.recyclerview);
        recyclerView.addItemDecoration(new ExampleDateEndPaddingItemDecoration(recyclerView.getOrientation()));
        recyclerView.setAdapter(new ExampleDateAdapter());
    }
}