package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class select_hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.main);
        setContentView(R.layout.activity_main);
    }

    public void openDestinations(View view) {
        Intent i = new Intent(this, Destinations.class);
        startActivity(i);
    }

    public void openBlackSwan(View view) {
        Intent i = new Intent(this, BlackSwan.class);
        i.putExtra("welcome", R.string.app_name);
        startActivity(i);
    }
}
