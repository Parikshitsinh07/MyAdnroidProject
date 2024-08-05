package com.example.myapplicationli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewWithGradientCircle viewWithGradientCircle = new ViewWithGradientCircle(this);
        setContentView(viewWithGradientCircle);
    }
}