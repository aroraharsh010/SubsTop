package com.example.harsharora.substop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddingAnAccount extends AppCompatActivity {
    public void dropboxD (View view)
    {
        Intent i = new Intent(getApplicationContext(),Dropbox.class);
        startActivity(i);
    }
    public void netflixD (View view)
    {
        Intent i = new Intent(getApplicationContext(),Netflix.class);
        startActivity(i);
    }
    public void amazonD (View view)
    {
        Intent i = new Intent(getApplicationContext(),amazon.class);
        startActivity(i);
    }
    public void spotifyD (View view)
    {
        Intent i = new Intent(getApplicationContext(),spotify.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_an_account);
    }
}
