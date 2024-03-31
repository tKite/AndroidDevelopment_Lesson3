package com.example.favouritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    public TextView DevelopBook;
    public EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            DevelopBook = findViewById(R.id.developerBook);
            String book = extras.getString(MainActivity.KEY);
            DevelopBook.setText(String.format("Любимая книга разработчика - %s", book));
        }
    }
    public void sendBut(View view){
        Intent data = new Intent();
        editName = findViewById(R.id.editName);
        data.putExtra(MainActivity.USER_MESSAGE, editName.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}