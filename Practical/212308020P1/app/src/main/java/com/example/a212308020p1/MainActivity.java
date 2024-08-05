package com.example.a212308020p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    WebView webView;
//    WebChromeClient webChromeClient;
//    EditText url;
//    Button open;

//    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.Wevview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://google.com");

    }
//        url = findViewById(R.id.editTextText);
//        open = findViewById(R.id.button);
//
//
//        open.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), MainActivity2.class).putExtra("url", url.getText().toString()));
//            }
//        });
//
//    }
}

//https://www.geeksforgeeks.org