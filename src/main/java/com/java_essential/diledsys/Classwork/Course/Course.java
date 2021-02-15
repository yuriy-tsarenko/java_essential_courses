package com.java_essential.diledsys.Classwork.Course;

public class Course {
   private long id;
   private String courseName;
   private String description;
   private String[] student;

    public Course(long id, String courseName, String description, String[] student) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.student = student;
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

    public String[] getStudent() {
        return student;
    }
}
