package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ContinueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue);

//Finds button to main activity & names it toMain
        Button toMain = (Button) findViewById(R.id.toMain);

        //Sets onClickListener to the toMain button
        toMain.setOnClickListener(new Button.OnClickListener() {

            //Creates the function for the toMain button & executes it when clicked
            @Override
            public void onClick(View view) {
                Intent toMainIntent = new Intent(ContinueActivity.this, MainActivity.class);
                startActivity(toMainIntent);
            }
        });

        //Finds button to playlist activity & names it toPlaylist
        Button toPlaylist = (Button) findViewById(R.id.toPlaylist);

        //Sets onClickListener to the toMain button
        toPlaylist.setOnClickListener(new Button.OnClickListener() {

            //Sets onClickListener to the toMain button
            @Override
            public void onClick(View view) {
                Intent toPlaylist = new Intent(ContinueActivity.this, PlaylistActivity.class);
                startActivity(toPlaylist);
            }
        });

        //Finds button to the all lessons activity & names it toLessons
        Button toLessons = (Button) findViewById(R.id.toLessons);

        //Sets onClickListener to the toLessons button
        toLessons.setOnClickListener(new Button.OnClickListener() {

            //Sets onClickListener to the toLessons button
            @Override
            public void onClick(View view) {
                Intent toLessonsIntent = new Intent(ContinueActivity.this, PodcastsActivity.class);
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
                Intent toSettingsIntent = new Intent(ContinueActivity.this, SettingsActivity.class);
                startActivity(toSettingsIntent);
            }
        });

    }
}
