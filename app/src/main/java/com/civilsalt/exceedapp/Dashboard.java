package com.civilsalt.exceedapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);


        //start of bottom navigation

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.dashboard:
                        return true;
                    case R.id.home:
                    case R.id.ecosystem:
                        startActivity(new Intent(getApplicationContext(), ExceedEcosytem.class));
                        overridePendingTransition(0, 0);
                        return true;
//                    case R.id.transaction:
//                        startActivity(new Intent(getApplicationContext(), Transaction.class));
//                        overridePendingTransition(0, 0);
//                        return true;
                    case R.id.stock:
                        startActivity(new Intent(getApplicationContext(), Stock.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.more:
                        startActivity(new Intent(getApplicationContext(), More.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });//End of bottom navigation

    }


    //Top navigation

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {

        getMenuInflater().inflate(R.menu.settings, menu);
          return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item) {

            Intent intent = new Intent(Dashboard.this, Item.class);
            startActivity(intent);

            return true;

        }
//        else if (id == R.id.item) {
//
//            Intent intent = new Intent(Dashboard.this, Item.class);
//            startActivity(intent);
//
//            return true;
//        }
        else if (id == R.id.linked_devices) {

            Intent intent = new Intent(Dashboard.this, LinkedDevices.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.location) {

            Intent intent = new Intent(Dashboard.this, Location.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.measurement_unit) {

            Intent intent = new Intent(Dashboard.this, MeasurementUnit.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.role) {

            Intent intent = new Intent(Dashboard.this, Role.class);
            startActivity(intent);

            return true;
        }

        else if (id == R.id.role) {

            Intent intent = new Intent(Dashboard.this, Role.class);
            startActivity(intent);

            return true;
        }

        else if (id == R.id.profile) {

            Intent intent = new Intent(Dashboard.this, Profile.class);
            startActivity(intent);

            return true;
        }
        return false;
    }//End of top navigation

    //searchView

}
