package com.example.problem5;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.problem5.R;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        imageView=findViewById(R.id.imageView);
        final String[] str=getResources().getStringArray(R.array.Parikshit);

        ArrayAdapter <String>arrayAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,str);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem=parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,selectedItem,Toast.LENGTH_SHORT).show();
                imageView.getLayoutParams().height=1000;

                switch (selectedItem) {
                    case "iphone":
                        imageView.setImageResource(R.drawable.img);
                        break;
                    case "samsung":
                        imageView.setImageResource(R.drawable.img_1);
                        break;
                    case "oneplus":
                        imageView.setImageResource(R.drawable.img_2);
                        break;
                    case "vivo":
                        imageView.setImageResource(R.drawable.img_3);
                        break;
                    case "Motorola":
                        imageView.setImageResource(R.drawable.img_4);
                        break;
                    case "redmi":
                        imageView.setImageResource(R.drawable.img_5);
                        break;
                    case "jio":
                        imageView.setImageResource(R.drawable.img_6);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}