package com.example.recipemasterapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipemasterapp.databinding.ActivityStirfryBinding;

public class StirfryActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityStirfryBinding activityStirfryBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityStirfryBinding = ActivityStirfryBinding.inflate(getLayoutInflater());
        setContentView(activityStirfryBinding.getRoot());
        activityStirfryBinding.btnBack.setOnClickListener(this);

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
        if(view == activityStirfryBinding.btnBack){
            onBackPressed();
        }

    }
}
