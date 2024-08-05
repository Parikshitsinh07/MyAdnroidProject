package com.example.circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewWithRedDot viewWithRedDot = new ViewWithRedDot(this);
        // Set the content view to the WritingView
        setContentView(viewWithRedDot);
    }
}