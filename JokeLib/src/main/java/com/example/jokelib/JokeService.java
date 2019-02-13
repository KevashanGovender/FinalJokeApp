package com.example.jokelib;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface JokeService {

    @Headers({
            "Accept: application/json",
            "User-Agent: Udacity Build it bigger project Kevashan Govender kevashangovender@gmail.com"
    })
    @GET(".")
    Call<Joke> getJoke();
}
