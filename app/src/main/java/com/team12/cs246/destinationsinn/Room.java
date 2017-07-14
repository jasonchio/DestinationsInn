package com.team12.cs246.destinationsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Room extends AppCompatActivity {

    Boolean changeOverview;
    Boolean changeEntertainment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        Intent intent = getIntent();
        String welcome = intent.getStringExtra("welcome");
        setTitle(welcome);
        changeOverview = true;
        changeEntertainment = true;
    }

    public void placeOverview(View view) {

        TextView tv = (TextView) findViewById(R.id.overview);
        String text = tv.toString();
        if (changeOverview) {
            tv.setText(getIntent().getStringExtra("overview"));
            changeOverview = false;
        } else {
            tv.setText(getString(R.string.overview));
            changeOverview = true;
        }
    }

    public void placeEntertainment(View view) {
        Intent i = new Intent(this, SystemIntro.class);
        i.putExtra("warning", getString(R.string.entertainment_warning));
        i.putExtra("first", getString(R.string.entertainment_tv));
        i.putExtra("second", getString(R.string.entertainment_dvd));
        i.putExtra("third", getString(R.string.entertainment_off));
        i.putExtra("trouble", getString(R.string.entertainment_trouble));
        startActivity(i);
    }
}