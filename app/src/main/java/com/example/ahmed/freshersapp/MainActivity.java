package com.example.ahmed.freshersapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String PACKAGE_NAME;
    static String value = "", value1 = "", id = "";//Variable Description
    static String genius[], uid[], ulid;
    static int datab = 0;
    static EditText UserEmail, UserPassword;
    static String item = "", ufname = "", ulname = "";
    static TextView txtView;
    static ArrayList<String> arrayList;
    static ArrayAdapter<String> adapter;
    static ListView lv;
    static String[] sessions;
    static String result = "";
    static int num, lengthh;
    static int indexx = 0;
    private ProgressDialog progress;//ProgressDialog for Async Task (Background Network related Processes)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        
    }
}