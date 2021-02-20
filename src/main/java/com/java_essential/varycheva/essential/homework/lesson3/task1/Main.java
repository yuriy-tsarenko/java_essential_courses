package com.java_essential.varycheva.essential.homework.lesson3.task1;

public class Main {

    public static void main(String[] args) {

        Pupil p1 = new ExcellentPupil("Andrey", "Male", 19, 2, 98);
        Pupil p2 = new GoodPupil("Lena", "Female", 19);
        Pupil p3 = new BadPupil("Olya", "Female", 19);
        ClassRoom classRoom = new ClassRoom(p1, p2, p3);
        classRoom.printInfoAboutStudents();
    }
}
