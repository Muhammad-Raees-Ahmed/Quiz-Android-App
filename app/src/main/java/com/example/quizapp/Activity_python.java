package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_python extends AppCompatActivity  {
    Button btn1,btn2;
    Intent intent;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        et=findViewById(R.id.anstv1);
        btn1=findViewById(R.id.nbtn1);
        btn2=findViewById(R.id.cbtn1);
    }


    public void action(View view) {
        intent=new Intent(this,activity_python_1.class);
        startActivity(intent);
    }
    public void action1(View view) {
        et=findViewById(R.id.anstv1);
        String ans=et.getText().toString();

        if (ans.equals("one") ){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "InCorrect", Toast.LENGTH_SHORT).show();
        }

    }
}