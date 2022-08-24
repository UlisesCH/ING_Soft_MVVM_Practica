package com.example.mvvm_practica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;

import android.app.Activity;
import android.os.Bundle;

import com.example.mvvm_practica.ViewModels.UserViewModel;
import com.example.mvvm_practica.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModelUser(new UserViewModel());
        activityMainBinding.executePendingBindings();
    }
}