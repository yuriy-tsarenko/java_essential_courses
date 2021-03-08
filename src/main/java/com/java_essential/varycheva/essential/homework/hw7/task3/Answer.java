package com.java_essential.varycheva.essential.homework.hw7.task3;

public class Answer implements Comparable<Answer> {

    private int id;
    private int questionId;
    private String answerDesc;
    private boolean isCorrect;
    private Labels label;

    public Answer(int id, int questionId, String answerDesc, boolean isCorrect) {
        this.id = id;
        this.questionId = questionId;
        this.answerDesc = answerDesc;
        this.isCorrect = isCorrect;
    }

    public int getId() {
        return id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getAnswerDesc() {
        return answerDesc;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public Labels getLabel() {
        return label;
    }

    public void setLabel(Labels label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label + ") " + answerDesc + ";";
    }

    @Override
    public int compareTo(Answer another) {
        return this.getLabel().compareTo(another.getLabel());
    }
}
