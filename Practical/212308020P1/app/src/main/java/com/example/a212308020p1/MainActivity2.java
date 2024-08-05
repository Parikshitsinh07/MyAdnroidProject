package com.example.a212308020p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = Objects.requireNonNull(getIntent().getExtras()).getString("url");
        setContentView(R.layout.activity_main2);
        webView = findViewById(R.id.Wevview);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
    }
}