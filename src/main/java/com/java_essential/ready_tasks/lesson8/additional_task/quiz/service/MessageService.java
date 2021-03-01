package com.java_essential.ready_tasks.lesson8.additional_task.quiz.service;

import com.java_essential.ready_tasks.lesson8.additional_task.quiz.entity.Answer;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.exception.AppException;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.repository.MessageRepository;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.entity.Message;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.util.ObjectBuilder;
import com.java_essential.ready_tasks.lesson8.additional_task.quiz.util.ResultMaker;

import java.util.List;
import java.util.Scanner;

import static com.java_essential.ready_tasks.lesson8.additional_task.quiz.util.StaticMessages.*;

public class MessageService {

    public void execute() {
        String userChoice = DEFAULT;
        while (!userChoice.equals(EXIT)) {
            System.out.println(WELCOME_MESSAGE);
            List<Message> messages = MessageRepository.createMessages();
            try {
                Scanner scanner = new Scanner(System.in);
                for (Message message : messages) {
                    System.out.println(message.toString());
                    System.out.println(INITIAL_MESSAGE);
                    String userAnswer = scanner.nextLine();
                    Answer target = ObjectBuilder.buildUserAnswer(userAnswer, message);
                    Answer source = ObjectBuilder.buildRightAnswerFromMessage(message);
                    ResultMaker.refreshStatistic(ObjectBuilder.compareAnswersByFlag(source, target));
                }
                System.out.println(END_MESSAGE);
                ResultMaker.makeResult();
                userChoice = scanner.next();
                ResultMaker.resetStatistic();
            } catch (IllegalArgumentException | AppException e) {
                e.printStackTrace();
            }
        }
    }
}
