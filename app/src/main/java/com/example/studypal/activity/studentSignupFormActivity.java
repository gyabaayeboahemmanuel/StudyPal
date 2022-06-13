package com.example.studypal.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studypal.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class studentSignupFormActivity extends AppCompatActivity {
    EditText sFirstname, sLastName, sEmail, sPhoneNumber, sSchoolName, sPassword, sConfirmpassword;
    private TextView loginLink;
    DatabaseReference reff;
    Student student;
    private ConstraintLayout register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup_form);


        loginLink = findViewById(R.id.loginlink);
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(studentSignupFormActivity.this, loginActivity.class));
            }
        });
        register = findViewById(R.id.studentRegisterBtn);
        sFirstname =(EditText) findViewById(R.id.studentFirstNametxt);
        sLastName = (EditText) findViewById(R.id.studentLastNametxt);
        sEmail =(EditText) findViewById(R.id.studentLastNametxt);
        sPhoneNumber=(EditText) findViewById(R.id.studentLastNametxt);
        sSchoolName=(EditText) findViewById(R.id.studentLastNametxt);
        sPassword=(EditText) findViewById(R.id.studentLastNametxt);
        sConfirmpassword=(EditText) findViewById(R.id.studentLastNametxt);
        student = new Student();
        reff = FirebaseDatabase.getInstance().getReference().child("Student");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student.setFirstName(sFirstname.getText().toString().trim());
                student.setLastName(sLastName.getText().toString().trim());
                student.setEmail(sEmail.getText().toString().trim());
                student.setPhoneNumber(sPhoneNumber.getText().toString().trim());
                student.setSchoolName(sSchoolName.getText().toString().trim());
                student.setPassword(sPassword.getText().toString().trim());
              //  student.set(sFirstname.getText().toString().trim());
                reff.child(sFirstname.getText().toString().trim()+ " " + sLastName.getText().toString().trim()).setValue(student);
                Toast.makeText(studentSignupFormActivity.this, "Data inserted sucessfully", Toast.LENGTH_LONG).show();
            }
        });
//    Toast.makeText(studentSignupForm.this, "Fibase Connection Success", Toast.LENGTH_LONG).show();
//        loginLink = findViewById(R.id.newstudentlogin);
//
//        loginLink.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                startActivity(new Intent(studentSignupFormActivity.this,
//                        loginActivity.class));
//            }
//        });
   }
}