package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class activity_python_1 extends AppCompatActivity {
    Button btn3,btn4;
    Intent intent;

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_1);

        et1=findViewById(R.id.anstv2);
        btn3=findViewById(R.id.nbtn2);
        btn4=findViewById(R.id.cbtn2);

    }
    public void action1(View view) {
        et1=findViewById(R.id.anstv2);
        String ans=et1.getText().toString();

        if (ans.equals("two")){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "InCorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void action(View view) {
        intent=new Intent(this,activity_python_2.class);
        startActivity(intent);
    }
}