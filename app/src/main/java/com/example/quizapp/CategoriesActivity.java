package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CategoriesActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        lv=findViewById(R.id.listv);

        ArrayList<String> obj=new ArrayList<>();
        obj.add("Python");
        obj.add("Java");
        obj.add("Javascript");
        obj.add("Html");
        obj.add("Css");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,obj);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent=new Intent(view.getContext(),Activity_python.class);
                    startActivity(intent);
                }
               else if (position == 1){
                    Intent intent=new Intent(view.getContext(),activity_java.class);
                    startActivity(intent);
                }
                else if (position == 2){
                    Intent intent=new Intent(view.getContext(),activity_javascript.class);
                    startActivity(intent);
                }
                else if (position == 3){
                    Intent intent=new Intent(view.getContext(),activity_Html.class);
                    startActivity(intent);
                }
            }
        });
    }
}