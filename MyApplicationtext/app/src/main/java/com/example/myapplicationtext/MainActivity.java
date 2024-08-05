package com.example.myapplicationtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Access the custom view from the layout
        TextViewWithCustomTypefaceextends customTextView = findViewById(R.id.customTextView);
        // You can also modify properties of the custom view here if needed
    }
}