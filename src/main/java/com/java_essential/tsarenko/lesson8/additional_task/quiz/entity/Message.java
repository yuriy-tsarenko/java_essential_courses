package com.java_essential.tsarenko.lesson8.additional_task.quiz.entity;

import java.util.List;

public class Message {
    private String message;
    private Answer firstVariant;
    private Answer secondVariant;
    private Answer thirdVariant;
    private Answer fourthVariant;

    public Message(String message, Answer firstVariant, Answer secondVariant, Answer thirdVariant, Answer fourthVariant) {
        this.message = message;
        this.firstVariant = firstVariant;
        this.secondVariant = secondVariant;
        this.thirdVariant = thirdVariant;
        this.fourthVariant = fourthVariant;
    }

    public Message() {
    }

    @Override
    public String toString() {
        return String.format("Вопрос: %s \nвариант A: %s \n" +
                        "вариант B: %s \nвариант C: %s \nвариант D: %s\n",
                message,
                firstVariant.getAnswer(),
                secondVariant.getAnswer(),
                thirdVariant.getAnswer(),
                fourthVariant.getAnswer());
    }

    public String getMessage() {
        return message;
    }

    public Answer getFirstVariant() {
        return firstVariant;
    }

    public Answer getSecondVariant() {
        return secondVariant;
    }

    public Answer getThirdVariant() {
        return thirdVariant;
    }

    public Answer getFourthVariant() {
        return fourthVariant;
    }

    public List<Answer> getAnswers() {
        return List.of(firstVariant, secondVariant, thirdVariant, fourthVariant);
    }

}
