package com.example.kryspinsaro.uniapp;

import java.util.ArrayList;

/**
 * Created by KryspinSaro on 25/04/2018.
 */

public class ParentRow {
    private String name;
    private ArrayList<ChildRow> childList;

    public ParentRow(String name, ArrayList<ChildRow> childList)  {
        this.name = name;
        this.childList = childList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ChildRow> getChildList() {

        return null;
    }}
