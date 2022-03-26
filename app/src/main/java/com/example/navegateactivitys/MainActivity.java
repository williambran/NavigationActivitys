package com.example.navegateactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {

    Button btnNavegates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNavegates = findViewById(R.id.btnNavegate);
        btnNavegates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nevegateSegundaActivity(view);
            }
        });
    }


    public void nevegateSegundaActivity(View v){
        Intent intent = new Intent(this, segundaActivity.class);
        startActivity(intent);
    }





}