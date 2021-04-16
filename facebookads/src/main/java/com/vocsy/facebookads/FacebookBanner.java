package com.vocsy.facebookads;

import android.content.Context;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class FacebookBanner {


    public static void FacebookBannerNormal(Context mContext, LinearLayout adContainer,String Ad_Unit_ID) {

        AdView adView = new AdView(mContext, Ad_Unit_ID, AdSize.BANNER_HEIGHT_50);


        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }


    public static void FacebookBanner90(Context mContext, LinearLayout adContainer,String Ad_Unit_ID) {


        AdView adView = new AdView(mContext, Ad_Unit_ID, AdSize.BANNER_HEIGHT_90);


        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

    }

    public static void FacebookBanner250(Context mContext, LinearLayout adContainer,String Ad_Unit_ID) {


        AdView adView = new AdView(mContext, Ad_Unit_ID, AdSize.RECTANGLE_HEIGHT_250);


        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

    }


}
