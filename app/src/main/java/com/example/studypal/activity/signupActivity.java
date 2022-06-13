package com.example.studypal.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.studypal.R;

public class signupActivity extends AppCompatActivity {
    private ConstraintLayout studentBtn, teacherBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        studentBtn = findViewById(R.id.studentbtn);
        teacherBtn = findViewById(R.id.teacherbtn);

        studentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signupActivity.this, studentSignupFormActivity.class));
            }
        });

       teacherBtn.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(signupActivity.this, teacherSignupFormActivity.class));
           }
       }));
    }



}