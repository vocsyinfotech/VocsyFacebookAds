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

public class FacebookInterstitial {

    public InterstitialAd interstitialAd;


    public interface ActionListener {
        void performAction();
    }


    public FacebookInterstitial(Context mContext,String Ad_Unit_ID) {


        interstitialAd = new InterstitialAd(mContext, Ad_Unit_ID);

    }


    public void loadInterstitialAds(ActionListener actionListener) {

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

                actionListener.performAction();
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
        imageList.add(R.drawable.adblank);
        imageList.add(R.drawable.adfill);

        FlipProgressDialog flipY = new FlipProgressDialog();
        flipY.setImageList(imageList);
        flipY.setDuration(900);
        flipY.setOrientation("rotationY");
        flipY.setBackgroundColor(Color.parseColor("#000000"));
        flipY.setBackgroundAlpha(1.0f);
        flipY.show(mActivity.getFragmentManager(), "");
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {
                // Check if interstitialAd has been loaded successfully

                flipY.dismiss();
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
        }, 2500); // Show the ad after 2.5sec minutes


    }


}
