package com.example.ahmed.bfreshersappsql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {

    public ImageButton but1,but2;



    public void openTheMap(){
        Intent intent = new Intent(this,Map.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this,UserAreaActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 =  findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheMap();

            }
        });


        but2 = findViewById(R.id.imageButton);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });



    }
}
