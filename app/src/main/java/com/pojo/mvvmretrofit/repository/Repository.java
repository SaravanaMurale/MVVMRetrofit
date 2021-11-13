package com.pojo.mvvmretrofit.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.pojo.mvvmretrofit.home.model.GetUserDetailsModel;
import com.pojo.mvvmretrofit.home.model.LoginRequestModel;
import com.pojo.mvvmretrofit.network.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {



    public LiveData<Response> loginUser(LoginRequestModel loginRequestModel) {

        MutableLiveData<Response> liveData = new MutableLiveData<>();

        //liveData.setValue();


        return liveData;


    }


    public LiveData<List<GetUserDetailsModel>> getUserDetails(){

        MutableLiveData<List<GetUserDetailsModel>> liveData = new MutableLiveData<>();


        RetrofitClient.getApiClient().getUserDetails().enqueue(new Callback<List<GetUserDetailsModel>>() {
            @Override
            public void onResponse(Call<List<GetUserDetailsModel>> call, Response<List<GetUserDetailsModel>> response) {
                liveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<GetUserDetailsModel>> call, Throwable t) {

                liveData.setValue(null);

            }
        });

        return liveData;

    }

}
