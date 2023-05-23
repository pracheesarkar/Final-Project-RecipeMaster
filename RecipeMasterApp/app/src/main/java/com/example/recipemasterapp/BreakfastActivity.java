package com.example.recipemasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Recipe;
import com.example.network.Network;
import com.example.recipemasterapp.databinding.ActivityBreakfastBinding;
import com.example.service.RecipeService;

import java.io.Serializable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BreakfastActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityBreakfastBinding activityBreakfastBinding;

    Recipe recipe;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBreakfastBinding = ActivityBreakfastBinding.inflate(getLayoutInflater());
        setContentView(activityBreakfastBinding.getRoot());
        recipe = (Recipe) getIntent().getSerializableExtra("recipe");

        activityBreakfastBinding.btnPancake.setOnClickListener(this);
        activityBreakfastBinding.btnFrenchtoast.setOnClickListener(this);
        activityBreakfastBinding.btnBack.setOnClickListener(this);

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
        if (view == activityBreakfastBinding.btnPancake){
            RecipeService recipeService = Network.newInstance().create(RecipeService.class);
            activityBreakfastBinding.btnPancake.setText("clicked");
            Call<Recipe> call = recipeService.getRecipe(1L);
            call.enqueue(new Callback<Recipe>() {
                @Override
                public void onResponse(Call<Recipe> call, Response<Recipe> response) {
                    if(response.isSuccessful()){
                        Recipe recipe = response.body();
                        Intent intent = new Intent(getApplicationContext(), PancakeActivity.class);
                        intent.putExtra("recipe", recipe);
                        startActivity(intent);
                    }
                }

                @Override
                public void onFailure(Call<Recipe> call, Throwable t) {
                    activityBreakfastBinding.btnPancake.setText("clicked");
                }
            });
        }
        else if(view == activityBreakfastBinding.btnFrenchtoast){
            Intent intent = new Intent(BreakfastActivity.this, FrenchToastActivity.class);
            startActivity(intent);
        }
        else if(view == activityBreakfastBinding.btnBack){
            onBackPressed();
        }

    }
}
