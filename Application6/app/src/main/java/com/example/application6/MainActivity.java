package com.example.application6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;


public class MainActivity extends AppCompatActivity {
ConstraintLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout=findViewById(R.id.mainlayout);
        registerForContextMenu(mainLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
        public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getTitle().toString())
        {
            case "Dark(Red)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.red_dark));
                return true;

            case "Light(Red)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.red_light));
                return true;

            case "Dark(Green)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.green_dark));
                return true;

            case "Light(Green)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.green_light));
                return true;

            case "Dark(Blue)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.blue_dark));
                return true;

            case "Light(Blue)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.blue_light));
                return true;


            case "Dark(Yellow)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.yellow_dark));
                return true;

            case "Light(Yellow)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.yellow_light));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {

        int id = item.getItemId();


        switch (item.getTitle().toString()) {
            case "Dark(Red)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.red_dark));
                return true;

            case "Light(Red)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.red_light));
                return true;

            case "Dark(Green)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.green_dark));
                return true;

            case "Light(Green)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.green_light));
                return true;

            case "Dark(Blue)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.blue_dark));
                return true;

            case "Light(Blue)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.blue_light));
                return true;


            case "Dark(Yellow)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.yellow_dark));
                return true;

            case "Light(Yellow)":
                mainLayout.setBackgroundColor(getResources().getColor(R.color.yellow_light));
                return true;

            default:
                return super.onContextItemSelected(item);


        }
    }

}