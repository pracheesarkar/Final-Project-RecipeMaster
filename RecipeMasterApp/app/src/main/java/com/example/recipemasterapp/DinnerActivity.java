package com.example.recipemasterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipemasterapp.databinding.ActivityDinnerBinding;
import com.example.recipemasterapp.databinding.ActivityLunchBinding;

public class DinnerActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityDinnerBinding activityDinnerBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDinnerBinding = ActivityDinnerBinding.inflate(getLayoutInflater());
        setContentView(activityDinnerBinding.getRoot());

        activityDinnerBinding.btnSoup.setOnClickListener(this);
        activityDinnerBinding.btnStirfry.setOnClickListener(this);
        activityDinnerBinding.btnBack.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view == activityDinnerBinding.btnSoup){
            Intent intent = new Intent(this, SoupActivity.class);
            startActivity(intent);

        }
        else if(view == activityDinnerBinding.btnStirfry){
            Intent intent = new Intent(this, StirfryActivity.class);
            startActivity(intent);
        }
        else if(view == activityDinnerBinding.btnBack){
            onBackPressed();
        }

    }

}
