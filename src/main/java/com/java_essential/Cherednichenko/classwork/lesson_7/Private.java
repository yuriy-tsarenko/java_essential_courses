package com.java_essential.Cherednichenko.classwork.lesson_7;

public class Private implements Interface {
    private String correctAnswer;

    public Private() {
        System.out.println("What is a class?");
        this.correctAnswer = "D";
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void printA() {
        System.out.println("A-...........");
    }

    @Override
    public void printB() {
        System.out.println("B-...........");
    }

    @Override
    public void printC() {
        System.out.println("C-...........");
    }

    @Override
    public void printD() {
        System.out.println("D-...........");
    }
}
