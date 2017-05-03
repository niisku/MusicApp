package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //This finds the button for continuing playing & names it continuePlaying
        Button continuePlaying = (Button) findViewById(R.id.button_continue);

        //Setting a listener for continuePlaying button
        continuePlaying.setOnClickListener(new Button.OnClickListener() {

            //This method happens when user clicks the continuePlaying button
            @Override
            public void onClick(View view) {
                Intent continueIntent = new Intent(MainActivity.this, ContinueActivity.class);
                startActivity(continueIntent);
            }
        });

        //This finds the button to access the saved playlist & names it toPlaylist
        Button toPlaylist = (Button) findViewById(R.id.button_playlist);

        //Setting a listener for toPlaylist button
        toPlaylist.setOnClickListener(new Button.OnClickListener() {

            //This method happens when user clicks the toPlaylist button
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });


        //This finds the button to access to all the lessons & names it allLessons
        Button allLessons = (Button) findViewById(R.id.button_allLessons);

        //Setting a listener for the allLessons button
        allLessons.setOnClickListener(new Button.OnClickListener() {

            //This method happens when user clicks the allLessons button
            @Override
            public void onClick(View view) {
                Intent allLessonsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                startActivity(allLessonsIntent);
            }
        });

        //This finds the button to access to the settings & names it settings
        Button settings = (Button) findViewById(R.id.button_settings);

        //Setting a listener for the settings button
        settings.setOnClickListener(new Button.OnClickListener() {

            //This method happens when user clicks the settings button
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

    }
}
