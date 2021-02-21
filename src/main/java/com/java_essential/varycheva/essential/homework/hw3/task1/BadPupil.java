package com.java_essential.varycheva.essential.homework.hw3.task1;

public class BadPupil extends Pupil {
    private final int MAX_MARK = 69;
    private final int MIN_MARK = 20;

    public BadPupil(String name, String gender, int age) {
        super(name, gender, age);
        super.averageRating = (int) (Math.random() * (MAX_MARK - MIN_MARK + 1) + MIN_MARK);
    }

    @Override
    public void study() {
        String message = super.toString() + "\nStudent grade for studying is " + averageRating * 0.20 +
                "\nStudent studies bad";
        System.out.println(message);
    }

    @Override
    public void read() {
        String message = super.toString() + "\nStudent grade for reading is " + averageRating * 0.15 +
                "\nStudent reads bad";
        System.out.println(message);
    }

    @Override
    public void write() {
        String message = super.toString() + "\nStudent grade for writing is " + averageRating * 0.15 +
                "\nStudent writes bad";
        System.out.println(message);
    }

    @Override
    public void relax() {
        String message = super.toString() + "\nThe user relax index is " + averageRating * 0.50 +
                "\nStudent rests a lot";
        System.out.println(message);
    }
}
