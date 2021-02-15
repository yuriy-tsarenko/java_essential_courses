package com.java_essential.diledsys.Classwork.Course;

public class Main {
    public static void main(String[] args) {

        Student andreo = new Student("Andreo","Stroitelei 15");
        Student olga   = new Student("Olga","Kotovskogo 117");
        Student borias = new Student("Borias","Sportanskaea 2");
        Student liliea = new Student("Liliea","Soltikova 5");
        Student sveta  = new Student("Sveta","Promishlennaea 8");
        Student aleks  = new Student("Aleks","Zavodskaea 77");
        Student oleg   = new Student("Oleg","Umanskaea 12");

            Student[] inst = new Student[]{andreo,oleg,liliea,aleks};


        Course instogram = new Course(101, "школа инстограмера", "изучения инстогрмма",inst);

        Student[] prog = new Student[]{sveta,andreo,oleg,liliea,aleks};
        Course programm = new Course(102, "школа программиста", "изучения программирования", prog);

        Course[] array = new Course[]{instogram, programm};

        for (Course course : array){

            System.out.println("id школы: "+course.getId());
            System.out.println("название курса: "+course.getCourseName());
            System.out.println("описание: "+course.getDescription());
            for (Student data: course.getStudent()){
                System.out.println("Имя студента: "+data.getName());
                System.out.println("Адрес студента: "+data.getAddress());
            }
            System.out.println("---------------------------------------");
        }

    }
}
