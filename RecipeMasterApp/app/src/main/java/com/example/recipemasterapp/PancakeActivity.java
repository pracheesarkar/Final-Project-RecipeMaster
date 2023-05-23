package com.example.recipemasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Recipe;
import com.example.network.Network;
import com.example.recipemasterapp.databinding.ActivityPancakeBinding;
import com.example.service.RecipeService;

import java.io.Serializable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PancakeActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityPancakeBinding activityPancakeBinding;
    Recipe recipe;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPancakeBinding = ActivityPancakeBinding.inflate(getLayoutInflater());
        setContentView(activityPancakeBinding.getRoot());


        recipe = (Recipe) getIntent().getSerializableExtra("recipe");

        activityPancakeBinding.btnPancakeClick.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == activityPancakeBinding.btnPancakeClick){
            Intent intent = new Intent(this, RecipeActivity.class);
            intent.putExtra("ingredients_list", (Serializable) recipe.getIngredientsList());
            startActivity(intent);


    }
}
}
