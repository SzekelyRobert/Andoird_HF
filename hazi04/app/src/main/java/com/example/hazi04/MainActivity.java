package com.example.hazi04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] penzArray = {
            "EUR",
            "USD",
            "GBP",
            "AUD"
    };

    String[] infoArray = {
            "Euro",
            "Dollar American",
            "Lira",
            "Dollar Australian"
    };

    String[] vetelArray = {
            "4.4100 RON",
            "3.9750 RON",
            "6.1250 RON",
            "2.9600 RON"
    };

    String[] eladasArray = {
            "4.5500 RON",
            "4.1450 RON",
            "6.3550 RON",
            "3.0600 RON"
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this,penzArray, infoArray,vetelArray,eladasArray);
        listView = findViewById(R.id.listviewID);
        listView.setAdapter(whatever);
    }
}