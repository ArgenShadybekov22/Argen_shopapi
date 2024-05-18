package com.example.argen_shopapi.remote_data;

import com.example.argen_shopapi.constant.ConstantApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private  Api api;
    private static RetrofitClient instance = null;



    private RetrofitClient() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(ConstantApi.BASE_URl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(Api.class);
    }


    public static synchronized RetrofitClient getInstance(){
        if(instance==null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public Api getApi(){
        return api;
    }
}

