package com.example.bitmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    MyBitmapCanvas myBitmapCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyBitmapCanvas myBitmapCanvas1 = new MyBitmapCanvas(this);

        // Set the content view to the WritingView
        setContentView(myBitmapCanvas1);
    }
}