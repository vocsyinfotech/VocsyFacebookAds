package com.vocsy.facebookads;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;


public class FacebookInit extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AudienceNetworkAds.initialize(this);
    }
}
