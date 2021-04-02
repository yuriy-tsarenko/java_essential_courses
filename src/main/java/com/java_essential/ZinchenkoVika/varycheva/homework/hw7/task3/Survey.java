package com.java_essential.ZinchenkoVika.varycheva.homework.hw7.task3;

import java.util.ArrayList;
import java.util.List;

public class Survey {

    List<Task> tasks = new ArrayList<>();
    static int MARK = 0;
    final int MAX_MARK = 100;
    private final int taskMark;

    public Survey(List<Task> tasks) {
        this.tasks.addAll(tasks);
        taskMark = MAX_MARK / tasks.size();
    }

    public void startSurvey() {
        for (Task t : tasks) {
            t.printTask();
            System.out.println("Ответ:");
            Labels choice = Labels.valueOf(ScannerWrapper.getString());
            if (t.getAnswerByLabel(choice).getId() == t.getQuestion().getCorrectAnswerId()) { // OR t.getAnswerByLabel(choice).isCorrect()
                MARK += taskMark;
            }
        }
        System.out.println("Оценка: " + MARK);
    }
}
