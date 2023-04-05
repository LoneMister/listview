package com.app.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Mshwari extends AppCompatActivity {

    ListView listView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mshwari);

        listView6 = findViewById(R.id.listview6);
        List<String> list6 = new ArrayList<>();
        list6.add("Send to M-Shwari");
        list6.add("Withdraw from M-Shwari");
        list6.add("Lock Savings Account");
        list6.add("Loan @9% for 30 days");
        list6.add("Check Balance");
        list6.add("Mini Statement");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list6);
        listView6.setAdapter(arrayAdapter);

    }
}