package com.hmdroid.buylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import static android.graphics.Color.rgb;

public class create_new extends AppCompatActivity {
    ListView listView;
    EditText editText;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new);
        listView =  findViewById(R.id.ListView);
        editText =  findViewById(R.id.editText);
        adapter =   new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1);
       

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.create_new);
        toolbar.setTitleTextColor(rgb(255,255,255));
    }

    public void add(View view){
        String text;
        text = editText.getText().toString();
        adapter.add(text);
    }
}