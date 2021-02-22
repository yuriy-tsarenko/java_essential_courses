package com.java_essential.Cherednichenko.classwork.lesson_2;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;
    private String courseName;
    private String description;
    private long id;

    public Course() {
        this.students = new ArrayList<Student>();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setStudents(Student students) {
        this.students.add(students);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
