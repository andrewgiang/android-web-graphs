package com.andrewgiang.d3;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebView;

/**
 * Created by andrewgiang on 1/26/14.
 */
public class Utils {
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static void setWebkitSettings(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN)
            webView.getSettings().setAllowFileAccessFromFileURLs(true);
    }
}
