package com.java_essential.ready_tasks.lesson8.homework.task;

public class Worker {
    // Поля класа Worker
    String fio;
    String post;
    String year;

    // Конструктор с параметрами
    public Worker(String fio, String post, String year) {
        this.fio = fio;
        this.post = post;
        this.year = year;
    }

    // Перегрузка метода toString()
    @Override
    public String toString() {
        return "ФИО = " + this.fio + "Должность = " + this.post + " Год = " + this.year;
    }
}
