package com.civilsalt.exceedapp;

import android.os.Bundle;
import android.view.Menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class NewLocation extends AppCompatActivity {
//    Button action_cancel = (Button) findViewById(R.id.action_cancel);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_location);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
               return true;
    }
}