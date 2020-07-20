package com.example.android.circuitronixsplash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registerActivity extends AppCompatActivity {
EditText mFullName,mEmail,mPassword,mPhone;
Button mRegisterbtn;
FirebaseAuth fAuth;
TextView mLogin;
ProgressBar mProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
     mFullName=findViewById(R.id.fullName);
     mEmail=findViewById(R.id.email);
     mPassword=findViewById(R.id.password);
     mPhone=findViewById(R.id.phone);
     mRegisterbtn=findViewById(R.id.register);
     mLogin=findViewById(R.id.loginview);
     mProgress=findViewById(R.id.progressBar);
     fAuth=FirebaseAuth.getInstance();

     if(fAuth.getCurrentUser()!=null)
     {
         startActivity(new Intent(getApplicationContext(), Main2Activity.class));
         finish();
     }
     mRegisterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mEmail.getText().toString().trim();
                String password=mPassword.getText().toString().trim();
                if(TextUtils.isEmpty(email))
                { mEmail.setError("Email is Required");
                 return;
                }
                if(TextUtils.isEmpty(password)) {
                    mPassword.setError("Password is Required");
                   return;
                }
                if(password.length()<7) {
                    mPassword.setError("Password must be greater than 6 characters");
                 return;
                }
                mProgress.setVisibility(View.VISIBLE);
             //REGISTER THE USER IN FIREBASE
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(registerActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                        }
                        else{
                            Toast.makeText(registerActivity.this, "Error !"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            mProgress.setVisibility(View.GONE);
                        }
                    }
                }); }
        });
     mLogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(getApplicationContext(),loginActivity.class));
         }
     });




    }

}
