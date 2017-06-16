package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDestinations(View view) {
        Intent i = new Intent(this, Destinations.class);
        startActivity(i);
    }

    public void openBlackSwan(View view) {
        Intent i = new Intent(this, BlackSwan.class);
        startActivity(i);
    }
}