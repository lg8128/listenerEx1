package com.example.listenerex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Intent si;
    TextView tvBlue,tvRed,tvWin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        si= getIntent();
        tvBlue = findViewById(R.id.tvBlue);
        tvRed = findViewById(R.id.tvRed);
        tvWin = findViewById(R.id.tvwin);
        int xblue = si.getIntExtra("blueR",-1);
        int xred = si.getIntExtra("redR",-1);

        tvBlue.setText("התוצאה של השחקן הכחול היא-"+""+xblue);
        tvRed.setText("התוצאה של השחקן האדום היא-"+""+xred);

        if(xblue>xred){
            tvWin.setText("המנצח הוא השחקן הכחול");
        }
        if(xblue<xred) {
            tvWin.setText("המנצח הוא השחקן האדום");
        }
        if(xblue==xred){
            tvWin.setText("מספר הנקודות שווה");
        }

    }

    public void toA2(View view) {
        finish();
    }
}