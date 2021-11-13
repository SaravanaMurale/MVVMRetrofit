package com.pojo.mvvmretrofit.home.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pojo.mvvmretrofit.home.model.LoginRequestModel;
import com.pojo.mvvmretrofit.repository.Repository;

import retrofit2.Response;

public class LoginViewModel extends ViewModel {

    Repository repository=new Repository();

    public MutableLiveData<String> phoneNo = new MutableLiveData<>();
    public MutableLiveData<String> phoneNoError = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public LiveData<Response> login() {
        LoginRequestModel requestModel = new LoginRequestModel();
        requestModel.setMobileNumber(phoneNo.getValue());
        requestModel.setPassword(password.getValue());
        return repository.loginUser(requestModel);
    }





    void display(){

        LoginRequestModel loginRequestModel=new LoginRequestModel();
        System.out.println("EnteredData"+loginRequestModel.getMobileNumber()+" "+loginRequestModel.getPassword());

    }


}
