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
        i.putExtra("welcome", getString(R.string.welcome) + " Alaska");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openArabia(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Arabia");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openAthens(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Athens");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openCongo(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Congo");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openEgypt(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Egypt");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openEngland(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " England");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openHawaii(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Hawaii");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openMorocco(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Morocco");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openNewYork(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " New York");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openParis(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Paris");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openRio(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Rio de Janeiro");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openRome(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Rome");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openThailand(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Thailand");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openVenice(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Venice");
        i.putExtra("overview", getString(R.string.overviewDest));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }
}