package com.vocsy.facebookads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.taishi.flipprogressdialog.FlipProgressDialog;

import java.util.ArrayList;
import java.util.List;

public class SingleMultiFacebookInterstitial {

    public InterstitialAd interstitialAd;


    InterstitialAdListener interstitialAdListener;


    public SingleMultiFacebookInterstitial(Context mContext, String Ad_Unit_ID) {


        interstitialAd = new InterstitialAd(mContext, Ad_Unit_ID);

    }


    public void loadInterstitialAds() {

          interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };


        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
    }

    public void ShowinterstitialAd(Activity mActivity) {

        List<Integer> imageList = new ArrayList<Integer>();
        imageList.add(R.drawable.ic_hourglass_empty_white_24dp);
        imageList.add(R.drawable.ic_hourglass_full_white_24dp);

        FlipProgressDialog flipX = new FlipProgressDialog();
        flipX.setImageList(imageList);
        flipX.setOrientation("rotationX");
        flipX.setBackgroundColor(Color.parseColor("#000000"));
        flipX.setBackgroundAlpha(1.0f);
        flipX.show(mActivity.getFragmentManager(), "");
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {
                // Check if interstitialAd has been loaded successfully

                flipX.dismiss();
                if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
                    return;
                }
                // Check if ad is already expired or invalidated, and do not show ad if that is the case. You will not get paid to show an invalidated ad.
                if (interstitialAd.isAdInvalidated()) {
                    return;
                }
                // Show the ad
                interstitialAd.show();
            }
        }, 3000); // Show the ad after 15 minutes


    }


}
