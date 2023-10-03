package com.example.dogsmoodtranslator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;

import java.util.Random;

public class activity4 extends AppCompatActivity {

    private ImageButton recordButton;
    private int currentState = 0;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        findViewById(R.id.woofwoof).setVisibility(View.GONE);

        ImageButton recofButton = findViewById(R.id.recof);
        ImageButton woofwoofButton = findViewById(R.id.woofwoof);

        recofButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentState == 0) {
                    recofButton.setImageResource(R.drawable.recon); // Switch to second image
                    currentState = 1;
                } else if (currentState == 1) {
                    playRandomAudio();
                    woofwoofButton.setVisibility(View.VISIBLE); // Show woofwoof button
                    recofButton.setVisibility(View.GONE); // Hide recof button
                    currentState = 2;
                } else {
                    woofwoofButton.setVisibility(View.GONE);
                    recofButton.setVisibility(View.VISIBLE); // Show recof button
                    recofButton.setImageResource(R.drawable.recof); // Switch to initial image
                    currentState = 0;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                }
            }
        });

        woofwoofButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentState == 2) {
                    recofButton.setVisibility(View.VISIBLE); // Show recof button
                    woofwoofButton.setVisibility(View.GONE);
                    recofButton.setImageResource(R.drawable.recof); // Switch to initial image
                    currentState = 0;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                }
            }
        });

        Button button = (Button) findViewById(R.id.backbt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity4.this, activity3.class);
                startActivity(intent);
            }
        });


    }

    private void playRandomAudio() {
        int[] soundResources = {R.raw.random1, R.raw.random2, R.raw.random3, R.raw.random4,
                R.raw.random5, R.raw.random6, R.raw.random7, R.raw.random8, R.raw.random9,
                R.raw.random10, R.raw.random11}; // Add more sound resources as needed
        int randomIndex = new Random().nextInt(soundResources.length);
        int selectedSoundResource = soundResources[randomIndex];

        mediaPlayer = MediaPlayer.create(this, selectedSoundResource);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
        mediaPlayer.start();
    }

}
