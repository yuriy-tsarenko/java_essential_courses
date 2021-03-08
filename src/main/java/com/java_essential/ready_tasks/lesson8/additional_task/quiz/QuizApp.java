package com.java_essential.ready_tasks.lesson8.additional_task.quiz;

import com.java_essential.ready_tasks.lesson8.additional_task.quiz.service.MessageService;

public class QuizApp {
    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        messageService.execute();
    }
}
