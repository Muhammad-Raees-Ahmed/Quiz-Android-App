package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class activity_Html extends AppCompatActivity {

    Button btn, btn1;
    Intent intent;
    RadioButton rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__html);

        btn = findViewById(R.id.nbtn);
        btn1 = findViewById(R.id.cbtn);

        rb1 = findViewById(R.id.r1);
        rb2 = findViewById(R.id.r2);
        rb3 = findViewById(R.id.r3);
    }

    public void radiohandler(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.r1:
                if (checked)
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    public void action(View view) {
        intent = new Intent(this, activity_Html_1.class);
        startActivity(intent);
    }

    public void radiohandler1(View view) {

        boolean checked1 = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.r2:
                if (checked1)
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                // Ninjas rule
                break;

        }
    }

    public void radiohandler2(View view) {
        boolean checked2 = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.r3:
                if (checked2)
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                // Ninjas rule
                break;
        }
    }
}