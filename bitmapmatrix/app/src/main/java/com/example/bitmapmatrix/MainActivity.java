package com.example.bitmapmatrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Access the custom view from the layout
        BitmapTransformView bitmapTransformView = findViewById(R.id.bitmapTransformView);
        // You can also modify properties of the custom view here if needed
    }
}