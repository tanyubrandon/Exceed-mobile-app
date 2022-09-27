package com.civilsalt.exceedapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class  Location extends AppCompatActivity {

    Button addLocation;
//    ListView listView;
//    String[] name = {"tanyu","Asong","Brandon","Labu","Daina","Charles","Sosah","Marcus","Blasius",
//            "Bless","Blesser","Jennifer","Joseph"};

//    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        addLocation = (Button)findViewById(R.id.addLocationBtn);
        addLocation.setBackgroundColor(Color.WHITE);

        addLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NewLocation.class));
            }

        });

//        listView = (ListView) findViewById(list_view );

//        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);
//        listView.setAdapter(arrayAdapter);
    }

//    @Override
//    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
//
////        getMenuInflater().inflate(R.menu.settings, menu);
//
//        //search inflater
//        getMenuInflater().inflate(R.menu.searchmenu, menu);
//        MenuItem menuItem = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) menuItem.getActionView();
//        searchView.setQueryHint("Search here");
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String newText) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//
//                arrayAdapter.getFilter().filter(newText);
//                return false;
//            }
//        });
//        return super.onCreateOptionsMenu(menu);
//    }

}