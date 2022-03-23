package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {

    RecyclerView dataList;
    List<String> title;
    List<Integer> images;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        dataList =findViewById(R.id.dataList);

        title = new ArrayList<>();
        images =new ArrayList<>();

        title.add("Clothes");
        title.add("FoodStuffs");
        title.add("Electronics");
        title.add("Shoes");

        images.add(R.drawable.wp3303291);
        images.add(R.drawable.miti);
        images.add(R.drawable.mm);
        images.add(R.drawable.miti);

        adapter= new Adapter(this,title,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4,GridLayoutManager.HORIZONTAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);



    }
}