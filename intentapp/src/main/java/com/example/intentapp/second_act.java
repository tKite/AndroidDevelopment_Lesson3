package com.example.intentapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;

public class second_act extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);
        String time = (String) getIntent().getSerializableExtra("time");
        text = findViewById(R.id.newText);
        text.setText("КВАДРАТ ЗНАЧЕНИЯ " +
                "МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ ЧИСЛО 121, а текущее " +
                "время " + time);
    }
}