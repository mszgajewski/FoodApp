package com.mszgajewski.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mszgajewski.foodapp.adapters.AllRestaurantsAdapter;
import com.mszgajewski.foodapp.adapters.ExclusiveAdapter;
import com.mszgajewski.foodapp.adapters.OffersAdapter;
import com.mszgajewski.foodapp.models.AllRestaurantModels;
import com.mszgajewski.foodapp.models.ExclusiveModels;
import com.mszgajewski.foodapp.models.OffersModels;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends AppCompatActivity {
    
    RecyclerView recyclerViewOffers;
    List<OffersModels> offersModelsList;
    OffersAdapter offersAdapter;

    RecyclerView recyclerViewExclusive;
    List<ExclusiveModels> exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;

    RecyclerView recyclerViewAll;
    List<AllRestaurantModels> allRestaurantModels;
    AllRestaurantsAdapter allRestaurantsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        
        getOffers();

        getAllExclusive();
        
        getAllRestaurantsData();
    }

    private void getAllExclusive() {
        recyclerViewExclusive = findViewById(R.id.rec_exc);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels = new ArrayList<>();
        exclusiveModels.add(new ExclusiveModels(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food4));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food4));

        exclusiveAdapter = new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);
    }

    private void getAllRestaurantsData() {
        recyclerViewAll = findViewById(R.id.rec_all_res);
        recyclerViewAll.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewAll.setHasFixedSize(true);

        allRestaurantModels = new ArrayList<>();
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food4));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food3));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food2));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food1));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food4));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food3));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food2));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food1));

        allRestaurantsAdapter = new AllRestaurantsAdapter(allRestaurantModels);
        recyclerViewAll.setAdapter(allRestaurantsAdapter);
    }

    private void getOffers() {

        recyclerViewOffers = findViewById(R.id.rec_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offersModelsList = new ArrayList<>();
        offersModelsList.add(new OffersModels(R.drawable.img15));
        offersModelsList.add(new OffersModels(R.drawable.img16));
        offersModelsList.add(new OffersModels(R.drawable.img19));
        offersModelsList.add(new OffersModels(R.drawable.img18));

        offersAdapter = new OffersAdapter(offersModelsList);
        recyclerViewOffers.setAdapter(offersAdapter);

    }
}