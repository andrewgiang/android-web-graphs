package com.andrewgiang.d3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A placeholder fragment containing a simple view.
 */
public class GChartBubbleChartFragment extends Fragment {

    private WebView mWebView;

    public GChartBubbleChartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mWebView = (WebView) rootView.findViewById(R.id.main_web_view);
        Utils.setWebkitSettings(mWebView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/google_charts.html");

        return rootView;
    }
}
