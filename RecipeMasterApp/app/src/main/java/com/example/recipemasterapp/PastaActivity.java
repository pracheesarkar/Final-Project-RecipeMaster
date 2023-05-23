package com.example.recipemasterapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recipemasterapp.databinding.ActivityPastaBinding;

public class PastaActivity extends AppCompatActivity implements View.OnClickListener{
    ActivityPastaBinding activityPastaBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPastaBinding = ActivityPastaBinding.inflate(getLayoutInflater());
        setContentView(activityPastaBinding.getRoot());

        activityPastaBinding.btnBack.setOnClickListener(this);

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
        if(view == activityPastaBinding.btnBack){
            onBackPressed();
        }
    }
}
