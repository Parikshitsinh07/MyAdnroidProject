package com.example.canvas;

import androidx.appcompat.app.*;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    WritingView writingView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        writingView = new WritingView(this);

        // Set the content view to the custom view
        setContentView(writingView);

    }
}