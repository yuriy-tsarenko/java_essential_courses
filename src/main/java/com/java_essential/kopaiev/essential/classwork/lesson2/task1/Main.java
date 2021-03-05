package com.java_essential.kopaiev.essential.classwork.lesson2.task1;

public class Main {

    public static void main(String[] args) {
        Student studentFirst = new Student();
        Student studentSecond = new Student();
        Student studentThird = new Student();
        Student studentFourth = new Student();

        // Set id's

        studentFirst.setId(1);
        studentSecond.setId(2);
        studentThird.setId(3);
        studentFourth.setId(4);

        // Set students age

        studentFirst.setAge(5);
        studentSecond.setAge(15);
        studentThird.setAge(26);
        studentFourth.setAge(32);

        // Set students username

        studentFirst.setUsername("Joker");
        studentSecond.setUsername("Killer");
        studentFourth.setUsername("Likian");

        // Set students emails

        studentFirst.setEmail("example@email.com");
        studentSecond.setEmail("example@email.com");

        // Set students phone
        studentFirst.setPhone("+38055645454");
        studentSecond.setPhone("+3805555555");
        studentThird.setPhone("+38072554525");
        studentFourth.setPhone("+38096525858");

        // Set students Name

        studentFirst.setName("John");
        studentSecond.setName("Killo");
        studentThird.setName("Mike");
        studentFourth.setName("Harold");

        // Set students Lastname
        studentFirst.setLastname("Piters");
        studentSecond.setLastname("Gat");
        studentThird.setLastname("Harvy");
        studentFourth.setLastname("Smith");


        Student[] array = new Student[]{studentFirst, studentSecond, studentThird, studentFourth};

        // find students
        /*
        - сколько студентов имеет возраст старше 25
        - сколько студентов не указали email
        - сколько студентов не указали username
        */

        int moreThanTwentyFiveCounter = 0;
        int withoutEmailCounter = 0;
        int withoutUserNameStudents = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 25) {
                moreThanTwentyFiveCounter++;
            }
            if (array[i].getEmail() == null) {
                withoutEmailCounter++;
            }
            if (array[i].getUsername() == null) {
                withoutUserNameStudents++;
            }
        }

        // Print results
        System.out.println("Amount of students which have age more than 25 is --- " + moreThanTwentyFiveCounter);
        System.out.println("Amount of students without email is --- " + withoutEmailCounter);
        System.out.println("Amount of students without username is --- " + withoutUserNameStudents);
    }
}
