package com.example.jokesusingjava;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public interface JokeApi {

    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://official-joke-api.appspot.com/jokes/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("random/25")
    Call<List<Joke>> getJokes();
}
