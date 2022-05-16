package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class activity_javascript_2 extends AppCompatActivity {

    Intent intent;
    Button btn,btn1;
    CheckBox che1,che2,che3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript_2);

        btn=findViewById(R.id.nbtn);
        btn1=findViewById(R.id.cbtn);

        che1=findViewById(R.id.chbe1);
        che2=findViewById(R.id.chbe2);
        che3=findViewById(R.id.chbe3);
    }

    public void action1(View view) {
        if (che3.isChecked()){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void action(View view) {
        intent=new Intent(this,activity_javascript_3.class);
        startActivity(intent);
    }
}