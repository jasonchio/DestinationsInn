package com.team12.cs246.destinationsinn;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button dest;
    Button blk;
    EditText usernameinput;
    EditText passwordinput;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameinput = (EditText) findViewById(R.id.username);
        passwordinput = (EditText) findViewById(R.id.password);
        text = (TextView)findViewById(R.id.something);
        dest = (Button) findViewById(R.id.dest);
        blk = (Button) findViewById(R.id.blk);

        dest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinationInn.class);
                startActivity(intent);
            }
        });

        public void saveinfo(View v){
            SharedPreferences share = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = share.edit();
            editor.putString("username", usernameinput.getText().toString());
            editor.putString("password", passwordinput.getText().toString());
            editor.apply();
            Toast.makeText(this, "saved", Toast.LENGTH_LONG).show();
        }


    }

}