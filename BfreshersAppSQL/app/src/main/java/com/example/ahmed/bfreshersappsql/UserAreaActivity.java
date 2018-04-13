package com.example.ahmed.bfreshersappsql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
//
//        Button HomePageLink = (Button) findViewById(R.id.bHomepage);
//        HomePageLink.setOnClickListener((View.OnClickListener) this);

        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        int age = intent.getIntExtra("age", -1);


        String message = name + " Welcome to User area/ settings";
        welcomeMessage.setText(message);
        etEmail.setText(email);
        etAge.setText(age + "");


//            Log.i("clicks", "You Clicked B1");
//            Intent i = new Intent(UserAreaActivity.this, Homepage.class);
//            startActivity(i);


        }
    }

