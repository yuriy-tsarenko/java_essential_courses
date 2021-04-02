package com.java_essential.ZinchenkoVika.varycheva.homework.hw3.task1;

public class ExcellentPupil extends Pupil {

    private final int MAX_MARK = 100;
    private final int MIN_MARK = 81;

    public ExcellentPupil(String name, String gender, int age, int course, double averageRating) {
        super(name, gender, age, course, averageRating);
        super.averageRating = (int) (Math.random() * (MAX_MARK - MIN_MARK + 1) + MIN_MARK);
    }

    @Override
    public void study() {
        String message = super.toString() + "\nStudent grade for studying is " + averageRating * 0.4 +
                "\nStudent studies very well";
        System.out.println(message);
    }

    @Override
    public void read() {
        String message = super.toString() + "\nStudent grade for reading is " + averageRating * 0.25 +
                "\nStudent reads very well";
        System.out.println(message);
    }

    @Override
    public void write() {
        String message = super.toString() + "\nStudent grade for writing is " + averageRating * 0.25 +
                "\nStudent writes very well";
        System.out.println(message);
    }

    @Override
    public void relax() {
        String message = super.toString() + "\nThe user relax index is " + averageRating * 0.10 +
                "\nStudent has little rest";
        System.out.println(message);
    }
}
