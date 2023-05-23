package com.example.recipemasterapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipemasterapp.databinding.ActivityWrapBinding;

public class WrapActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityWrapBinding activityWrapBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityWrapBinding = ActivityWrapBinding.inflate(getLayoutInflater());
        setContentView(activityWrapBinding.getRoot());

        activityWrapBinding.btnBack.setOnClickListener(this);

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
        if(view == activityWrapBinding.btnBack){
            onBackPressed();
        }

    }
}
