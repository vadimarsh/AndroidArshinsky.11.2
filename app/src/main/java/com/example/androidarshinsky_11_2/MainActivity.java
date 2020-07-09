package com.example.androidarshinsky_11_2;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ItemsDataAdapter adapter;
    private List<Drawable> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        ListView listView = findViewById(R.id.listView);
        setSupportActionBar(toolbar);

        fillImages();

        adapter = new ItemsDataAdapter(this, null);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.this.showItemData(position);
                return true;
            }
        });

        putDataInApapter();
    }

    private void showItemData(int position) {
        DataItem itemData = adapter.getItem(position);
        Toast.makeText(MainActivity.this,
                itemData.getTitle(),
                Toast.LENGTH_SHORT).show();
    }

    private void putDataInApapter() {
        String[] title = getString(R.string.titles).split("\n\n");
        String[] topic = getString(R.string.topics).split("\n\n");
        String butText = getString(R.string.delete_but);

        adapter.addItem(new DataItem(
                images.get(0),
                title[0],
                topic[0],
                butText));
        adapter.addItem(new DataItem(
                images.get(1),
                title[1],
                topic[1],
                butText));
        adapter.addItem(new DataItem(
                images.get(2),
                title[2],
                topic[1],
                butText));
        adapter.addItem(new DataItem(
                images.get(3),
                title[3],
                topic[1],
                butText));
        adapter.addItem(new DataItem(
                images.get(4),
                title[4],
                topic[2],
                butText));
        adapter.addItem(new DataItem(
                images.get(5),
                title[5],
                topic[2],
                butText));
        adapter.addItem(new DataItem(
                images.get(6),
                title[6],
                topic[3],
                butText));
    }


    private void fillImages() {
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example1));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example2));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example3));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example4));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example5));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example6));
        images.add(ContextCompat.getDrawable(MainActivity.this,
                R.mipmap.example7));
    }
}
