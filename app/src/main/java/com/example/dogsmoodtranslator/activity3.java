package com.example.dogsmoodtranslator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class activity3 extends Activity {

    ImageButton ib, partyButton, hungryButton, laughButton, kissButton, cryiButton, agrdogButton, loveButton;
    private Button talkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // Move this line above setContentView
        setContentView(R.layout.activity_3);

        talkButton = findViewById(R.id.button3);

        Intent intent = getIntent();

        if (intent != null) {
            String userName = intent.getStringExtra("user_name");
            if (userName != null && !userName.isEmpty()) {
                talkButton.setText("Talk to " + userName);
            } else {
                talkButton.setText("Talk to your Dog");
            }
        }

        talkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity3.this, activity4.class);
                startActivity(intent);
            }
        });

        ib = findViewById(R.id.coolhundb);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bruh);
        MediaPlayer finalMediaPlayer1 = mediaPlayer;
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer1.start();
            }
        });

        partyButton = findViewById(R.id.partyhund);
        mediaPlayer = MediaPlayer.create(this, R.raw.partydog);
        MediaPlayer finalMediaPlayer = mediaPlayer;
        partyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer.start();
            }
        });

        hungryButton = findViewById(R.id.hungrydog);
        mediaPlayer = MediaPlayer.create(this, R.raw.hungrydog);
        MediaPlayer finalMediaPlayer2 = mediaPlayer;
        hungryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer2.start();
            }
        });

        laughButton = findViewById(R.id.laudogsel);
        mediaPlayer = MediaPlayer.create(this, R.raw.laughdog);
        MediaPlayer finalMediaPlayer3 = mediaPlayer;
        laughButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer3.start();
            }
        });

        agrdogButton = findViewById(R.id.angrysel);
        mediaPlayer = MediaPlayer.create(this, R.raw.agrdog);
        MediaPlayer finalMediaPlayer4 = mediaPlayer;
        agrdogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer4.start();
            }
        });


        loveButton = findViewById(R.id.lovesel);
        mediaPlayer = MediaPlayer.create(this, R.raw.sleepydog);
        MediaPlayer finalMediaPlayer5 = mediaPlayer;
        loveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer5.start();
            }
        });


        cryiButton = findViewById(R.id.crysel);
        mediaPlayer = MediaPlayer.create(this, R.raw.cryingdog);
        MediaPlayer finalMediaPlayer6 = mediaPlayer;
        cryiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer6.start();
            }
        });


        kissButton = findViewById(R.id.kisssel);
        mediaPlayer = MediaPlayer.create(this, R.raw.kissdog);
        MediaPlayer finalMediaPlayer7 = mediaPlayer;
        kissButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalMediaPlayer7.start();
            }
        });
    }
}