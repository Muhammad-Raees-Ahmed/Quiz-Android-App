package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_java_1 extends AppCompatActivity {
    Intent intent;
    EditText et;
    Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_1);

        et=findViewById(R.id.anstv);
        btn=findViewById(R.id.nbtn);
        btn1=findViewById(R.id.cbtn);
    }

    public void action(View view) {
        intent=new Intent(this,activity_java_2.class);
        startActivity(intent);
    }

    public void action1(View view) {
        et=findViewById(R.id.anstv);
        String ans=et.getText().toString();

        if (ans.equals("3")){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "InCorrect", Toast.LENGTH_SHORT).show();
        }
    }
}