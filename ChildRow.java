package com.example.kryspinsaro.uniapp;

/**
 * Created by KryspinSaro on 25/04/2018.
 */

public class ChildRow {
    private int icon;
    private String text;

    public ChildRow(int icon, String text) {
        this.icon = icon;
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }
}
