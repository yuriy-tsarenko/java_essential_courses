package com.java_essential.Cherednichenko.classwork.lesson_7;

public class Class implements Interface {
    private String correctAnswer;


    public Class() {
        System.out.println("What is a class?");
        this.correctAnswer = "C";
    }

    @Override
    public void printA() {
        System.out.println("A-This is a room");
    }

    @Override
    public void printB() {
        System.out.println("B-This is a word");
    }

    @Override
    public void printC() {
        System.out.println("C-Class is a blueprint for creating objects ");
    }

    @Override
    public void printD() {
        System.out.println("D-....");
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
