package com.java_essential.varycheva.essential.homework.hw7.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    private Question question;
    private List<Answer> answers = new ArrayList<>();

    public Task(Question question, Answer... answers) {
        this.question = question;
        this.answers.addAll(Arrays.asList(answers));
    }

    public class RandomLabel {

        private final List<Labels> labelsList = new ArrayList<>(Arrays.asList(Labels.values()));

        public Labels generateLabel() {
            Collections.shuffle(labelsList);
            return labelsList.remove(0);
        }
    }

    public Question getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return setLabels().stream().sorted().collect(Collectors.toList());
    }

    public void printTask() {
        System.out.println(question.toString());
        getAnswers().forEach(answer -> System.out.println(answer.toString()));
    }

    public Answer getAnswerByLabel(Labels label) {
        Answer result = null;
        for (Answer a : answers) {
            if (label.equals(a.getLabel())) {
                result = a;
                break;
            }
        }
        return result;
    }

    public List<Answer> setLabels() {
        Task.RandomLabel labels = new Task.RandomLabel();
        for (Answer a : this.answers) {
            a.setLabel(labels.generateLabel());
        }
        return this.answers;
    }
}
