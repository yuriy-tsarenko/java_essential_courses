package com.java_essential.Class_4.Task_1;
/* Создать класс, представляющий учебный класс ClassRoom.Создайте класс ученик Pupil.
В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.*/

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("I don't study well at all))");
    }


    @Override
    void read() {
        System.out.println("I don't like reading!");
    }


    @Override
    void write() {
        System.out.println("I make many mistakes while writing!");
    }


    @Override
    void relax() {
        System.out.println("I'm enormously good at relaxing!");
    }


}
