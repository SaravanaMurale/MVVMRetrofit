package com.pojo.mvvmretrofit.network;

import com.pojo.mvvmretrofit.home.model.GetUserDetailsModel;
import com.pojo.mvvmretrofit.mvprecyclerview.RootVideoView;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInteface {

    String BuildConfig= "https://jsonplaceholder.typicode.com/";

    @GET(BuildConfig+ "posts")
    Call<List<GetUserDetailsModel>> getUserDetails();

//https://raw.githubusercontent.com/bikashthapa01/myvideos-android-app/master/data.json
    @GET("bikashthapa01/myvideos-android-app/master/zdata.json")
    Call<List<RootVideoView>> getData();


}
