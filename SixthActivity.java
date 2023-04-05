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

public class SixthActivity extends AppCompatActivity {

    ListView listView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        ListView listView = findViewById(R.id.listview4);
        List<String> list4 = new ArrayList<>();
        list4.add("Pay Bill");
        list4.add("Buy Goods and Services");
        list4.add("Pochi La Biashara");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list4);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //clicked paybill
                    startActivity(new Intent(SixthActivity.this,PayBill.class));
                }
                if(i==1){
                    //clicked buy goods
                    startActivity(new Intent(SixthActivity.this,BuyGoods.class));
                }
                if(i==2){
                    //clicked pochi la biashara
                    startActivity(new Intent(SixthActivity.this,Pochi.class));
                }
            }
        });
    }
}