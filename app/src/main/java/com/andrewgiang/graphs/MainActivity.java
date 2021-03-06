package com.andrewgiang.graphs;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, JavascriptGraphFragment.newInstance(getString(R.string.gc_chart_bubble)))
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_google_charts:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, JavascriptGraphFragment.newInstance(getString(R.string.gc_chart_bubble)))
                        .commit();
                return  true;
            case R.id.action_d3_box_plot:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, JavascriptGraphFragment.newInstance(getString(R.string.d3_box_plot)))
                        .commit();
                return true;
            case R.id.action_gc_piechart_donut:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, JavascriptGraphFragment.newInstance(getString(R.string.gc_piechart_donut)))
                        .commit();
                return true;
            case R.id.action_gc_geochart:
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, JavascriptGraphFragment.newInstance(getString(R.string.gc_geochart)))
                        .commit();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
