package com.example.dogsmoodtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.mediationsdk.IronSource;

public class activity1 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        /*IronSource.init(this,"1b6c50bdd");


        FrameLayout bannerContainer = findViewById(R.id.bannerId1);
        IronSourceBannerLayout banner = IronSource.createBanner(this, ISBannerSize.BANNER);

        // Set banner listener
        banner.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() { *//* Banner loaded successfully *//* }

            @Override
            public void onBannerAdLoadFailed(IronSourceError ironSourceError) { *//* Banner load failed *//* }

            @Override
            public void onBannerAdClicked() {

            }

            @Override
            public void onBannerAdScreenPresented() {

            }

            @Override
            public void onBannerAdScreenDismissed() {

            }

            @Override
            public void onBannerAdLeftApplication() {

            }

            // Other banner listener methods
        });

        // Load and display the banner
        IronSource.loadBanner(banner);
        bannerContainer.addView(banner);*/


       /* IronSource.init(this,"1b6c50bdd");

        FrameLayout bannerContainer = findViewById(R.id.bannerId1);

        IronSourceBannerLayout banner = IronSource.createBanner(this, ISBannerSize.BANNER);
        bannerContainer.addView(banner);


        banner.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {

            }

            @Override
            public void onBannerAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onBannerAdClicked() {

            }

            @Override
            public void onBannerAdScreenPresented() {

            }

            @Override
            public void onBannerAdScreenDismissed() {

            }

            @Override
            public void onBannerAdLeftApplication() {

            }
        });

        IronSource.loadBanner(banner);*/

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity1.this, activity2.class);
                startActivity(intent);
            }
        });

    }

    /*protected void onResume() {
        super.onResume();
        IronSource.onResume(this);
    }
    protected void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }*/
}