package com.java_essential.kopaiev.essential.homework.lesson3.task2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("This man studies bad");
    }

    @Override
    void read() {
        System.out.println("This man reading bad");
    }

    @Override
    void write() {
        System.out.println("This man writing bad");
    }

    @Override
    void relax() {
        System.out.println("This man relaxing bad");
    }
}
