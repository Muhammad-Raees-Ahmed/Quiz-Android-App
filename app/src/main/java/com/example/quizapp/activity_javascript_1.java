package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class activity_javascript_1 extends AppCompatActivity {

    Button btn,btn1;
    CheckBox chb1,chb2,chb3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript_1);

        btn=findViewById(R.id.nbtn);
        btn1=findViewById(R.id.nbtn);

        chb1=findViewById(R.id.cb1);
        chb2=findViewById(R.id.cb2);
        chb3=findViewById(R.id.cb3);
    }

    public void action(View view) {
        intent =new Intent(this,activity_javascript_2.class);
        startActivity(intent);
    }

    public void action1(View view) {
        if (chb1.isChecked()){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}