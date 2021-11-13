package com.pojo.mvvmretrofit.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.pojo.mvvmretrofit.home.model.LoginRequestModel;

import retrofit2.Response;

public class Repository {



    public LiveData<Response> loginUser(LoginRequestModel loginRequestModel) {

        MutableLiveData<Response> liveData = new MutableLiveData<>();

        //liveData.setValue();


        return liveData;


    }
}
