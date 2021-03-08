package com.java_essential.Cherednichenko.classwork.lesson_7;

public class Public implements Interface {
    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public Public() {
        System.out.println("What is a Public?");
        this.correctAnswer = "A";
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
