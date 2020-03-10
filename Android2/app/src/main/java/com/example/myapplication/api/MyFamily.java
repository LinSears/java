package com.example.myapplication.api;

import com.example.myapplication.model.ConfirmRequest;
import com.example.myapplication.model.ConfirmResponse;
import com.example.myapplication.model.LoginRequest;
import com.example.myapplication.model.LoginResponse;
import com.example.myapplication.model.RegistrationRequest;
import com.example.myapplication.model.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyFamily {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest r);

    @POST("/registration")
    Call<RegistrationResponse> registration(@Body RegistrationRequest r);

    @POST("/confirm")
    Call<ConfirmResponse> confirm(@Body ConfirmRequest r);
}
