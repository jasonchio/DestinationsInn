package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BlackSwan extends AppCompatActivity {

    private static final String TAG = "BlackSwan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Opened new activity");
        super.onCreate(savedInstanceState);
        setTitle(R.string.hotel);
        setContentView(R.layout.activity_black_swan);
        Log.v(TAG, "Successfully created");
    }

    public void openArabianNights(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.arabian));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openAtlantis(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.atlantis));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openGarden(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.garden));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openCave(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.cave));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openEgyptian(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.egyptian));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openEnchanted(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.enchanted));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openJungle(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.jungle));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openMayan(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.mayan));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openPirates(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.pirates));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openCabin(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.cabin));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openRJI(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.rji));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openRJII(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.rjii));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openSeaCave(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.sea_cave));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openTropical(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.tropical));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openWildWest(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " " + getString(R.string.wild_west));
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openMaps(View view) {
        Intent i = new Intent(this, Nearme.class);
        i.putExtra("ltd", 42.8678918f);
        i.putExtra("lng", -112.44220110000003f);
        i.putExtra("location", getString(R.string.black_swan));
        startActivity(i);
    }
}

