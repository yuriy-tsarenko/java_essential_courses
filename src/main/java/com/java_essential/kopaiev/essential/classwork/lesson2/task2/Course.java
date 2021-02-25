package com.java_essential.kopaiev.essential.classwork.lesson2.task2;

import com.java_essential.kopaiev.essential.classwork.lesson2.task1.Student;

public class Course {

    private final long id;
    private final String courseName;
    private final Student[] student;

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public Student[] getStudent() {
        return student;
    }

    public Course(long id, String courseName, Student[] student) {
        this.id = id;
        this.courseName = courseName;
        this.student = student;
    }

}
