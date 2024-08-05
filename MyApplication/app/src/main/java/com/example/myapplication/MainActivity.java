package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mainlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainlayout = findViewById(R.id.mainlayout);
        registerForContextMenu(mainlayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.manu,menu);
        return true;
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getTitle().toString())
//        {
//            case "Dark(Red)":
//                mainlayout.setBackgroundColor(getResources().getColor(R.color.red_dark));
//                return true;
//
//            case "Light(Red)":
//                mainlayout.setBackgroundColor(getResources().getColor(R.color.red_light));
//                return true;
//
//            case "Dark(Green)":
//                mainlayout.setBackgroundColor(getResources().getColor(R.color.green_dark));
//                return true;
//
//            case "Light(Green)":
//                mainlayout.setBackgroundColor(getResources().getColor(R.color.green_light));
//                return true;
//
//            case "Dark(Blue)":
//                mainlayout.setBackgroundColor(getResources().getColor(R.color.blue_dark));
//                return true;
//
//            case "Light(Blue)":
//                mainlayout.setBackgroundColor(getResources().getColor(R.color.blue_light));
//                return true;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//        }

}