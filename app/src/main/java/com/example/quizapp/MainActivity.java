package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button startbtn,bookmarkbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gocategories(View view) {
        startbtn=findViewById(R.id.start_btn);
        bookmarkbtn=findViewById(R.id.bookmark_btn);
        intent =new Intent(this,CategoriesActivity.class);
        startActivity(intent);
    }
}