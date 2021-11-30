package com.pojo.mvvmretrofit.navigationcomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.pojo.mvvmretrofit.R;

public class NavigationActivity extends AppCompatActivity {

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        navController= Navigation.findNavController(this,R.id.nav_host_fragment_container_main);
        NavigationUI.setupActionBarWithNavController(this,navController);

    }
}