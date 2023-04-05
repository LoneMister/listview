package com.app.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Language extends AppCompatActivity {

    ListView listView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        ListView listView = findViewById(R.id.listview8);
        List<String> list8 = new ArrayList<>();
        list8.add("English");
        list8.add("Kiswahili");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list8);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //clicked English
                    startActivity(new Intent(Language.this,MpesaPin.class));
                }
                if(i==1){
                    //clicked Kiswahili
                    startActivity(new Intent(Language.this,MpesaPin.class));
                }
            }
        });
    }
}