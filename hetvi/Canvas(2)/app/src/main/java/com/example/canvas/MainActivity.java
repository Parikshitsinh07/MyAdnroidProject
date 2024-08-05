package com.example.canvas;

import androidx.appcompat.app.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    WritingView writingView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        writingView = findViewById(R.id.MyVew);
        writingView = new WritingView(this);

    }
}