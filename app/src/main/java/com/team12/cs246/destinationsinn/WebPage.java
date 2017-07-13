package com.team12.cs246.destinationsinn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        setTitle(R.string.reserve);

        WebView web = (WebView) findViewById(R.id.web_page);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(getIntent().getStringExtra("url"));
    }
}
