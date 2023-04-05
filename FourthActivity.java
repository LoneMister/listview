package com.app.listview;

import static com.app.listview.R.id.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class FourthActivity extends AppCompatActivity {

    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        ListView listView2 = findViewById(R.id.listview2);
        List<String> list2 = new ArrayList<>();
        list2.add("My phone");
        list2.add("Other phone");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list2);

        listView2.setAdapter(arrayAdapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    //clicked my phone
                    startActivity(new Intent(FourthActivity.this, MyPhone.class));
                }
                if (i == 1) {
                    //clicked other phone
                    startActivity(new Intent(FourthActivity.this, OtherPhone.class));
                }

            }
        });
    }
}