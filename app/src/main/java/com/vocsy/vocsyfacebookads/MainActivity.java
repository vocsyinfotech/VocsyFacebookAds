package com.vocsy.vocsyfacebookads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.vocsy.facebookads.FacebookBanner;
import com.vocsy.facebookads.FacebookInterstitial;
import com.vocsy.facebookads.FacebookNative;

public class MainActivity extends AppCompatActivity {

    FacebookInterstitial facebookInterstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // LOAD FACEBOOK Interstitial
        facebookInterstitial = new FacebookInterstitial(this,getString(R.string.facebook_interstitialAd_id));
        facebookInterstitial.loadInterstitialAds(new FacebookInterstitial.ActionListener() {
            @Override
            public void performAction() {

                // do here your action after Facebook Ads Closed
            }
        });

        // LOAD FACEBOOK Interstitial FINISH




        // FACEBOOK BANNER

        FacebookBanner.FacebookBannerNormal(this,findViewById(R.id.banner_container),getString(R.string.facebook_banner_id));

        //FACEBOOK BANNER END


        // FACEBOOK Native

        FacebookNative.FacebookNativeNormal(this,findViewById(R.id.native_ad_container),getString(R.string.facebook_native_id));

        //FACEBOOK Native END


        // FACEBOOK Native BANNER

        FacebookNative.FacebookNativeBanner(this,findViewById(R.id.native_banner_ad_container),getString(R.string.facebook_native_banner_id));

        //FACEBOOK Native BANNER END


    }

    public void Showinter(View view) {


        // SHOW FACEBOOK Interstitial
        facebookInterstitial.ShowinterstitialAd(this);
        // SHOW FACEBOOK Interstitial END

    }
}