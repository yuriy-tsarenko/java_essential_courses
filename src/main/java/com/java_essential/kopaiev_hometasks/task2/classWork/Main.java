package com.java_essential.kopaiev_hometasks.task2.classWork;

public class Main {

    public static void main(String[] args) {
        Student studentFirst = new Student();
        Student studentSecond = new Student();
        Student studentThird = new Student();
        Student studentFourth = new Student();

        studentFirst.setAge(5);
        studentSecond.setAge(15);
        studentThird.setAge(26);
        studentFourth.setAge(32);

        Student[] array = new Student[]{ studentFirst, studentSecond, studentThird, studentFourth};

        for (Student student : array) {
            if (student.getAge() >= 25) {
                System.out.println(student.getAge());
            }
        }
    }
}
