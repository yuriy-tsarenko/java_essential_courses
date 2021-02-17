package com.java_essential.Cherednichenko.classwork.lesson_2;

public class Course {
    private Student[] students;
    private String courseName;
    private String description;
    private long id;

    public Course(Student[] students, String courseName, String description, long id, int countStudent) {
        this.students = students;
        this.courseName = courseName;
        this.description = description;
        this.id = id;
    }

    public Course() {
        this.students = new Student[4];
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setStudents(Student students, int i) {

        this.students[i] = students;
    }

    public Student[] getStudents() {
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
