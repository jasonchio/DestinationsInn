package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BlackSwan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.hotel);
        setContentView(R.layout.activity_black_swan);
    }

    public void openArabianNights(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Arabian Nights");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openAtlantis(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Atlantis Under the Sea");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openGarden(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Black Swan Garden");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openCave(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Cave");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openEgyptian(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Egyptian");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openEnchanted(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Enchanted Forest");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openJungle(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Jungle Falls");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openMayan(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Mayan Rainforest");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openPirates(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Pirates");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openCabin(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Rocky Mountain Cabin");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openRJI(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Romeo and Juliet I");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openRJII(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Romeo and Juliet II");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openSeaCave(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Sea Cave");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }

    public void openTropical(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Tropical Paradise");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainmentTwo));
        startActivity(i);
    }

    public void openWildWest(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", getString(R.string.welcome) + " Wild West");
        i.putExtra("overview", getString(R.string.overviewBlk));
        i.putExtra("entertainment", getString(R.string.entertainment));
        startActivity(i);
    }
}

