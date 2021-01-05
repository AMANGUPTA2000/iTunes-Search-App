package com.example.itunessearch.api;

import com.example.itunessearch.api.model.TrackModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
/**
 * Created by Aman Gupta on 05,January,2021
 * Email: aman.180410116028@gmail.com
 **/
public interface APIService {

    @GET("search")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    Call<TrackModel> getTracks(@Query("term") String term);
}