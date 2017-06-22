package com.example.seekers.wheresmystuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LostItemsListActivity extends AppCompatActivity {

    ArrayAdapter<LostItem> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_items_list);
        adapter = new ArrayAdapter<LostItem>(this, R.layout.activity_lost_items_list,WelcomeScreenActivity.lostItemList.getLostItemList());
        ListView listView = (ListView) findViewById(R.id.itemsList);
        listView.setAdapter(adapter);
    }
}
