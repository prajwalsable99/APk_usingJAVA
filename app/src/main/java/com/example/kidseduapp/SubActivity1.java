package com.example.kidseduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    ImageView img;
    int curr_img=0;
    public void prev1(View view){
               String idx="imageViewA_"+curr_img;

               int id_old=this.getResources().getIdentifier(idx,"id",getPackageName());
               img=findViewById(id_old);
               img.setAlpha(0f);

               curr_img=(26+curr_img-1)%26;

               String idy="imageViewA_"+curr_img;

                int id_new=this.getResources().getIdentifier(idy,"id",getPackageName());
                 img=findViewById(id_new);
                img.setAlpha(1f);


    }

    public void next1(View view){

        String idx="imageViewA_"+curr_img;

        int id_old=this.getResources().getIdentifier(idx,"id",getPackageName());
        img=findViewById(id_old);
        img.setAlpha(0f);

        curr_img=(curr_img+1)%26;

        String idy="imageViewA_"+curr_img;

        int id_new=this.getResources().getIdentifier(idy,"id",getPackageName());
        img=findViewById(id_new);
        img.setAlpha(1f);


    }
}