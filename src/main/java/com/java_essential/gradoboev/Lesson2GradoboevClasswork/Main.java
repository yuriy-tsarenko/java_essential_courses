package com.java_essential.gradoboev.Lesson2GradoboevClasswork;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(10,"user1","user1@gmail.com","104513","Oleg","Ivanov",23);
        Student student2 = new Student(20,"user2","user2@gmail.com","104613","Olga","Petrova",25);
        Student student3 = new Student(30,"user3","user3@gmail.com","104713","Olha","Pushkin",24);
        Student student4 = new Student(40,"user4","user4@gmail.com","104813","Vladimir","Popova",26);


        Student[] array = new Student[]{student1,student2,student3,student4};
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge()> 25) {
                System.out.println("Student: " + array[i].getName() + "is older than 25");
            }
            if (array[i].getEmail() == null) {
                System.out.println("Student: " + array[i].getName() + "is don't have email");
            }
            if (array[i].getUsername() == null) {
                System.out.println("Student: " + array[i].getName() + "is not have username");
            }

        }


        }

        }






