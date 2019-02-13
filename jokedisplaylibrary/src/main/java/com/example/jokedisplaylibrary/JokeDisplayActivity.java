package com.example.jokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    private Intent jokeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeTv = findViewById(R.id.joke_tv);

        if(getIntent() != null){
            jokeIntent = getIntent();
        }

        String joke = jokeIntent.getStringExtra("JOKE");

        jokeTv.setText(joke);
    }
}
