package com.udacity.gradle.builditbigger;

public interface IFetchJokeView {

    void showJoke(String joke);
    void showLoadingPulse();
    void hideLoadingPulse();
}
