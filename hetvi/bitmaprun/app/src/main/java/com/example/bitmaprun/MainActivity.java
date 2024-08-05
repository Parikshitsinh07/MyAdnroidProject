package com.example.bitmaprun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        // Set the initial image (boy running)
        imageView.setImageResource(R.drawable.pic1);

        // Change image to boy falling after a delay (e.g., 5 seconds)
        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic2);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic3);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic4);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic5);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic6);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic7);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic8);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic10);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic11);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(R.drawable.pic12);
            }
        }, 5000); // 5000 milliseconds = 5 seconds

    }
}