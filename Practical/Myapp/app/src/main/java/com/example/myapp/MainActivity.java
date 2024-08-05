package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.MainView);
        view.setBackgroundColor(getColor(R.color.Bule));
        ImageView imageView = findViewById(R.id.MainImg);
        if(view.isActivated()){
            Toast.makeText(this, "Visible", Toast.LENGTH_SHORT).show();
        }

    }
}