package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class activity_Html_3 extends AppCompatActivity {


    Button btn;
    Intent intent;
    RadioButton rbbi1, rbbi2, rbbi3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__html_3);

        btn=findViewById(R.id.nbtn);

        rbbi1=findViewById(R.id.rbtt1);
        rbbi2=findViewById(R.id.rbtt2);
        rbbi3=findViewById(R.id.rbtt3);
    }

    public void radiohandler(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbtt1:
                if (checked)
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void radiohandler1(View view) {
        boolean checked1 = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbtt2:
                if (checked1)
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void radiohandler2(View view) {
        boolean checked2 = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbtt3:
                if (checked2)
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void action(View view) {
        intent =new Intent(this,Activity_end.class);
        startActivity(intent);
    }
}