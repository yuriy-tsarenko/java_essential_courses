package com.java_essential.diledsys.homeWork.ClassRoom;

public class GoodPupil extends Pupil{

    @Override
    void study() {
        System.out.println("study very good ");
    }

    @Override
    void read() {
        System.out.println("read very good" );
    }

    @Override
    void write() {
        System.out.println("write very good");
    }

    @Override
    void relax() {
        System.out.println( "resting normally");
    }
}
