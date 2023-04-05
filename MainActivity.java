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

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        List<String> list = new ArrayList<>();
        list.add("Send Money");
        list.add("Withdraw Cash");
        list.add("Buy Airtime");
        list.add("Loans and Savings");
        list.add("Lipa na M-PESA");
        list.add("My Account");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //clicked send money
                    startActivity(new Intent(MainActivity.this,SecondActivity.class));
                }
                if(i==1){
                    //clicked withdraw cash
                    startActivity(new Intent(MainActivity.this,ThirdActivity.class));
                }
                if(i==2){
                    //clicked buy airtime
                    startActivity(new Intent(MainActivity.this,FourthActivity.class));
                }
                if(i==3){
                    //clicked loans and savings
                    startActivity(new Intent(MainActivity.this,FifthActivity.class));
                }
                if(i==4){
                    //clicked lipa na mpesa
                    startActivity(new Intent(MainActivity.this,SixthActivity.class));
                }
                if(i==5){
                    //clicked my account
                    startActivity(new Intent(MainActivity.this,SeventhActivity.class));
                }
            }
        });

    }
}