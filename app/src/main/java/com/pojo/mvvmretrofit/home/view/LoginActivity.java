package com.pojo.mvvmretrofit.home.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.pojo.mvvmretrofit.R;
import com.pojo.mvvmretrofit.databinding.ActivityLoginBinding;
import com.pojo.mvvmretrofit.home.model.LoginRequestModel;
import com.pojo.mvvmretrofit.home.viewmodel.LoginViewModel;

import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {


    ActivityLoginBinding activityLoginBinding;
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityLoginBinding= DataBindingUtil.setContentView(this,R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);

        activityLoginBinding.setLogin(loginViewModel);
        activityLoginBinding.setLifecycleOwner(this);


        activityLoginBinding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doLogin();

            }
        });

    }

    private void doLogin() {

        loginViewModel.login().observe(this, new Observer<Response>() {
            @Override
            public void onChanged(Response response) {

            }
        });



    }


}
