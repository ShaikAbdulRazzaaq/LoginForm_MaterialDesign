package com.example.practice_login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String regNo = (String) intent.getSerializableExtra("RegNo");
        t = findViewById(R.id.name1);
        t.setText("Hello "+name+" Your Registration Number is "+regNo);
    }
}
