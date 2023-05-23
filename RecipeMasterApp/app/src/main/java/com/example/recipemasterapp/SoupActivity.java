package com.example.recipemasterapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipemasterapp.databinding.ActivitySoupBinding;


public class SoupActivity extends AppCompatActivity implements View.OnClickListener{
    ActivitySoupBinding activitySoupBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySoupBinding = ActivitySoupBinding.inflate(getLayoutInflater());
        setContentView(activitySoupBinding.getRoot());

        activitySoupBinding.btnBack.setOnClickListener(this);

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
        if(view == activitySoupBinding.btnBack){
            onBackPressed();
        }

    }
}
