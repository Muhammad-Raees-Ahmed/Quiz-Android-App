package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class activity_Html_2 extends AppCompatActivity {


    Button btn;
    Intent intent;
    RadioButton rbtn1, rbtn2, rbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__html_2);

        btn=findViewById(R.id.nbtn);

        rbtn1=findViewById(R.id.rbt1);
        rbtn2=findViewById(R.id.rbt2);
        rbtn3=findViewById(R.id.rbt3);
    }

    public void radiohandler(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbt1:
                if (checked)
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void radiohandler1(View view) {

        boolean checked1 = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbt2:
                if (checked1)
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void radiohandler2(View view) {

        boolean checked2 = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbt3:
                if (checked2)
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void action(View view) {
        intent=new Intent(this,activity_Html_3.class);
        startActivity(intent);
    }
}