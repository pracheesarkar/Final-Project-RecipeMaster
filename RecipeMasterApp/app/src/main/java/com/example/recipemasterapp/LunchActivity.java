package com.example.recipemasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Recipe;

import com.example.network.Network;
import com.example.recipemasterapp.databinding.ActivityLunchBinding;
import com.example.service.RecipeService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LunchActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityLunchBinding activityLunchBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLunchBinding = ActivityLunchBinding.inflate(getLayoutInflater());
        setContentView(activityLunchBinding.getRoot());

        activityLunchBinding.btnWrap.setOnClickListener(this);
        activityLunchBinding.btnPasta.setOnClickListener(this);
        activityLunchBinding.btnBack.setOnClickListener(this);

        }


    @Override
    public void onClick(View view) {
        if (view == activityLunchBinding.btnWrap){
            Intent intent = new Intent(this, WrapActivity.class);
            startActivity(intent);

        }
        else if(view == activityLunchBinding.btnPasta){
            Intent intent = new Intent(this, PastaActivity.class);
            startActivity(intent);
        }
        else if(view == activityLunchBinding.btnBack){
           onBackPressed();
        }

    }
}
