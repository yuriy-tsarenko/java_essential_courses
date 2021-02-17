package com.java_essential.diledsys.Classwork.Course;

public class Student {
    private String name;
    private String address;

    public Student(String name,String address) {
        this.address=address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
