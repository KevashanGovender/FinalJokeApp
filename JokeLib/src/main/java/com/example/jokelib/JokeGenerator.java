package com.example.jokelib;

import java.io.IOException;

import retrofit2.Retrofit;

public class JokeGenerator {

    public String getJoke() {
//        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
//
//        JokeService jokeService = retrofit.create(JokeService.class);
//
//        try {
//            return jokeService.getJoke().execute().body().getJoke();
//        } catch (IOException e) {
//            return e.getLocalizedMessage();
//        }
        return "This is a joke";
    }

    public static void main(String args []){
        JokeGenerator jokeGenerator = new JokeGenerator();

        System.out.println(jokeGenerator.getJoke());
    }
}
