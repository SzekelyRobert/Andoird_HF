package com.androidunleashed.fragmentcodeapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class ShowItemActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem = extras.getString("item");
            TextView textView = (TextView) findViewById(R.id.selectedopt);
            textView.setText("Vetel ara: "+selectedItem);

            String selectedItem2 = extras.getString("item2");
            TextView textView2 = (TextView) findViewById(R.id.selectedopt2);
            textView2.setText("Eladasi ara: "+selectedItem2);

            String selectedItem3 = extras.getString("info");
            TextView textView3 = (TextView) findViewById(R.id.selectedopt3);
            textView3.setText("A kivalasztott penznem: "+selectedItem3);
        }
    }
}
