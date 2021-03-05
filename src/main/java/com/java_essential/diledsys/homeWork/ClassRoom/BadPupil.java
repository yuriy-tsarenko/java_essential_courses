package com.java_essential.diledsys.homeWork.ClassRoom;

public class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.println( "study bad");
    }

    @Override
    void read() {
        System.out.println("reads bad");
    }

    @Override
    void write() {
        System.out.println("writes badly");
    }

    @Override
    void relax() {
        System.out.println("resting great");
    }
}
