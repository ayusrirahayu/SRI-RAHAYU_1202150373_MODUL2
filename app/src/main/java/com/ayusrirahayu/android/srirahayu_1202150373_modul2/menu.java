package com.ayusrirahayu.android.srirahayu_1202150373_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 1; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Bubblegum Candy Donut");
            foods.add("Strawberry Frosted Donut");
            foods.add("Double Chocolate Donut");
            foods.add("Boston Cream Donut");
            foods.add("Lemon Sprinkle Donut");
            foods.add("Boston Chocolate Donut");
            foods.add("Double Cream Donut");
            foods.add("Red Cream Donut");

            // mamanggil harga
            priceses.add(30000);
            priceses.add(35000);
            priceses.add(45000);
            priceses.add(40000);
            priceses.add(40000);
            priceses.add(45000);
            priceses.add(40000);
            priceses.add(40000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.donut);
            photos.add(R.drawable.donut2);
            photos.add(R.drawable.donut3);
            photos.add(R.drawable.donut4);
            photos.add(R.drawable.donut);
            photos.add(R.drawable.donut3);
            photos.add(R.drawable.donut4);
            photos.add(R.drawable.donut);
        }
    }
}
