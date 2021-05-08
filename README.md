# VocsyFacebookAds
Facebook Ads Integration

<p><span style="font-size: 22px;"><strong>Features</strong></span></p>
<ul>
    <li style="line-height: 1;"><span style="font-size: 18px;">Interstitial</span></li>
    <li style="line-height: 1;"><span style="font-size: 18px;">Banner</span></li>
    <li style="line-height: 1;"><span style="font-size: 18px;">Native</span></li>
    <li style="line-height: 1;"><span style="font-size: 18px;">Native Banner</span></li>
</ul>
<p><br></p>

<pre class="kode language-css code-toolbar" style='box-sizing: border-box; overflow: auto; font-family: Consolas, Monaco, "andale mono", "ubuntu mono", monospace; font-size: 16px; display: block; padding: 1em; margin: 0.5em 0px; line-height: 1.5; color: rgb(255, 255, 255); word-break: normal; overflow-wrap: normal; background: rgb(20, 20, 20); border: 0.3em solid rgb(84, 84, 84); border-radius: 0.5em; font-weight: 700; tab-size: 4; text-align: left; text-shadow: rgb(0, 0, 0) 0px -0.1em 0.2em; white-space: pre; word-spacing: 0px; hyphens: none; box-shadow: rgb(0, 0, 0) 1px 1px 0.5em inset; position: relative; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-indent: 0px; text-transform: none; widows: 2; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;'>

Step 1. Add the JitPack repository to your build file

<code class=" kode language-css" style='box-sizing: border-box; font-family: Consolas, Monaco, "andale mono", "ubuntu mono", monospace; font-size: 16px; padding: 0px; color: rgb(255, 255, 255); background: 0px 0px; border-radius: 0px; white-space: pre; font-weight: 700; tab-size: 4; text-align: left; text-shadow: rgb(0, 0, 0) 0px -0.1em 0.2em; word-spacing: normal; word-break: normal; overflow-wrap: normal; line-height: 1.5; hyphens: none;'><span class="token selector" style="box-sizing: border-box; position: relative; z-index: 1; color: rgb(249, 238, 154);">allprojects</span> <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">{</span>
        <span class="token selector" style="box-sizing: border-box; position: relative; z-index: 1; color: rgb(249, 238, 154);">repositories</span> <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">{</span></code>
<code class=" kode language-css" style='box-sizing: border-box; font-family: Consolas, Monaco, "andale mono", "ubuntu mono", monospace; font-size: 16px; padding: 0px; color: rgb(255, 255, 255); background: 0px 0px; border-radius: 0px; white-space: pre; font-weight: 700; tab-size: 4; text-align: left; text-shadow: rgb(0, 0, 0) 0px -0.1em 0.2em; word-spacing: normal; word-break: normal; overflow-wrap: normal; line-height: 1.5; hyphens: none;'><span class="token selector" style="box-sizing: border-box; position: relative; z-index: 1; color: rgb(249, 238, 154);">
            maven</span> <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">{</span> url <span class="token string" style="box-sizing: border-box; position: relative; z-index: 1; color: rgb(145, 158, 107);">&apos;https://jitpack.io&apos;</span> <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">}</span>
        <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">}</span>
    <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">}</span></code></pre>
<pre class="kode code-toolbar  language-css" style='box-sizing: border-box; overflow: auto; font-family: Consolas, Monaco, "andale mono", "ubuntu mono", monospace; font-size: 16px; display: block; padding: 1em; margin: 0.5em 0px; line-height: 1.5; color: rgb(255, 255, 255); word-break: normal; overflow-wrap: normal; background: rgb(20, 20, 20); border: 0.3em solid rgb(84, 84, 84); border-radius: 0.5em; font-weight: 700; tab-size: 4; text-align: left; text-shadow: rgb(0, 0, 0) 0px -0.1em 0.2em; white-space: pre; word-spacing: 0px; hyphens: none; box-shadow: rgb(0, 0, 0) 1px 1px 0.5em inset; position: relative; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; letter-spacing: normal; orphans: 2; text-indent: 0px; text-transform: none; widows: 2; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;'><code class=" kode  language-css" style='box-sizing: border-box; font-family: Consolas, Monaco, "andale mono", "ubuntu mono", monospace; font-size: 16px; padding: 0px; color: rgb(255, 255, 255); background: 0px 0px; border-radius: 0px; white-space: pre; font-weight: 700; tab-size: 4; text-align: left; text-shadow: rgb(0, 0, 0) 0px -0.1em 0.2em; word-spacing: normal; word-break: normal; overflow-wrap: normal; line-height: 1.5; hyphens: none;'> Step 2. Add the dependency</code>

