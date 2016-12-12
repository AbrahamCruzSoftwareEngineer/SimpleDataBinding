package com.evolutiondso.www.databinding;

import android.databinding.BaseObservable;

/**
 * Created by Albrtx on 12/12/2016.
 */

public class Student extends BaseObservable {
    public String name;
    public final String grade;
    public final String picture;

    public Student(String name, String grade, String picture) {
        this.name = name;
        this.grade = grade;
        this.picture = picture;
    }

    public String getName() {
        return name;

    }

    public String getGrade() {
        return grade;
    }

    public String getPicture() {
        return picture;
    }

}
