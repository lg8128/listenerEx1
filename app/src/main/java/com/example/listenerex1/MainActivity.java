package com.example.listenerex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnBlue, btnRed, btn1;

    int xBlue, xRED;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        xBlue = 0;
        xRED = 0;

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                xBlue++;
            }


        });


        btnRed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                xRED = xRED + 2;
                return false;
            }


        });

    }

    public void GO(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("blueR", xBlue);
        si.putExtra("redR", xRED);
        startActivity(si);
        xRED=0;
        xBlue=0;
    }
}