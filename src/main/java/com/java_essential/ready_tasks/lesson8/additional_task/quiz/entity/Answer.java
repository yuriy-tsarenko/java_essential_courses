package com.java_essential.ready_tasks.lesson8.additional_task.quiz.entity;

public class Answer {
    private String answer;
    private boolean rightChoice;

    public Answer(String answer, Boolean rightChoice) {
        this.answer = answer;
        this.rightChoice = rightChoice;
    }

    public Answer() {
    }

    public boolean isRightChoice() {
        return rightChoice;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setRightChoice(boolean rightChoice) {
        this.rightChoice = rightChoice;
    }
}
