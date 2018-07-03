package com.example.milmi.aplikasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List <Data> listData;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listData = new ArrayList<>();

        listData.add(
                new Data(
                        R.drawable.incredibles2,
                        "Incredibles 2",
                        "Genre : Animation",
                        "Durasi : 120 menit",
                        "4.5"
                        ));

        listData.add(
                new Data(
                        R.drawable.avengers3,
                        "Avenger Infinity War",
                        "Genre : Action",
                        "Durasi : 120 menit",
                        "4.5"
                ));

        listData.add(
                new Data(
                        R.drawable.images,
                        "Jurasic World",
                        "Genre : Animation",
                        "Durasi : 120 menit",
                        "4.5"
                ));

        listData.add(
                new Data(
                        R.drawable.antman2,
                        "Ant-Man and the Wasp",
                        "Genre : Action",
                        "Durasi : 120 menit",
                        "4.5"
                ));

        listData.add(
                new Data(
                        R.drawable.ironman3,
                        "Iron Man 3",
                        "Genre : Animation",
                        "Durasi : 120 menit",
                        "4.5"
                ));
        Adapter adapter = new Adapter(this, listData);
        recyclerView.setAdapter(adapter);

    }
}
