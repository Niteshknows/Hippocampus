package com.example.diyprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProjectActivity extends AppCompatActivity {
private TextView mProjName;
private TextView mMaterials;
private TextView mMethodTitle;
private TextView mSteps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        mProjName = findViewById(R.id.text_project);
        mMethodTitle=findViewById(R.id.text_method);
        mMaterials=findViewById(R.id.materials);
        mSteps=findViewById(R.id.steps);

        Intent intent=getIntent();
        Projects projects = (Projects) intent.getSerializableExtra("projects");


        mProjName.setText(projects.getProjName());
        mMaterials.setText(projects.getMaterialsList());
        mSteps.setText(projects.getStepsList());




    }
}