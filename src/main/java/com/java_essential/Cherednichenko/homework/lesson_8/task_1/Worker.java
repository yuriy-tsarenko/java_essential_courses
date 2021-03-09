package com.java_essential.Cherednichenko.homework.lesson_8.task_1;

public class Worker {
    private String fullName;
    private String nameOfPosition;
    private int year;

    public Worker(String fullName, String nameOfPosition, int year) {
        this.fullName = fullName;
        this.nameOfPosition = nameOfPosition;
        this.year = year;
    }

    public String getFullName() {
        return fullName;
    }
}
