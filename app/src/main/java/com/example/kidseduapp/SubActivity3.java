package com.example.kidseduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SubActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);
    }

    ImageView img;
    int curr_img=0;


    public void nextFruit(View view){

        String idx="imageViewC_"+curr_img;

        int id_old=this.getResources().getIdentifier(idx,"id",getPackageName());
        img=findViewById(id_old);
        img.setAlpha(0f);

        curr_img=(curr_img+1)%9;

        String idy="imageViewC_"+curr_img;

        int id_new=this.getResources().getIdentifier(idy,"id",getPackageName());
        img=findViewById(id_new);
        img.setAlpha(1f);


    }
}