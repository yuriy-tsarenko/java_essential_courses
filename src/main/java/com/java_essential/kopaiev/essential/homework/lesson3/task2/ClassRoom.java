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
