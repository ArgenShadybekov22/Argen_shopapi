package com.example.argen_shopapi.remote_data;

import com.example.argen_shopapi.models.ModelM;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://fakestoreapi.com/";
    @GET("products")
    Call<List<ModelM>> getStoreProducts();
}