package com.pojo.mvvmretrofit.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    static Retrofit retrofit;
   static Gson gson=new GsonBuilder()
            .setLenient()
            .create();

    public static Retrofit getInstance(){

        retrofit=new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit;

    }

    public static ApiInteface getApiClient(){

        ApiInteface apiInteface=RetrofitClient.getInstance().create(ApiInteface.class);

        return apiInteface;
    }

}
