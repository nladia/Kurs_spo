package com.example.kurs_spo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kurs_spo.R;


public class StartGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        Button btn_warrior = (Button) findViewById(R.id.btn_warrior);
        Button btn_rouge = (Button) findViewById(R.id.btn_rouge);
        Button btn_archer = (Button) findViewById(R.id.btn_archer);

        btn_warrior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent warriorIntent;

            }
        });

        btn_rouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rougeIntent;

            }
        });

        btn_archer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent archerIntent;
            }
        });



    }



}
