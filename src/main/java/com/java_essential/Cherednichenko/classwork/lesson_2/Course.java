package com.java_essential.Cherednichenko.classwork.lesson_2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final List<Student> students = new ArrayList<>();
    private String courseName;
    private String description;
    private long id;

    public Course() {
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

    public List<Student> getStudents() {
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
