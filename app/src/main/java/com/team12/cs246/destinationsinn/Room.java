package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String welcome = intent.getStringExtra("welcome");
        setTitle(welcome);
        setContentView(R.layout.activity_room);
    }
}

