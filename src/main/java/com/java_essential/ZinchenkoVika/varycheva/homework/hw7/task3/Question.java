package com.java_essential.ZinchenkoVika.varycheva.homework.hw7.task3;

public class Question {

    private static int ID = 0;
    private  int id;
    private String questionDescription;
    private int correctAnswerId;

    public Question(String questionDescription, int correctAnswerId) {
        this.id = ID += 1;
        this.questionDescription = questionDescription;
        this.correctAnswerId = correctAnswerId;
    }

    public int getId() {
        return id;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public int getCorrectAnswerId() {
        return correctAnswerId;
    }

    @Override
    public String toString() {
        return id + "." + " " + questionDescription  + ':';
    }
}
