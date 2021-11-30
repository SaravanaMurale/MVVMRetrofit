package com.pojo.mvvmretrofit.home.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.pojo.mvvmretrofit.home.model.GetUserDetailsModel;
import com.pojo.mvvmretrofit.repository.Repository;

import java.util.List;

public class GetDataViewModel extends ViewModel {

    Repository repository=new Repository();
    

    public LiveData<List<GetUserDetailsModel>> getDataFromServer(){

        return repository.getUserDetails();
    }

}
