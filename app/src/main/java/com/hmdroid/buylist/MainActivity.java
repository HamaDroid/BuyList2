package com.hmdroid.buylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar2);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(rgb(255, 255, 255));
    }

    public void create(View view) {
        Intent intent = new Intent(getApplicationContext(), create_new.class);
        startActivity(intent);
    }
}