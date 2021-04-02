package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task1;

public abstract class Pupil {

    protected String name;
    protected String gender;
    protected int age;
    protected int course;
    protected double averageRating;

    public Pupil(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Pupil(String name, String gender, int age, int course) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
    }

    public Pupil(String name, String gender, int age, int course, double averageRating) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.averageRating = averageRating;
    }

    abstract void study();

    abstract void read();

    abstract void write();

    abstract void relax();

    @Override
    public String toString() {
        return String.format("Name= %s; Gender= %s; Age= %s;", this.name , this.gender, this.age);
    }
}
