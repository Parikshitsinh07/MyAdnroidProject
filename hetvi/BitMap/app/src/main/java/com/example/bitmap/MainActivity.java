package com.example.bitmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyBitmapCanvas myBitmapCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBitmapCanvas = findViewById(R.id.MyVew);
        myBitmapCanvas =new MyBitmapCanvas(this);
    }
}