package com.example.canvas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MyCanvasView myCanvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCanvasView = findViewById(R.id.canvasView);
        myCanvasView = new MyCanvasView(this);
    }
}
