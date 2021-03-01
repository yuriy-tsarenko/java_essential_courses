package com.java_essential.Cherednichenko.homework.lesson_3;

public class GoodPupil extends Pupil {
    public GoodPupil(String study, String read, String write, String relax) {
        super(study, read, write, relax);
    }

    public GoodPupil(String study, String read, String write) {
        super(study, read, write, "unknown");
    }

    public GoodPupil(String study, String read) {
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
