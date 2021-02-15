package com.java_essential.diledsys.Classwork.Course;



public class Course {
   private long id;
   private String courseName;
   private String description;
   private Student[] student;

    public Student[] getStudent() {
        return student;
    }

    public Course(long id, String courseName, String description, Student[] student) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.student=student;
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
