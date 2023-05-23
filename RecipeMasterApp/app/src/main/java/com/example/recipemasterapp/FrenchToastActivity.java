package com.example.recipemasterapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipemasterapp.databinding.ActivityFrenchtoastBinding;
import com.example.recipemasterapp.databinding.ActivityMainBinding;

public class FrenchToastActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityFrenchtoastBinding activityFrenchtoastBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityFrenchtoastBinding = ActivityFrenchtoastBinding.inflate(getLayoutInflater());
        setContentView(activityFrenchtoastBinding.getRoot());

        activityFrenchtoastBinding.btnBack.setOnClickListener(this);

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
        if(view == activityFrenchtoastBinding.btnBack){
            onBackPressed();
        }

    }
}
