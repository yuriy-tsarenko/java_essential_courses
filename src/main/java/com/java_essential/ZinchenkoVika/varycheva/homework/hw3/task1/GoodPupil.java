package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task1;

public class GoodPupil extends Pupil {

    private final int MAX_MARK = 80;
    private final int MIN_MARK = 70;

    public GoodPupil(String name, String gender, int age) {
        super(name, gender, age);
        super.averageRating = (int) (Math.random() * (MAX_MARK - MIN_MARK + 1) + MIN_MARK);
    }

    @Override
    public void study() {
        String message = super.toString() + "\nStudent grade for studying is " + averageRating * 0.4 +
                "\nStudent studies well";
        System.out.println(message);
    }

    @Override
    public void read() {
        String message = super.toString() + "\nStudent grade for reading is " + averageRating * 0.25 +
                "\nStudent reads well";
        System.out.println(message);
    }

    @Override
    public void write() {
        String message = super.toString() + "\nStudent grade for writing is " + averageRating * 0.25 +
                "\nStudent writes well";
        System.out.println(message);
    }

    @Override
    public void relax() {
        String message = super.toString() + "\nThe user relax index is " + averageRating * 0.10 +
                "\nStudent has little rest";
        System.out.println(message);
    }
}
