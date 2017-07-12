package com.team12.cs246.destinationsinn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SystemIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_intro);
        setTitle(R.string.entertainment_system);

        Intent intent = getIntent();
        TextView warning = (TextView) findViewById(R.id.warning);
        TextView first = (TextView) findViewById(R.id.first_option);
        TextView second = (TextView) findViewById(R.id.second_option);
        TextView third = (TextView) findViewById(R.id.third_option);
        TextView trouble = (TextView) findViewById(R.id.trouble);
        warning.setText(getIntent().getStringExtra("warning"));
        first.setText(getIntent().getStringExtra("first"));
        second.setText(getIntent().getStringExtra("second"));
        third.setText(getIntent().getStringExtra("third"));
        trouble.setText(getIntent().getStringExtra("trouble"));
    }

    public void stepTV(View view) {
        Intent i = new Intent(this, SystemIntro.class);
        i.putExtra("step", getString(R.string.entertainment_tv));
        i.putExtra("steps", getString(R.string.entertainment_trouble));
        startActivity(i);
    }

    public void stepDVD(View view) {
        Intent i = new Intent(this, SystemIntro.class);
        i.putExtra("step", getString(R.string.entertainment_dvd));
        i.putExtra("steps", getString(R.string.entertainment_warning));
        startActivity(i);
    }

    public void stepOff(View view) {
        Intent i = new Intent(this, SystemIntro.class);
        i.putExtra("step", getString(R.string.entertainment_off));
        i.putExtra("steps", getString(R.string.entertainment_warning));
        startActivity(i);
    }

    public void stepTrouble(View view) {
        Intent i = new Intent(this, SystemIntro.class);
        i.putExtra("step", getString(R.string.entertainment_trouble));
        i.putExtra("steps", getString(R.string.entertainment_warning));
        startActivity(i);
    }
}
