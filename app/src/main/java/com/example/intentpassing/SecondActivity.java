package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();
        String title = fromAct.getStringExtra("title");
        String studentName = fromAct.getStringExtra("StudentName");
        int rollNo = fromAct.getIntExtra("Roll no",0);

        TextView  textStudentInfo;

        textStudentInfo =  findViewById(R.id.textStudentInfo);

        textStudentInfo.setText("RollNo :"+rollNo+", Name: "+ studentName);

        getSupportActionBar().setTitle(title);


    }
}