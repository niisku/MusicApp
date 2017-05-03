package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //Finds button to main activity & names it toMain
        Button toMain = (Button) findViewById(R.id.toMain);

        //Sets onClickListener to the toMain button
        toMain.setOnClickListener(new Button.OnClickListener() {

            //Creates the function for the toMain button & executes it when clicked
            @Override
            public void onClick(View view) {
                Intent toMainIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(toMainIntent);
            }
        });


        //This finds the button for continuing playing & names it continuePlaying
        Button continuePlaying = (Button) findViewById(R.id.toContinue);

        //Setting a listener for continuePlaying button
        continuePlaying.setOnClickListener(new Button.OnClickListener() {

            //This method happens when user clicks the continuePlaying button
            @Override
            public void onClick(View view) {
                Intent continueIntent = new Intent(PlaylistActivity.this, ContinueActivity.class);
                startActivity(continueIntent);
            }
        });

        //Finds button to the all lessons activity & names it toLessons
        Button toLessons = (Button) findViewById(R.id.toLessons);

        //Sets onClickListener to the toLessons button
        toLessons.setOnClickListener(new Button.OnClickListener() {

            //Sets onClickListener to the toLessons button
            @Override
            public void onClick(View view) {
                Intent toLessonsIntent = new Intent(PlaylistActivity.this, PodcastsActivity.class);
                startActivity(toLessonsIntent);
            }
        });
        //Finds button to the settings activity & names it toSettins

        Button toSettings = (Button) findViewById(R.id.toSettings);

        //Sets onClickListener to the toSettings button
        toSettings.setOnClickListener(new Button.OnClickListener() {

            //Sets onClickListener to the toSettings button
            @Override
            public void onClick(View view) {
                Intent toSettingsIntent = new Intent(PlaylistActivity.this, SettingsActivity.class);
                startActivity(toSettingsIntent);
            }
        });
    }
}
