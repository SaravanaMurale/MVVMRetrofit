package com.pojo.mvvmretrofit.home.view;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.pojo.mvvmretrofit.home.model.LoginRequestModel;
import com.pojo.mvvmretrofit.home.viewmodel.LoginViewModel;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    LoginRequestModel loginRequestModel;
    Context context;

    public LoginViewModelFactory(LoginActivity loginActivity, LoginRequestModel loginRequestModel) {

        this.loginRequestModel=loginRequestModel;
        this.context=loginActivity;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new LoginViewModel(loginRequestModel, context);
    }
}
