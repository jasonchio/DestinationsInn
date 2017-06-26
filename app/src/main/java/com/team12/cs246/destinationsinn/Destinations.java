package com.team12.cs246.destinationsinn;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Destinations extends AppCompatActivity {

    private static final String TAG = "Destinations";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Opened new activity");
        super.onCreate(savedInstanceState);
        setTitle(R.string.hotel);
        setContentView(R.layout.activity_destinations);
        Log.v(TAG, "Successfully created");
    }

    public void openAlaska(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.alaska));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openArabia(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.arabia));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openAthens(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.athens));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openCongo(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.congo));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openEgypt(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.egypt));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openEngland(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.england));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openHawaii(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.hawaii));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openMorocco(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.morocco));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openNewYork(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.new_york));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openParis(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.paris));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openRio(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.rio));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openRome(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.rome));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openThailand(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.thailand));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openVenice(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.venice));
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openMaps(View view) {
        Intent i = new Intent(this, Nearme.class);
        startActivity(i);
    }
}