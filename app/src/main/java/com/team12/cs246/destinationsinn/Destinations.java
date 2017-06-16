package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Destinations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.hotel);
        setContentView(R.layout.activity_destinations);
    }

    public void openAlaska(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openArabia(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openAthens(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openCongo(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openEgypt(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openEngland(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openHawaii(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openMorocco(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openNewYork(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", R.string.newyork);
        startActivity(i);
    }

    public void openParis(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openRio(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openRome(View view) {
        Intent i = new Intent(this, Room.class);
        i.putExtra("welcome", R.string.rome);
        startActivity(i);
    }

    public void openThailand(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }

    public void openVenice(View view) {
        Intent i = new Intent(this, Room.class);
        startActivity(i);
    }
}