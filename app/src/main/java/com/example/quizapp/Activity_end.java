package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_end extends AppCompatActivity {

    Intent intent;
    Button btne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        btne=findViewById(R.id.finish);
    }

    public void endaction(View view) {
        intent =new Intent(this,CategoriesActivity.class);
        startActivity(intent);
    }
}