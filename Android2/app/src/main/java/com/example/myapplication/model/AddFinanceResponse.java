package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class AddFinanceResponse {
    @SerializedName("result")
    public boolean result;
    @SerializedName("error")
    public String error;
}
