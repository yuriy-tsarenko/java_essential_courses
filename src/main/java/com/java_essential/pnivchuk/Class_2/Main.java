package com.java_essential.pnivchuk.Class_2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Vasya");
        student1.setEmail("mail@gmail.com");
        student1.setAge(12);
        student1.setPhone("+38095845712");
        student1.setUserName("User Name 1");
        student1.setLastName("Last Name 1");

        Student student2 = new Student();
        student1.setId(2);
        student1.setName("Marichka");
        student1.setEmail("mail2@gmail.com");
        student1.setAge(26);
        student1.setPhone("+38095845712");
        student1.setUserName("User Name 2");
        student1.setLastName("Last Name 2");

        Student student3 = new Student();
        student1.setId(3);
        student1.setName("Valrntine");
        student1.setAge(20);
        student1.setPhone("+38095845712");
        student1.setUserName("User Name 3");
        student1.setLastName("Last Name 3");

        Student student4 = new Student();
        student1.setId(4);
        student1.setName("Vasya");
        student1.setEmail("mail@gmail.com");
        student1.setAge(25);
        student1.setPhone("+38095845712");
        student1.setLastName("Last Name 3");

        Student[] arrStud = new Student[]{student1, student2, student3, student4};
        int olderThan25 = 0;
        int emailNull = 0;
        int userNameNull = 0;

        for (Student st : arrStud) {
            if(st.getAge()>25){
                olderThan25++;
            }
            if(st.getEmail() == null){
                emailNull++;
            }
            if(st.getUserName() == null){
                userNameNull++;
            }
        }

        System.out.println("Number of students over 25 years old - " + olderThan25);
        System.out.println("Count of students who didn't specified email - " + emailNull);
        System.out.println("Count of students who didn't specified username - " + userNameNull);
    }
}
