package com.mszgajewski.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.smarteist.autoimageslider.SliderViewAdapter;


import com.mszgajewski.foodapp.adapters.SliderAdapter;
import com.mszgajewski.foodapp.models.SliderData;

import java.util.ArrayList;

public class MartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart);

        getSlider();
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