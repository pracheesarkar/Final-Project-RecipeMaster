package com.example.recipemasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Recipe;
//import com.example.network.Network;
import com.example.network.Network;
import com.example.recipemasterapp.databinding.ActivityCategoryBinding;
import com.example.model.Recipe;
import com.example.service.RecipeService;

import java.util.List;
public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityCategoryBinding activitycategorybinding;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitycategorybinding = ActivityCategoryBinding.inflate(getLayoutInflater());
        setContentView(activitycategorybinding.getRoot());

        activitycategorybinding.btnBreakfast.setOnClickListener(this);
        activitycategorybinding.btnLunch.setOnClickListener(this);
        activitycategorybinding.btnDinner.setOnClickListener(this);
        activitycategorybinding.btnBack.setOnClickListener(this);

    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    @Override
    public void onClick(View view) {
        if(view == activitycategorybinding.btnBreakfast){
            Intent intent = new Intent(CategoryActivity.this, BreakfastActivity.class);
            intent.putExtra("category", "Breakfast");
            startActivity(intent);
        }
        else if(view == activitycategorybinding.btnLunch){
            Intent intent = new Intent(CategoryActivity.this, LunchActivity.class);
            intent.putExtra("category", "Lunch");
            startActivity(intent);
        }
        else if(view == activitycategorybinding.btnDinner){
            Intent intent = new Intent(CategoryActivity.this, DinnerActivity.class);
            intent.putExtra("category", "Dinner");
            startActivity(intent);
        }
        else if (view ==activitycategorybinding.btnBack){
            onBackPressed();
        }




    }
}
