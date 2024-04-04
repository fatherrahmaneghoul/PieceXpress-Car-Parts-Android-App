package com.example.project1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.example.project1.R;
import com.example.project1.databinding.ActivityCartBinding;
import com.example.project1.databinding.ActivityProfBinding;

public class ProfActivity extends AppCompatActivity {
    ActivityProfBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        statusBarColor();
        setVariable();

    }
    private void statusBarColor() {
        Window window = ProfActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(ProfActivity.this,R.color.orange_light));
    }
    private void setVariable() {
        binding.backBtn.setOnClickListener(view -> finish());
    }


}
