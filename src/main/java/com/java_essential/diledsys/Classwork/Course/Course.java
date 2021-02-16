package com.java_essential.diledsys.Classwork.Course;


public class Course {
    private final String courseName;
    private final String description;
    private final Student[] student;
    private final long id;


    public Course(long id, String courseName, String description, Student[] student) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.student = student;
    }

    public Student[] getStudent() {
        return student;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

}
