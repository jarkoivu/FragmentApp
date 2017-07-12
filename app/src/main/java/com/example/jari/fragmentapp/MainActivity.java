package com.example.jari.fragmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This is called by Top Fragment when button is clicked
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomPictureFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomPictureFragment.setMemeText(top, bottom);
    }
}
