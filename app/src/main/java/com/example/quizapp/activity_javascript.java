package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class activity_javascript extends AppCompatActivity {

    Button btn,btn1;
    CheckBox ch1,ch2,ch3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);

        btn=findViewById(R.id.nbtn);
        btn1=findViewById(R.id.nbtn);

        ch1=findViewById(R.id.c1);
        ch2=findViewById(R.id.c2);
        ch3=findViewById(R.id.c3);
    }

    public void action1(View view) {
        //
        if (ch2.isChecked()){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void action(View view) {
        intent =new Intent(this,activity_javascript_1.class);
        startActivity(intent);
    }
}