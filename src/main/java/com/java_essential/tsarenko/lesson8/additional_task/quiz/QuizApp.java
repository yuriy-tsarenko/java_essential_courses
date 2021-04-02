package com.java_essential.tsarenko.lesson8.additional_task.quiz;

import com.java_essential.tsarenko.lesson8.additional_task.quiz.service.MessageService;

public class QuizApp {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        messageService.execute();
    }
}
