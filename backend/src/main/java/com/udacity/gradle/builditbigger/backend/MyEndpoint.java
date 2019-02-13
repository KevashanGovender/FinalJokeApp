package com.udacity.gradle.builditbigger.backend;

import com.example.jokelib.JokeGenerator;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

@Api(
        name = "jokeApi",
        version = "v2",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {

        JokeGenerator jokeGenerator = new JokeGenerator();

        MyBean response = new MyBean();
        response.setData(jokeGenerator.getJoke());

        return response;
    }

    public static void main(String args [])
    {
        MyEndpoint myEndpoint = new MyEndpoint();
        System.out.println(myEndpoint.getJoke().getData());
    }

}
