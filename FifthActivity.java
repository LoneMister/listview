package com.app.listview;

import static com.app.listview.R.id.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FifthActivity extends AppCompatActivity {

    ListView listView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        ListView listView3 = findViewById(R.id.listview3);
        List<String> list3 = new ArrayList<>();
        list3.add("M-Shwari");
        list3.add("KCB M-PESA");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list3);
        listView3.setAdapter(arrayAdapter);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //clicked mshwari
                    startActivity(new Intent(FifthActivity.this,Mshwari.class));
                }
                if(i==1){
                    //clicked kcb m-pesa
                    startActivity(new Intent(FifthActivity.this,KCBMPESA.class));
                }
            }
        });
    }
}