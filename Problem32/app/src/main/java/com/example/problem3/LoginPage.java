package com.example.problem3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    TextView textView ;
    Intent intent;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        textView = findViewById(R.id.textView3);
        intent = getIntent();
        if(intent != null){
            String urm = intent.getStringExtra("Uername");
            textView.setText("welcome:"+urm);
        }
    }
}