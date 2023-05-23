package com.example.recipemasterapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.adapter.CustomAdapter;
import com.example.model.Directions;
import com.example.model.Ingredients;
import com.example.model.Recipe;
import com.example.recipemasterapp.databinding.ActivityRecipeBinding;


import java.util.List;

public class RecipeActivity extends AppCompatActivity {
    ActivityRecipeBinding activityRecipeBinding;
    RecyclerView rvRecipe;
    CustomAdapter adapter;
    List<Ingredients> ingredientsList;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRecipeBinding = ActivityRecipeBinding.inflate(getLayoutInflater());
        setContentView(activityRecipeBinding.getRoot());

        //final RecyclerView rvRecipe = (RecyclerView) findViewById(R.id.rv_recipe);


        ingredientsList = (List<Ingredients>) getIntent().getSerializableExtra("ingredients_list");


        adapter = new CustomAdapter(ingredientsList);
        rvRecipe = activityRecipeBinding.rvRecipe;
        rvRecipe.setAdapter(adapter);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
