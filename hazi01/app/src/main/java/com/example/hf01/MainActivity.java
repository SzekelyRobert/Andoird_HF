package com.example.hf01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1 = findViewById(R.id.szam1);
        final EditText szam2 = findViewById(R.id.szam2);
        final TextView eredmeny = findViewById(R.id.eredmeny);
        Button gombPlus = findViewById(R.id.plus);
        Button gombMin = findViewById(R.id.min);
        Button gombSzor = findViewById(R.id.szor);
        Button gombPer = findViewById(R.id.per);

        gombPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(osszeg));
            }
        });

        gombMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kulonbseg = Double.parseDouble(szam1.getText().toString()) - Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(kulonbseg));
            }
        });

        gombSzor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double szorzat = Double.parseDouble(szam1.getText().toString()) * Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(szorzat));
            }
        });

        gombPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hanyados = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(hanyados));
            }
        });
    }
}