//package com.civilsalt.exceedapp;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//public class MainActivity extends AppCompatActivity {
//    Button scanBtn,generatorBtn;
//    EditText qrValue;
//    ImageView qrImage;
//    BottomNavigationView bottomNavigationView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        bottomNavigationView =  findViewById(R.id.bottom_navigator);
//        bottomNavigationView.setSelectedItemId(R.id.home);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch(item.getItemId()){
//                    case R.id.dashboard:
//                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.home:
//                        return true;
//                    case R.id.transaction:
//                        startActivity(new Intent(getApplicationContext(), Transaction.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.stock:
//                        startActivity(new Intent(getApplicationContext(), Stock.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.ecosystem:
//                        startActivity(new Intent(getApplicationContext(), ExceedEcosytem.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.more:
//                        startActivity(new Intent(getApplicationContext(), More.class));
//                        overridePendingTransition(0,0);
//                        return true;
//               }
//                return false;
//            }
//        });
//
//        scanBtn = findViewById(R.id.scanBtn);
//        generatorBtn = (Button) findViewById(R.id.generatorBtn);
////        qrValue = (EditText) findViewById(R.id.qrInput);
////        qrImage = (ImageView) findViewById(R.id.imageView);
//
//
//        scanBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                startActivity(new Intent(getApplicationContext(),scanner.class));
//
//            }
//        });
//
//        generatorBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                startActivity(new Intent(getApplicationContext(),QRgenerator.class));
//
//            }
//        });
//
//    }
//}