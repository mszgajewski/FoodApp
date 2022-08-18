package com.mszgajewski.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mszgajewski.foodapp.adapters.CategoryAdapter;
import com.mszgajewski.foodapp.adapters.LaysAdapter;
import com.mszgajewski.foodapp.adapters.TeaCoffeAdapter;
import com.mszgajewski.foodapp.models.CategoryModels;
import com.mszgajewski.foodapp.models.SnackModels;
import com.mszgajewski.foodapp.models.TeaCoffeModels;
import com.smarteist.autoimageslider.SliderViewAdapter;


import com.mszgajewski.foodapp.adapters.SliderAdapter;
import com.mszgajewski.foodapp.models.SliderData;

import java.util.ArrayList;
import java.util.List;

public class MartActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory;
    List<CategoryModels> categoryModels;
    CategoryAdapter categoryAdapter;

    RecyclerView recyclerViewTea;
    List<TeaCoffeModels> teaCoffeModels;
    TeaCoffeAdapter teaCoffeAdapter;

    RecyclerView recyclerViewSnack;
    List<SnackModels> snackModels;
    LaysAdapter laysAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart);

        getSlider();
        
        getCategory();

        getTeaAndCoffe();

        gerSnack();
    }

    private void gerSnack() {

        recyclerViewSnack = findViewById(R.id.rec_snack);
        recyclerViewSnack.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewSnack.setHasFixedSize(true);

        snackModels = new ArrayList<>();
        snackModels.add(new SnackModels(R.drawable.lays1));
        snackModels.add(new SnackModels(R.drawable.lays2));
        snackModels.add(new SnackModels(R.drawable.lays3));
        snackModels.add(new SnackModels(R.drawable.lays4));
        snackModels.add(new SnackModels(R.drawable.lays1));
        snackModels.add(new SnackModels(R.drawable.lays2));
        snackModels.add(new SnackModels(R.drawable.lays3));
        snackModels.add(new SnackModels(R.drawable.lays4));

        laysAdapter = new LaysAdapter(snackModels);
        recyclerViewSnack.setAdapter(laysAdapter);
    }

    private void getTeaAndCoffe() {
        recyclerViewTea = findViewById(R.id.rec_tea);
        recyclerViewTea.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewTea.setHasFixedSize(true);

        teaCoffeModels = new ArrayList<>();
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes1));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes2));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes3));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes4));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes1));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes2));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes3));
        teaCoffeModels.add(new TeaCoffeModels(R.drawable.nes4));

        teaCoffeAdapter = new TeaCoffeAdapter(teaCoffeModels);
        recyclerViewTea.setAdapter(teaCoffeAdapter);
    }

    private void getCategory() {

        recyclerViewCategory = findViewById(R.id.rec_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewCategory.setHasFixedSize(true);

        categoryModels = new ArrayList<>();
        categoryModels.add(new CategoryModels(R.drawable.food1));
        categoryModels.add(new CategoryModels(R.drawable.food2));
        categoryModels.add(new CategoryModels(R.drawable.food3));
        categoryModels.add(new CategoryModels(R.drawable.food4));
        categoryModels.add(new CategoryModels(R.drawable.food1));
        categoryModels.add(new CategoryModels(R.drawable.food2));
        categoryModels.add(new CategoryModels(R.drawable.food3));
        categoryModels.add(new CategoryModels(R.drawable.food4));

        categoryAdapter = new CategoryAdapter(categoryModels);
        recyclerViewCategory.setAdapter(categoryAdapter);
    }

    private void getSlider() {

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        SliderView sliderView = findViewById(R.id.slider);

        sliderDataArrayList.add(new SliderData(R.drawable.food1));
        sliderDataArrayList.add(new SliderData(R.drawable.food4));
        sliderDataArrayList.add(new SliderData(R.drawable.food2));
        sliderDataArrayList.add(new SliderData(R.drawable.food3));
        sliderDataArrayList.add(new SliderData(R.drawable.food1));
        sliderDataArrayList.add(new SliderData(R.drawable.food4));
        sliderDataArrayList.add(new SliderData(R.drawable.food2));
        sliderDataArrayList.add(new SliderData(R.drawable.food3));


        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        sliderView.setSliderAdapter(adapter);

        sliderView.setScrollTimeInSec(3);

        sliderView.setAutoCycle(true);

        sliderView.startAutoCycle();
    }
}