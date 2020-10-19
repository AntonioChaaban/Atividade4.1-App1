package com.example.atividade41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int number = Integer.parseInt(getIntent().getStringExtra("valorbotao")) + 1;
        System.out.println(number + "sdfjhksjdskjb");
        Button button = (Button) findViewById(R.id.activity2);
        button.setText(String.valueOf(number));
        setResult(number);
    }

    public void restart(View view){
        finish();
    }
}