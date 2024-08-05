package com.example.problem3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText urm;
    EditText pwd ;
    boolean user ;
    boolean Password ;
    String emailPattern,Username;

    Pattern pattern;

    Matcher matcher;
    TextWatcher Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         user = false;
         Password = false;
        btnlogin = (Button)findViewById(R.id.button);
        urm =findViewById(R.id.UserName);
        pwd = findViewById(R.id.Password);
        btnlogin.setEnabled(false);
        emailPattern = "^[a-zA-Z0-9_.+-]+@gmail\\.(com|in|org|net)$";
        pattern = Pattern.compile(emailPattern);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(urm.getText().toString().equals("") || pwd.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"UserName And Password is reqired!!",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(matcher.matches() && pwd.getText().toString().equals("1234")){
                        String unm = urm.getText().toString();
                        Intent intent = new Intent(MainActivity.this, LoginPage.class);
                        intent.putExtra("Uername",unm);
                        Toast.makeText(MainActivity.this,"username or password is Valid",Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"incorrect username or password",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        urm.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if(!hasFocus){
                    if(urm.getText().toString().equals("") ){
                        urm.setBackgroundColor(Color.parseColor("#ff0000"));

                    }
                    else{
                        matcher = pattern.matcher(urm.getText().toString());
                        if(matcher.matches()){
                            urm.setBackgroundColor(Color.parseColor("#00ff40"));
                            Toast.makeText(MainActivity.this,"Email is valid",Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Toast.makeText(MainActivity.this,"Email is inValid",Toast.LENGTH_SHORT).show();
                            urm.setBackgroundColor(Color.parseColor("#ff0000"));
                        }
                    }
                }
                else {
                    urm.setBackgroundColor(Color.parseColor("#FFFFFF"));

                }
            }

        });
        pwd.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(pwd.getText().toString().equals("") ){
                        pwd.setBackgroundColor(Color.parseColor("#ff0000"));

                    }
                    else{
                        if(pwd.getText().toString().equals("1234") ){
                            pwd.setBackgroundColor(Color.parseColor("#00ff40"));

                        }
                        else{
                            pwd.setBackgroundColor(Color.parseColor("#ff0000"));
                        }
                    }
                }
                else {
                    pwd.setBackgroundColor(Color.parseColor("#FFFFFF"));

                }
            }
        });
        Login = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                matcher = pattern.matcher(urm.getText().toString());
                btnlogin.setEnabled(matcher.matches() && pwd.getText().toString().equals("1234"));
            }
        };
        urm.addTextChangedListener(Login);
        pwd.addTextChangedListener(Login);
    }

}