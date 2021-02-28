package com.example.parcial01_ejercicio02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private EditText etvotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etvotos = (EditText)findViewById(R.id.txtvotos);

    }
    public void calcular(View v){
        Intent i = new Intent(this, AnswerActivity.class);
        i.putExtra("txtvotos",etvotos.getText().toString());
        startActivity(i);
    }
}