package com.java_essential.Class_10_Generics.Task_1;

public class MyClass {
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name is " + this.name + "; Age is " + this.age;
    }
}
