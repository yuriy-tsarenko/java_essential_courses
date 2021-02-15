package com.java_essential.diledsys.Classwork.Course;

public class Main {
    public static void main(String[] args) {


        String[] studentInsogram = new String[]{"Aleks", "Andreo", "Liliea", "Olga"};
        Course instogram = new Course(101, "школа инстограмера", "изучения инстогрмма", studentInsogram);
        String[] studentProgramm = new String[]{"Andreo", "Olga","Borias","oleg"};
        Course programm = new Course(102, "школа программиста", "изучения программирования", studentProgramm);

        Course[] array = new Course[]{instogram, programm};

        for (Course course : array){

            System.out.println(course.getId());
            System.out.println(course.getCourseName());
            System.out.println(course.getDescription());
            for (String nameStudent: course.getStudent()){
                System.out.println("Имя студента: "+nameStudent);
            }
        }

    }
}