<code class=" kode language-css" style='box-sizing: border-box; font-family: Consolas, Monaco, "andale mono", "ubuntu mono", monospace; font-size: 16px; padding: 0px; color: rgb(255, 255, 255); background: 0px 0px; border-radius: 0px; white-space: pre; font-weight: 700; tab-size: 4; text-align: left; text-shadow: rgb(0, 0, 0) 0px -0.1em 0.2em; word-spacing: normal; word-break: normal; overflow-wrap: normal; line-height: 1.5; hyphens: none;'><span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;"><span class="token selector" style="box-sizing: border-box; position: relative; z-index: 1; color: rgb(249, 238, 154);">dependencies</span> <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">{</span>
     implementation <span class="token string" style="box-sizing: border-box; position: relative; z-index: 1; color: rgb(145, 158, 107);">&apos;com.github.vocsyinfotech:VocsyFacebookAds:0.1.4&apos;</span>
    <span class="token punctuation" style="box-sizing: border-box; position: relative; z-index: 1; opacity: 0.7;">}</span>
</span></code></pre>

<h1><strong>FacebookInterstitial :</strong></h1>
<p>&nbsp;</p>
<h2><strong>initialize variable </strong><strong>=&gt;</strong></h2>
<p>&nbsp;</p>
<h3>FacebookInterstitial facebookInterstitial;</h3>
<p>&nbsp;</p>
<h2><strong>Load&nbsp;Interstitial in onCreate();</strong></h2>
<h3><strong>// LOAD FACEBOOK Interstitial</strong><br /><strong>facebookInterstitial = new FacebookInterstitial(this, getString(R.string.facebook_interstitialAd_id));</strong><br /><strong>facebookInterstitial.loadInterstitialAds(new FacebookInterstitial.ActionListener() {</strong><br /><strong> @Override</strong><br /><strong> public void performAction() {</strong><br /><br /><strong> // do here your action after Facebook Ads Closed</strong><br /><strong> }</strong><br /><strong>});</strong></h3>
<p>&nbsp;</p>
<h2><strong>Show&nbsp;</strong><strong>Interstitial&nbsp; Ads</strong></h2>
<h3><strong>// SHOW FACEBOOK Interstitial</strong><br /><strong>facebookInterstitial.ShowinterstitialAd(this);</strong><br /><strong>// SHOW FACEBOOK Interstitial END</strong></h3>
<p>&nbsp;</p>

<h1>FACEBOOK BANNER</h1>
<p>&nbsp;</p>
<h2>XML</h2>
<p>&nbsp;</p>
<h4>&lt;LinearLayout<br /> android:id="@+id/banner_container"<br /> android:layout_width="match_parent"<br /> android:layout_height="wrap_content"<br /> android:layout_alignParentBottom="true"<br /> android:orientation="vertical"<br /> app:layout_constraintBottom_toBottomOf="parent" /&gt;</h4>
<p>&nbsp;</p>
<h2>Java onCreate</h2>
<p>&nbsp;</p>
<h3>FacebookBanner.FacebookBannerNormal(this, findViewById(R.id.banner_container), getString(R.string.facebook_banner_id));</h3>
<p><strong><span style="color: #00ff00;">you can use&nbsp; also</span></strong></p>
<p><strong><span style="color: #00ff00;">FacebookBanner90<br /></span><span style="color: #00ff00;">FacebookBanner250</span></strong></p>

<h1>FACEBOOK Native</h1>
<p>&nbsp;</p>
<h2>XML</h2>
<p>&nbsp;</p>
<h3>&lt;com.facebook.ads.NativeAdLayout<br /> android:layout_marginTop="50dp"<br /> android:id="@+id/native_ad_container"<br /> android:layout_width="match_parent"<br /> android:layout_height="wrap_content"<br /> android:orientation="vertical" /&gt;</h3>
<h2>Java onCreate</h2>
<p>&nbsp;</p>
<pre>FacebookNative.FacebookNativeNormal(this, findViewById(R.id.native_ad_container), getString(R.string.facebook_native_id));</pre>
<p><strong><span style="color: #00ff00;">you can use&nbsp; also</span></strong></p>
<pre>FacebookNativeSmall</pre>
<pre>FacebookNativeBanner</pre>
<p><strong>&nbsp;</strong></p>

<h1>FACEBOOK Native BANNER</h1>
<p>&nbsp;</p>
<h2>XML</h2>
<p>&nbsp;</p>
<h3>&lt;com.facebook.ads.NativeAdLayout<br /> android:layout_marginTop="50dp"<br /> android:id="@+id/native_banner_ad_container"<br /> android:layout_width="match_parent"<br /> android:layout_height="wrap_content"<br /> android:orientation="vertical" /&gt;</h3>
<h2>Java onCreate</h2>
<p>&nbsp;</p>
<pre>FacebookNative.FacebookNativeBanner(this, findViewById(R.id.native_banner_ad_container), getString(R.string.facebook_native_banner_id));</pre>
<p>&nbsp;</p>
<p><strong>&nbsp;</strong></p>
