package com.java_essential.SinRoman.lesson_2;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setId(1);
        student.setUsername("gik");
        student.setEmail("abram@gmail.com");
        student.setName("Abram");
        student.setLastName("Maximovich");
        student.setAge(45);

        Student studentSecond = new Student();

        student.setId(2);
        student.setUsername("gik2");
        student.setEmail("abram1@gmail.com");
        student.setName("Abram1");
        student.setLastName("Maximovich1");
        student.setAge(13);

        Student studentThird = new Student();

        student.setId(3);
        student.setUsername("Ronin3");
        student.setEmail("abram3@gmail.com");
        student.setName("Abram3");
        student.setLastName("Maximovich3");
        student.setAge(23);

        Student studentFourth = new Student();

        student.setId(4);
        student.setUsername("Ronin4");
        student.setEmail("abram4@gmail.com");
        student.setName("Abram4");
        student.setLastName("Maximovich4");
        student.setAge(34);

        Student[] array = new Student[]{student, studentSecond, studentThird, studentFourth};

        int varAge = 0;
        int varEmail = 0;
        int varUserName = 0;

        if (student.getAge() > 25) {
            varAge++;
        }
        if (student.getEmail() == null) {
            varEmail++;
        }
        if (student.getUsername() == null) {
            varUserName++;
        }
        System.out.println("The age " + varAge);
        System.out.println("Student no show emil " + varEmail);
        System.out.println("Student no show username " + varUserName);

    }

}







