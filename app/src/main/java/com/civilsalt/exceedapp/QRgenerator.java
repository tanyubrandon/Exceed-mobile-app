package com.civilsalt.exceedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class QRgenerator extends AppCompatActivity {

    Button  generateBtn;
    EditText qrValue;
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrgenerator);

        generateBtn = (Button) findViewById(R.id.generatorBtn);
        qrValue = (EditText) findViewById(R.id.qrInput);
        qrImage = (ImageView) findViewById(R.id.imageView);

        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = qrValue.getText().toString();

                if(data.isEmpty()){
                    qrValue.setError("Value required");

                }else{
                    // Initializing the QR Encoder with your value to be encoded, type you required and Dimension
                    QRGEncoder qrgEncoder = new QRGEncoder(data, null, QRGContents.Type.TEXT, 500);
                    qrgEncoder.setColorBlack(Color.BLACK); // color of the QR code
                    qrgEncoder.setColorWhite(Color.WHITE);//background color of the qr code
                    // Getting QR-Code as Bitmap

                    Bitmap bitmap = qrgEncoder.getBitmap();
                    // Setting Bitmap to ImageView
                    qrImage.setImageBitmap(bitmap);
                }
            }
        });
    }
}