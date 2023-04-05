package com.app.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class KCBMPESA extends AppCompatActivity {

    ListView listView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcbmpesa);

        ListView listView7 = findViewById(R.id.listview7);
        List<String> list7 = new ArrayList<>();
        list7.add("Activate");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list7);
        listView7.setAdapter(arrayAdapter);

    }
}