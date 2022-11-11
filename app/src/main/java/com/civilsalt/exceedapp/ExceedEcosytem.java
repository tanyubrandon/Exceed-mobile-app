package com.civilsalt.exceedapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ExceedEcosytem extends AppCompatActivity {

    Button scanBtn, generateBtn;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exceed_ecosytem);

        scanBtn = (Button) findViewById(R.id.scanBtn);
        generateBtn = (Button) findViewById(R.id.generatorBtn);


        bottomNavigationView =  findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.ecosystem);

        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), scanner.class));
            }

        });

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               startActivity(new Intent(getApplicationContext(),QRgenerator.class));
                startActivity(new Intent(getApplicationContext(), QRgenerator.class));


            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), ExceedEcosytem.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.transaction:
                        startActivity(new Intent(getApplicationContext(), Transaction.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.stock:
                        startActivity(new Intent(getApplicationContext(), Stock.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.ecosystem:
                        return true;
                    case R.id.more:
                        startActivity(new Intent(getApplicationContext(), More.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
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

            Intent intent = new Intent(ExceedEcosytem.this, Item.class);
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

            Intent intent = new Intent(ExceedEcosytem.this, LinkedDevices.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.location) {

            Intent intent = new Intent(ExceedEcosytem.this, Location.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.measurement_unit) {

            Intent intent = new Intent(ExceedEcosytem.this, MeasurementUnit.class);
            startActivity(intent);

            return true;
        } else if (id == R.id.role) {

            Intent intent = new Intent(ExceedEcosytem.this, Role.class);
            startActivity(intent);

            return true;
        }

        else if (id == R.id.role) {

            Intent intent = new Intent(ExceedEcosytem.this, Role.class);
            startActivity(intent);

            return true;
        }


        else if (id == R.id.profile) {

            Intent intent = new Intent(ExceedEcosytem.this, Profile.class);
            startActivity(intent);

            return true;
        }

        return false;
    }//End of top navigation
}