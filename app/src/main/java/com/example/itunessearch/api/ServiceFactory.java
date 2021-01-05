package com.example.itunessearch.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by Aman Gupta on 05,January,2021
 * Email: aman.180410116028@gmail.com
 **/
public class ServiceFactory {

    public static APIService getInstance() {

        String baseUrl = "https://itunes.apple.com/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(APIService.class);
    }
}