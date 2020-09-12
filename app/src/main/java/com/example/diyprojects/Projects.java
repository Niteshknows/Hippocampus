package com.example.diyprojects;

import java.io.Serializable;

public class Projects implements Serializable {
    private String projName;
    private String MaterialsList;
    private String StepsList;
    private int Thumbnail;

    public Projects(String name, String materialsList, String stepsList, int thumbnail) {
        projName = name;
        MaterialsList = materialsList;
        StepsList = stepsList;
        Thumbnail = thumbnail;
    }

    public String getProjName() {
        return projName;
    }

    public String getMaterialsList() {
        return MaterialsList;
    }

    public String getStepsList() {
        return StepsList;
    }

    public int getThumbnail() {
        return Thumbnail;
    }






}
