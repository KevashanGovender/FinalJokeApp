package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.jokedisplaylibrary.JokeDisplayActivity;


public class MainActivity extends AppCompatActivity implements IFetchJokeView {

    private View contentView;
    private View progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentView = findViewById(R.id.content_view);
        progressView = findViewById(R.id.progress_view);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        FetchJokeTask task = new FetchJokeTask(this);
        task.execute();

    }


    @Override
    public void showJoke(String joke) {
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        intent.putExtra("JOKE", joke);

        startActivity(intent);
    }

    @Override
    public void showLoadingPulse() {
        contentView.setVisibility(View.GONE);
        progressView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoadingPulse() {
        contentView.setVisibility(View.VISIBLE);
        progressView.setVisibility(View.GONE);
    }
}
