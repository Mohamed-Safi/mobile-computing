package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class informationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);


        Button btn_weightDecre = findViewById(R.id.btn_weightDecre);
        btn_weightDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.editText_weight);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue++;
                ed.setText(intValue+"");
            }
        });

        Button btn_weightIncre = findViewById(R.id.btn_weightIncre);
        btn_weightIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.editText_weight);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue--;
                ed.setText(intValue+"");
            }
        });
        ////////////

        Button btn_lengthDecre = findViewById(R.id.btn_lengthDecre);
        btn_lengthDecre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.editText_lenght);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue++;
                ed.setText(intValue+"");
            }
        });

        Button btn_lengthIncre = findViewById(R.id.btn_lengthIncre);
        btn_lengthIncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.editText_lenght);
                String stringValue = ed.getText().toString();
                int intValue = Integer.parseInt(stringValue);
                intValue--;
                ed.setText(intValue+"");
            }
        });



    }
}