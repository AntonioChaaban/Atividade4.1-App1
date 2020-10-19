package com.example.atividade41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Button button = (Button) findViewById(R.id.activity1);
        button.setText("1");
    }
    public void passInt(View v){
        TextView tx = (TextView) findViewById(R.id.activity1);
        //EditText ed = (EditText) findViewById(R.id.activity1);
        String number = tx.getText().toString();
        System.out.println(number);
        Bundle bundle = new Bundle();
        bundle.putString("valorbotao",number);
        Intent aux = new Intent(Activity1.this,Activity2.class);
        aux.putExtras(bundle);
        startActivityForResult(aux,1);
    }
    @Override
    public void onActivityResult(int requestCode,int resultcode, Intent data) {
        super.onActivityResult(requestCode, resultcode, data);
        Button button = (Button) findViewById(R.id.activity1);
        button.setText(String.valueOf(resultcode + 1));
    }

}