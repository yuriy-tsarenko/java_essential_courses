package com.java_essential.ZinchenkoVika.varycheva.homework.hw7.task3;

/*
Создать небольшое приложения для тестирования студентов по Java
- ООП
- минимум 5 вопросов (ответы должны быть в формате A, B, C, D выбор из предложенных вариантов)
Например:
что такое Класс
модификатор private
модификатор public
модификатор protected
модификатор default
- в конце тестирования выводить средний бал студента
 */
public class Main {
    public static void main(String[] args) {
        TasksCreator tasksCreator = new TasksCreator();
        Survey s = new Survey(tasksCreator.getTasks());
        s.startSurvey();
    }
}
