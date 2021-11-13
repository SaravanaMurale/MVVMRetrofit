package com.pojo.mvvmretrofit.home.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pojo.mvvmretrofit.home.model.LoginRequestModel;
import com.pojo.mvvmretrofit.repository.Repository;

import retrofit2.Response;

public class LoginViewModel extends AndroidViewModel {



    Repository repository=new Repository();


    public MutableLiveData<String> phoneNo = new MutableLiveData<>();
    public MutableLiveData<String> phoneNoError = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Response> login() {
        LoginRequestModel requestModel = new LoginRequestModel();
        requestModel.setMobileNumber(phoneNo.getValue());
        requestModel.setPassword(password.getValue());
        System.out.println("DataEntered"+requestModel.getMobileNumber()+" "+requestModel.getPassword());

        return repository.loginUser(requestModel);
    }





    void display(){

        LoginRequestModel loginRequestModel=new LoginRequestModel();
        System.out.println("EnteredData"+loginRequestModel.getMobileNumber()+" "+loginRequestModel.getPassword());

    }


}
