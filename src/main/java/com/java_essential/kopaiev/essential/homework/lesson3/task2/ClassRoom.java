package com.java_essential.kopaiev.essential.homework.lesson3.task2;

public class ClassRoom {
    Pupil pupilFirst;
    Pupil pupilSecond;
    Pupil pupilThird;
    Pupil pupilFourth;
    Pupil[] peoples;

    public ClassRoom(Pupil pupilFirst, Pupil pupilSecond, Pupil pupilThird, Pupil pupilFourth) {
        this.pupilFirst = pupilFirst;
        this.pupilSecond = pupilSecond;
        this.pupilThird = pupilThird;
        this.pupilFourth = pupilFourth;
        peoples = new Pupil[]{pupilFirst, pupilSecond, pupilThird, pupilFourth};
    }

    public ClassRoom(Pupil pupilFirst, Pupil pupilSecond, Pupil pupilThird) {
        this.pupilFirst = pupilFirst;
        this.pupilSecond = pupilSecond;
        this.pupilThird = pupilThird;
        peoples = new Pupil[]{pupilFirst, pupilSecond, pupilThird};
    }

    public ClassRoom(Pupil pupilFirst, Pupil pupilSecond) {
        this.pupilFirst = pupilFirst;
        this.pupilSecond = pupilSecond;
        peoples = new Pupil[]{pupilFirst, pupilSecond};
    }


    public static void main(String[] args) {

        /*
     * Задание 2
  Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс, представляющий учебный класс ClassRoom.
* Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
* Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите
* каждый из методов, в зависимости от успеваемости ученика. Конструктор класса ClassRoom принимает аргументы типа Pupil,
* класс должен состоять из 4 учеников. Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента
* Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.
        */

        ClassRoom classRoomFirst = new ClassRoom(new BadPupil(), new GoodPupil(), new BadPupil(), new ExcellentPupil());
        classRoomFirst.showPeoples();
    }

    public void showPeoples() {
        for (Pupil people : peoples) {
            people.study();
            people.write();
            people.read();
            people.relax();
            System.out.print("\n");
        }
    }
}
