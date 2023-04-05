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

public class SeventhActivity extends AppCompatActivity {

    ListView listView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        ListView listView = findViewById(R.id.listview5);
        List<String> list5 = new ArrayList<>();
        list5.add("Mini Statement");
        list5.add("Check Balance");
        list5.add("Change M-PESA PIN");
        list5.add("Change Language");
        list5.add("Update Customer Menu");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list5);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //clicked ministatement
                    startActivity(new Intent(SeventhActivity.this,MpesaPin.class));
                }
                if(i==1){
                    //clicked check balance
                    startActivity(new Intent(SeventhActivity.this,MpesaPin.class));
                }
                if(i==2){
                    //clicked buy change m-pesa pin
                    startActivity(new Intent(SeventhActivity.this,OldPin.class));
                }
                if(i==3){
                    //clicked change language
                    startActivity(new Intent(SeventhActivity.this,Language.class));
                }
                if(i==4){
                    //clicked update customer menu
                    startActivity(new Intent(SeventhActivity.this,MpesaPin.class));
                }
            }
        });
    }
}