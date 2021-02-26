package com.example.kidseduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startApp(View view){

        Toast.makeText(this,"app is starting...",Toast.LENGTH_SHORT).show();

        Intent intentobj1=new Intent(this,EduMenuActivity.class);
        startActivity(intentobj1);
    }
}