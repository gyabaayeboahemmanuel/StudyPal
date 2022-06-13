package com.example.studypal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.studypal.R;

public class teacherSignupFormActivity extends AppCompatActivity {
    private TextView loginLink;
    EditText tFirstName, tLastName,tEmail,tPhoneNumber,tSchoolName,tSubjectArea,tPassword,tConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_signup_form);

        tFirstName =(EditText) findViewById(R.id.firstNametxt);
        tLastName= (EditText) findViewById(R.id.lastNametxt);
        tEmail =(EditText) findViewById(R.id.emailtxt);
        tPhoneNumber=(EditText) findViewById(R.id.phoneNumbertxt);
        tSchoolName=(EditText) findViewById(R.id.schoolNametxt);
        tSubjectArea=(EditText) findViewById(R.id.subjectAreatxt);
        tPassword=(EditText) findViewById(R.id.passwordtxt);
        tConfirmPassword=(EditText) findViewById(R.id.confirmPasswordtxt);

        loginLink = findViewById(R.id.tlogin);
        loginLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(teacherSignupFormActivity.this,
                        loginActivity.class));
            }







        });
    }
}


