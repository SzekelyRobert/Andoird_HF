package com.example.hazi04;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pali on 10/5/2017.
 */

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the list of countries
    private final String[] penzArray;

    //to store the list of countries
    private final String[] infoArray;

    private final String[] vetelArray;

    private final String[] eladasArray;

    public CustomListAdapter(Activity context, String[] penzArrayParam, String[] infoArrayParam, String[] vetelArrayParam, String[] eladasArrayParam){

        super(context, R.layout.listviewrow, penzArrayParam);
        this.context=context;
        this.penzArray = penzArrayParam;
        this.infoArray = infoArrayParam;
        this.vetelArray = vetelArrayParam;
        this.eladasArray = eladasArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listviewrow, null,true);

        TextView penz = (TextView) rowView.findViewById(R.id.penz);
        TextView info = (TextView) rowView.findViewById(R.id.info);
        TextView vetel = (TextView) rowView.findViewById(R.id.vetel);
        TextView eladas = (TextView) rowView.findViewById(R.id.eladas);

        penz.setText(penzArray[position]);
        info.setText(infoArray[position]);
        vetel.setText(vetelArray[position]);
        eladas.setText(eladasArray[position]);

        return rowView;

    }
}
