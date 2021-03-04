package com.java_essential.Class_4.Task_1;
/* Создать класс, представляющий учебный класс ClassRoom.Создайте класс ученик Pupil.
В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.*/

import java.util.ArrayList;

public class ClassRoom {
    private String classOfPupil;
    private ArrayList<Pupil> list = new ArrayList<>();

    void showClass(){
        System.out.println(classOfPupil);
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            System.out.println("Student - " + (i+1));
            list.get(i).performance();
        }
        System.out.println("_________________________________");
    }


    ClassRoom(String classOfPupil, Pupil p1) {
        this.classOfPupil = classOfPupil;
        this.list.add(p1);

    }

    ClassRoom(String classOfPupil, Pupil p1, Pupil p2) {
        this(classOfPupil, p1);
        this.list.add(p2);
    }


    ClassRoom(String classOfPupil, Pupil p1, Pupil p2, Pupil p3) {
        this(classOfPupil, p1, p2);
        this.list.add(p3);
    }

    ClassRoom(String classOfPupil, Pupil p1, Pupil p2, Pupil p3, Pupil p4) {
        this(classOfPupil, p1, p2, p3);
        this.list.add(p4);
    }
}
