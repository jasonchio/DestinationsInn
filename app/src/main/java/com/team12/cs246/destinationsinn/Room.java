package com.team12.cs246.destinationsinn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.room);
        setContentView(R.layout.activity_room);
    }
}

