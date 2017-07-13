package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class System extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        Intent intent = getIntent();
        String step = intent.getStringExtra("step");
        setTitle(step);
        TextView steps = (TextView) findViewById(R.id.steps);
        steps.setText(getIntent().getStringExtra("steps"));
    }
}
