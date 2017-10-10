package com.jeepc.jsoniter_retrofit_demo;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/query?type=yuantong&postid=11111111111")
    Call<Logistics> getLogistics();
}
