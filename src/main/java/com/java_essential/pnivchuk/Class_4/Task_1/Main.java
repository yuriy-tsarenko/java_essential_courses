package com.java_essential.pnivchuk.Class_4.Task_1;
/* Создать класс, представляющий учебный класс ClassRoom.Создайте класс ученик Pupil.
В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.*/

public class Main {
    public static void main(String[] args) {
        Pupil p1 = new BadPupil();
        Pupil p2 = new GoodPupil();
        Pupil p3 = new ExcellentPupil();
        Pupil p4 = new BadPupil();

        ClassRoom cr1 = new ClassRoom("Class1", p1);
        ClassRoom cr2 = new ClassRoom("Class2", p1, p2);
        ClassRoom cr3 = new ClassRoom("Class3", p1, p2, p3);
        ClassRoom cr4 = new ClassRoom("Class4", p1, p2, p3, p4);

        cr1.showClass();
        cr2.showClass();
        cr3.showClass();
        cr4.showClass();
    }
}
