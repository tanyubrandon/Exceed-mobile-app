package com.civilsalt.exceedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item extends AppCompatActivity {

    Button itemBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        itemBtn= (Button)findViewById(R.id.addItemBtn);
        itemBtn.setBackgroundColor(Color.WHITE);

        itemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Newitem.class));
            }

        });
    }
}