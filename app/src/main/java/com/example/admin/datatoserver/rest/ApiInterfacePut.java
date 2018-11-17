package com.example.admin.datatoserver.rest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterfacePut {
    //register
    @POST("collections/posts/?apiKey=VNNk2xmBYia8LLhNcaUAQNckrMlXiLCI")
    @Headers({"Content-Type: application/json"})
    Call<ResponseBody> Registration(@Body String str);
}
