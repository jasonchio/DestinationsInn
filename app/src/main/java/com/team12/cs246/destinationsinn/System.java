package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class System extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        Intent intent = getIntent();
        String step = intent.getStringExtra("step");
        setTitle(step);
    }
}
