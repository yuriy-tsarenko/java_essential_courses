package com.java_essential.varycheva.essential.homework.hw7.task3;

import java.util.ArrayList;
import java.util.List;

public class TasksCreator {
    private List<Task> tasks = new ArrayList<>();

    public TasksCreator() {
        Question q1 = new Question("Что такое Класс?", 1);
        Answer a11 = new Answer(1, q1.getId(), "Прототип, с которого создается объект. Класс является основой для приложения", true);
        Answer a12 = new Answer(2, q1.getId(), "Специальный блок инструкций, вызываемый при создании объекта", false);
        Answer a13 = new Answer(3, q1.getId(), "Используется для получения значения из переменной", false);
        Answer a14 = new Answer(4, q1.getId(), "Это экземпляр объекта", false);

        Question q2 = new Question("Что такое Конструктор?", 2);
        Answer a21 = new Answer(1, q2.getId(), "Механизм языка, позволяющий описать новый класс на основе уже существующего", false);
        Answer a22 = new Answer(2, q2.getId(), "Специальный блок инструкций, вызываемый при создании объекта", true);
        Answer a23 = new Answer(3,q2.getId(), "Используется для скрытия значения или состояния объекта внутри класса", false);
        Answer a24 = new Answer(4, q2.getId(), "Это локальный класс без имени", false);


        Question q3 = new Question("Что такое Наследование?", 4);
        Answer a31 = new Answer(1, q3.getId(), "Механизм группирования классов, которые связаны друг с другом по каким-то характеристикам", false);
        Answer a32 = new Answer(2, q3.getId(), "Создание экземпляра класса", false);
        Answer a33 = new Answer(3,q3.getId(), "Используется для скрытия значения или состояния объекта внутри класса", false);
        Answer a34 = new Answer(4, q3.getId(), "Механизм языка, позволяющий описать новый класс на основе уже существующего (родительского, базового) класса или интерфейса", true);


        Question q4 = new Question("Что такое Полиморфизм?", 3);
        Answer a41 = new Answer(1, q4.getId(), "Это ключевое слово, задающее объявленную доступность члена или типа", false);
        Answer a42 = new Answer(2, q4.getId(), "Механизм группирования классов, которые связаны друг с другом по каким-то характеристикам", false);
        Answer a43 = new Answer(3,q4.getId(), "Возможность объектов с одинаковой спецификацией иметь различную реализацию", true);
        Answer a44 = new Answer(4, q4.getId(), "Механизм языка, позволяющий описать новый класс на основе уже существующего (родительского, базового) класса или интерфейса", false);
        Task t1 = new Task(q1, a11, a12, a13, a14);
        Task t2 = new Task(q2, a21, a22, a23, a24);
        Task t3 = new Task(q3, a31, a32, a33, a34);
        Task t4 = new Task(q4, a41, a42, a43, a44);
        this.tasks.add(t1);
        this.tasks.add(t2);
        this.tasks.add(t3);
        this.tasks.add(t4);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
