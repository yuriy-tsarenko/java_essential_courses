package com.java_essential.Cherednichenko.homework.lesson_3;

public class BadPupil extends Pupil {
    public BadPupil(String study, String read, String write, String relax) {
        super(study, read, write, relax);
    }

    public BadPupil(String study, String read, String write) {
        super(study, read, write, "unknown");
    }

    public BadPupil(String study, String read) {
        super(study, read, "unknown", "unknown");
    }

    @Override
    void study() {
        super.study();
    }

    @Override
    void read() {
        super.read();
    }

    @Override
    void write() {
        super.write();
    }

    @Override
    void relax() {
        super.relax();
    }
}
