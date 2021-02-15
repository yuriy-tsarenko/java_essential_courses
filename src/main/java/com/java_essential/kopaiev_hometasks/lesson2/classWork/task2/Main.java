package com.java_essential.kopaiev_hometasks.lesson2.classWork.task2;


import com.java_essential.kopaiev_hometasks.lesson2.classWork.task1.Student;

public class Main {
    public static void main(String[] args) {

        Student studentJohn = new Student();
        Student studentBill = new Student();
        Student studentCarl = new Student();
        Student studentCarlo = new Student();
        Student studentJim = new Student();
        Student studentMarko = new Student();
        Student studentGecko = new Student();
        Student studentPolo = new Student();

        Course courseOne = new Course(1, "Automation", new Student[]{studentJohn, studentBill, studentCarl, studentCarlo});
        Course courseTwo = new Course(2, "Programmers", new Student[]{studentCarlo, studentJim, studentMarko, studentGecko, studentPolo});

        Course[] coursesArray = new Course[]{courseOne, courseTwo};

        //int amountOfPeopleInCourse = 0;

        for (int i = 0; i < coursesArray.length; i++) {
            System.out.println("Course Number " + coursesArray[i].getId() + " called " + coursesArray[i].getCourseName() + " and has " + coursesArray[i].getStudent().length + " students.");
        }


    }
}
