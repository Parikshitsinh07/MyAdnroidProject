package com.example.assignment12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText sid=findViewById(R.id.sid);
        EditText snm=findViewById(R.id.unm);
        Button insert=findViewById(R.id.insert);
        Button update=findViewById(R.id.update);
        Button delete=findViewById(R.id.delete);
        Button display=findViewById(R.id.display);
        database=openOrCreateDatabase("student_db",MODE_PRIVATE,null);
        database.execSQL("create table if not exists students(sid INTEGER PRIMARY KEY,name TEXT)");
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sid.getText().toString().equals("")||snm.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "please eneter valid username and password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int sid1=Integer.parseInt(sid.getText().toString());
                    String snm1=snm.getText().toString();
                    ContentValues val=new ContentValues();
                    val.put("sid",sid1);
                    val.put("name",snm1);
                    long result=database.insert("students",null,val);
                    if(result!=-1)
                    {
                        Toast.makeText(MainActivity.this, "student insert with sid "+sid1, Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "cant insert the record", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sid1=sid.getText().toString();
                int row=database.delete("students","sid=?",new String[]{sid1});
                if(row>0)
                {
                    Toast.makeText(MainActivity.this, "student deleted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "student not found for this id", Toast.LENGTH_SHORT).show();
                }
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sid.getText().toString().equals("") || snm.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "please provide username and passowrd", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String sid1=sid.getText().toString();
                    String snm1=snm.getText().toString();
                    ContentValues val=new ContentValues();
                    val.put("name",snm1);
                    int row=database.update("students",val,"sid=?",new String[]{sid1});
                    if(row>0)
                    {
                        Toast.makeText(MainActivity.this, "Student updated", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "no student found with this id", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String sid1=sid.getText().toString();
                Cursor cursor=database.query("students",null,"sid=?",new String[]{sid1},null,null,null);
                if(cursor.moveToFirst())
                {
                    int nameIndex = cursor.getColumnIndex("name");
                    if (nameIndex != -1) {
                        String name = cursor.getString(nameIndex);
                        // Displaying the name in a Toast message
                        snm.setText(name);
                        Toast.makeText(MainActivity.this, "Student name: " + name, Toast.LENGTH_SHORT).show();
                    } else {
                        // Handle case where "name" column not found
                        Toast.makeText(MainActivity.this, "Name column not found", Toast.LENGTH_SHORT).show();
                    }
                }*/
                Cursor cursor=database.query("students",null,null,null,null,null,null);
                StringBuilder studentsData = new StringBuilder();
                if (cursor.moveToFirst()) {
                    do {
                        int sidIndex = cursor.getColumnIndex("sid");
                        int nameIndex = cursor.getColumnIndex("name");
                        if (sidIndex != -1 && nameIndex != -1) {
                            int sid = cursor.getInt(sidIndex);
                            String name = cursor.getString(nameIndex);
                            studentsData.append("Student ID: ").append(sid).append(", Name: ").append(name).append("\n");
                        }
                    } while (cursor.moveToNext());
                    Toast.makeText(MainActivity.this, studentsData.toString(), Toast.LENGTH_LONG).show();
                }
                else {
                        // No student data found
                        Toast.makeText(MainActivity.this, "No student data found", Toast.LENGTH_SHORT).show();
                    }
                    cursor.close();
            }
        });



    }
}