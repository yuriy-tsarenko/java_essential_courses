package com.java_essential.Cherednichenko.homework.lesson_3;

public class Pupil {
    private String study;
    private String read;
    private String write;
    private String relax;

    public Pupil(String study, String read, String write, String relax) {
        this.study = study;
        this.read = read;
        this.write = write;
        this.relax = relax;
    }

    void study() {
        System.out.print("Study: " + study);
    }

    void read() {
        System.out.print(" Read: " + read);
    }

    void write() {
        System.out.print(" Write: " + write);
    }

    void relax() {
        System.out.println(" Relax: " + relax);
    }


}
