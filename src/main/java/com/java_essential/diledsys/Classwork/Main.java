package com.java_essential.diledsys.Classwork;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(100100);
        student1.setLastName("Grishin");
        student1.setName("Sergei");
        student1.setUsername("serg");
        student1.setAge(25);
        student1.setEmail("sergei@gmail.com");
        student1.setPhone("12389567");


        Student student2 = new Student();
        student2.setId(100101);
        student2.setLastName("Sakara");
        student2.setName("Valentin");
        //student2.setUsername("val");
        student2.setAge(25);
        student2.setEmail("val@gmail.com");

        //

        Student student3 = new Student();
        student3.setId(100102);
        student3.setLastName("Velosiea");
        student3.setName("Svetlana");
        student3.setUsername("sveta");
        student3.setAge(30);
        student3.setEmail("svet@gmail.com");

        //
        Student student4 = new Student();
        student4.setId(100103);
        student4.setLastName("Markova");
        student4.setName("Liliea");
        student4.setUsername("lilea");
        student4.setAge(35);
        student4.setEmail("lil@gmail.com");
        student4.setPhone("67876567857685");


        Student[] array = new Student[]{student1,student2,student3,student4};

int countAge25=0;
int countEmail=0;
int countUserName=0;
        for (Student studentas:array) {
            if (studentas.getAge() > 25) {
                countAge25++;
            }
            if (studentas.getEmail() == null) {
                countEmail++;
            }
            if (studentas.getUsername() == null) {
                countUserName++;
            }

        }
        System.out.println(" студентов имеет возраст старше 25:"+countAge25);
        System.out.println("студентов не указали email: "+countEmail);
        System.out.println("студентов не указали username"+countUserName);





    }

}
