package com.java_essential.ready_tasks.lesson8.additional_task.quiz.util;

import com.java_essential.ready_tasks.lesson8.additional_task.quiz.entity.Answer;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.exception.AppException;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.entity.Message;

import java.util.List;
import java.util.Optional;

public final class ObjectBuilder {

    private ObjectBuilder() {
    }

    public static Answer buildAnswer(String answer, Boolean rightChoice) {
        return new Answer(answer, rightChoice);
    }

    public static Message buildMessage(String message, Answer firstVariant, Answer secondVariant, Answer thirdVariant, Answer fourthVariant) {
        return new Message(message, firstVariant, secondVariant, thirdVariant, fourthVariant);
    }

    public static Answer buildRightAnswerFromMessage(Message message) throws IllegalArgumentException, AppException {
        if (isNull(message)) {
            throw new AppException("no data to process");
        }
        List<Answer> answers = message.getAnswers();
        for (Answer answer : answers) {
            if (answer.isRightChoice()) {
                return answer;
            }
        }
        throw new IllegalArgumentException("source message haven't any right answer");

    }

    public static boolean compareAnswersByFlag(Answer source, Answer target) {
        return source.isRightChoice() == target.isRightChoice();
    }

    public static Answer buildUserAnswer(String userAnswer, Message message) throws IllegalArgumentException, AppException {
        if (isNull(message)) {
            throw new AppException("no data to process");
        }
        switch (userAnswer) {
            case "A":
                return message.getFirstVariant();
            case "B":
                return message.getSecondVariant();
            case "C":
                return message.getThirdVariant();
            case "D":
                return message.getFourthVariant();
            default:
                throw new IllegalArgumentException("unexpected user choice:" + userAnswer);
        }
    }

    public static boolean isNull(Object checkedObj) {
        return Optional.ofNullable(checkedObj).isEmpty();
    }
}
