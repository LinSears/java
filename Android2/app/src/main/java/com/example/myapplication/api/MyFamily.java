package com.example.myapplication.api;

import com.example.myapplication.model.LoginRequest;
import com.example.myapplication.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyFamily {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest r);
}
