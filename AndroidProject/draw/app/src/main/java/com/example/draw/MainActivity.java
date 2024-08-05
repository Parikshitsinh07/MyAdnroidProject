package com.example.draw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.compose.ui.graphics.Canvas;

import android.os.Bundle;

import java.io.ByteArrayOutputStream;

import Color.Blue;
import Color.Red;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        private Object drawCircle (val val brush brush)
        {
            Object Brush;
            brush = Brush.horizontalGradient(onStop(Red, Blue));
            ByteArrayOutputStream Modifier;
            Object onDraw;
            Canvas(
                    Modifier.size(200.dp),
                    onDraw = {
                            drawCircle(brush)
                    }
            )
        }