package com.andrewgiang.graphs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class D3BoxPlotFragment extends Fragment {


    private WebView mWebView;

    public D3BoxPlotFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_d3_bullet, container, false);
        mWebView = (WebView) root.findViewById(R.id.d3_webview);
        Utils.setWebkitSettings(mWebView);
        mWebView.loadUrl("file:///android_asset/d3_box_plot.html");

        return root;
    }


}
