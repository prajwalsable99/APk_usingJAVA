package com.example.kidseduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EduMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu_menu);
    }

    public void goABCD(View view){

        Toast.makeText(this,"starting....",Toast.LENGTH_SHORT).show();

        Intent obja=new Intent(this,SubActivity1.class);
        startActivity(obja);
    }
    public void go1234(View view){

        Toast.makeText(this,"starting....",Toast.LENGTH_SHORT).show();

        Intent objb=new Intent(this,SubActivity2.class);
        startActivity(objb);
    }
    public void goFruits(View view){

        Toast.makeText(this,"starting....",Toast.LENGTH_SHORT).show();

        Intent objc=new Intent(this,SubActivity3.class);
        startActivity(objc);
    }
    public void goVeggies(View view){

        Toast.makeText(this,"starting....",Toast.LENGTH_SHORT).show();

        Intent objd=new Intent(this,SubActivity4.class);
        startActivity(objd);
    }
}