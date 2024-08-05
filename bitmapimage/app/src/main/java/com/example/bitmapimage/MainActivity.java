package com.example.bitmapimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Access the custom view from the layout
        View bitmapDrawingView = findViewById(R.id.bitmapDrawingView);
        // You can also modify properties of the custom view here if needed
    }
}