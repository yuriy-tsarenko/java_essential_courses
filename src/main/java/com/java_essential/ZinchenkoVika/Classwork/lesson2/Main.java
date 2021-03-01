package com.java_essential.ZinchenkoVika.Classwork.lesson2;

//- сколько студентов имеет возраст старше 25
//- сколько студентов не указали email
//- сколько студентов не указали username
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(11111, "Alex111", "", "0951111111", "Alex", "ALEX", 27);
        Student student2 = new Student(22222, "Elena222", "El@gmail.com", "0952222222", "Elena", "ELENA", 25);
        Student student3 = new Student(33333, "", "Mi@gmail.com", "0953333333", "Mike", "MIKE", 30);
        Student student4 = new Student(44444, "Sara444", "Sa@gmail.com", "0954444444", "Sara", "SARA", 21);
        Student[] array = new Student[]{student1, student2, student3, student4};
        int counterAge = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 25) {
                counterAge++;
            }
        }
        System.out.println("Quantity of students over 25: " + counterAge);
        int counterEmail = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getEmil().length() == 0) {
                counterEmail++;
            }
        }
        System.out.println("Quantity of students without email: " + counterEmail);
        int counterUsername = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getEmil().length() == 0) {
                counterUsername++;
            }
        }
        System.out.println("Quantity of students without username: " + counterUsername);
    }
}







