package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_python_3 extends AppCompatActivity {

    Button btn7,btn8;
    EditText et3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_3);
        et3=findViewById(R.id.anstv4);
        btn7=findViewById(R.id.nbtn4);
        btn8=findViewById(R.id.cbtn4);
    }

    public void action1(View view) {

        et3=findViewById(R.id.anstv4);
        String ans=et3.getText().toString();

        if (ans.equals("three")){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "InCorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void action(View view) {
        intent=new Intent(this,Activity_end.class);
        startActivity(intent);
    }
}