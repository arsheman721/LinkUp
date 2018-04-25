package com.example.ahmed.bfreshersappsql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventHome extends AppCompatActivity {

    private Button button8;

    public void Home(){
        Intent intent = new Intent(this,Main.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_home);

        //button8 = findViewById(R.id.button8);

        //button8.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View view) {
               // Home();
            }
      //  });
    //}
}
