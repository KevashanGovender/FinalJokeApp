package com.example.jokelib;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Joke {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("joke")
    @Expose
    private String joke;
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
