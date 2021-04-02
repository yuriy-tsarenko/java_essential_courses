package com.java_essential.tsarenko.lesson8.additional_task.quiz.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class ResultMaker {
    private final static int MARK_PER_ONE_ANSWER = 5;
    private static int maxAvailableMark;
    private static int numberOfQuestions;
    private static int numberOfRightAnswers;
    private static int numberOfWrongAnswers;
    private static int totalMark;
    private static BigDecimal averageMark;

    private ResultMaker() {

    }

    public static void refreshStatistic(boolean isRightAnswer) {
        if (isRightAnswer) {
            numberOfRightAnswers++;
        } else {
            numberOfWrongAnswers++;
        }
        numberOfQuestions++;
        totalMark = numberOfRightAnswers * MARK_PER_ONE_ANSWER;
        maxAvailableMark = numberOfQuestions * MARK_PER_ONE_ANSWER;
        BigDecimal totalMarkDec = BigDecimal.valueOf(totalMark);
        BigDecimal numberOfQuestionsDec = BigDecimal.valueOf(numberOfQuestions);
        averageMark = totalMarkDec.divide(numberOfQuestionsDec, 2, RoundingMode.CEILING);
    }

    public static void makeResult() {
        System.out.println(ResultMaker.status());
    }

    private static String status() {
        return String.format(
                "Статистика:\nоценка - %d из %d\nправильных ответов - %d, неправильных -  %d\nсредний бал - %s",
                totalMark, maxAvailableMark, numberOfRightAnswers, numberOfWrongAnswers, averageMark);
    }

    public static void resetStatistic() {
        maxAvailableMark = 0;
        numberOfQuestions = 0;
        numberOfRightAnswers = 0;
        numberOfWrongAnswers = 0;
        totalMark = 0;
        averageMark = null;
    }
}
