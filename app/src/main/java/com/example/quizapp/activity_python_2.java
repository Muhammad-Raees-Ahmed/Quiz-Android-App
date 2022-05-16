package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_python_2 extends AppCompatActivity {

    Intent intent;
    EditText et2;
    Button btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_2);

        et2=findViewById(R.id.anstv3);
        btn5=findViewById(R.id.nbtn3);
        btn6=findViewById(R.id.cbtn3);
    }

    public void action(View view) {
        intent=new Intent(this,activity_python_3.class);
        startActivity(intent);

    }

    public void action1(View view) {
        et2=findViewById(R.id.anstv3);
        String ans=et2.getText().toString();

        if (ans.equals("one")){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "InCorrect", Toast.LENGTH_SHORT).show();
        }
    }
}