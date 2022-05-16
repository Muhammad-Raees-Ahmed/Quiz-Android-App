package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class activity_javascript_3 extends AppCompatActivity {

    Intent intent;
    Button btn,btn1;
    CheckBox cb1,cb2,cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript_3);

        btn=findViewById(R.id.cbtn);
        btn1=findViewById(R.id.nbtn);

        cb1=findViewById(R.id.chbex1);
        cb2=findViewById(R.id.chbex2);
        cb3=findViewById(R.id.chbex3);
    }

    public void action1(View view) {
       if (cb2.isChecked()){
           Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
       }
       else{
           Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
       }
    }

    public void action(View view) {
        intent =new Intent(this,Activity_end.class);
        startActivity(intent);
    }
}