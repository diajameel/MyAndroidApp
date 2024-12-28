package com.example.myproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchGarage extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private RecyclerView recyclerViewGarageSearch;
    private GarageAdapter itemAdapter;
    private List<GarageMockup> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_garage);


        drawerLayout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);

        // إعداد Toolbar كمشغل
        setSupportActionBar(toolbar);

        // إعداد ActionBarDrawerToggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.open_drawer,
                R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        recyclerViewGarageSearch = findViewById(R.id.recyclerViewGarageSearch);
        recyclerViewGarageSearch.setLayoutManager(new LinearLayoutManager(this));

        // Initialize item list with data
        itemList = new ArrayList<>();
        itemList.add(new GarageMockup("Garage A", "Location A", "John Doe", R.drawable.logog));
        itemList.add(new GarageMockup("Garage B", "Location B", "Jane Smith", R.drawable.logoga));
        itemList.add(new GarageMockup("Garage C", "Location C", "Mike Johnson", R.drawable.logogar));

        // Initialize adapter
        itemAdapter = new GarageAdapter(itemList);

        // Set the adapter to RecyclerView
        recyclerViewGarageSearch.setAdapter(itemAdapter);
    }
}

