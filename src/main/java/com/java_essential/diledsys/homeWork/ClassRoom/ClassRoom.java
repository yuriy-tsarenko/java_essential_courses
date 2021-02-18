package com.java_essential.diledsys.homeWork.ClassRoom;

public class ClassRoom {

    private Pupil pupil1;
    private Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        getPupil1();
        getPupil2();

    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;

        getPupil1();
        getPupil2();
        getPupil3();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;

        getPupil1();
        getPupil2();
        getPupil3();
        getPupil4();
    }

    public void getPupil1() {
        System.out.println( pupil1.getClass().getSimpleName() );
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();
    }

    public void getPupil2() {
        System.out.println( pupil2.getClass().getSimpleName() );
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
    }

    public void getPupil3() {
        System.out.println( pupil3.getClass().getSimpleName() );
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();
    }

    public void getPupil4() {
        System.out.println( pupil4.getClass().getSimpleName() );
        pupil4.study();
        pupil4.read();
        pupil4.write();
        pupil4.relax();
    }
}
