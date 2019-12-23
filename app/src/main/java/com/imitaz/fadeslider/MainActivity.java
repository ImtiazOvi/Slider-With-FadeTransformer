package com.imitaz.fadeslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(MainActivity.this,getData());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPageTransformer(true,new FadeTrasformer());
    }

    private List<Model> getData() {
        List<Model> modelList = new ArrayList<>();
        Model model = new Model();

        model.image = R.drawable.img1;
        model.text = "Imtiaz";
        modelList.add(model);


        model = new Model();
        model.image = R.drawable.img1;
        model.text = "Uddin";
        modelList.add(model);

        model = new Model();
        model.image = R.drawable.img1;
        model.text = "ovi";
        modelList.add(model);
        return modelList;
    }
}
