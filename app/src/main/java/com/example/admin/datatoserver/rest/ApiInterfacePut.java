package com.example.admin.datatoserver.rest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterfacePut {
    //register
    @POST("collections/posts/?apiKey=your API Key")
    @Headers({"Content-Type: application/json"})
    Call<ResponseBody> Registration(@Body String str);
}
