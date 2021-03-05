package com.java_essential.ready_tasks.lesson8.additional_task.quiz.repository;

import com.java_essential.ready_tasks.lesson8.additional_task.quiz.entity.Message;

import java.util.List;

import static com.java_essential.ready_tasks.lesson8.additional_task.quiz.util.ObjectBuilder.buildAnswer;
import static com.java_essential.ready_tasks.lesson8.additional_task.quiz.util.ObjectBuilder.buildMessage;


public class MessageRepository {
    public static List<Message> createMessages() {
        return List.of(
                buildMessage(
                        "что такое Объект с точки зрения програмирования?",
                        buildAnswer("Именнованная модель реальной сущности, обладающая конкретными значениями " + "свойств и проявляющая свое поведение", true),
                        buildAnswer("Философская категория, обозначающая вещь, явление или процесс", false),
                        buildAnswer("Это нечто может существовать как в реальной действительности, так и в вымышленном мире", false),
                        buildAnswer("То, что существует вне нас и независимо от нашего сознания, внешний мир, материальная действительность.", false)),
                buildMessage(
                        "public модификатор",
                        buildAnswer("уровень доступа частного модификатора только внутри класса.", false),
                        buildAnswer("уровень доступа модификатора по умолчанию только внутри пакета.", false),
                        buildAnswer("уровень доступа защищенного модификатора находится внутри пакета и вне пакета через дочерний класс.", false),
                        buildAnswer("уровень доступа публичного модификатора везде", true)
                ),
                buildMessage(
                        "protected модификатор",
                        buildAnswer("уровень доступа частного модификатора только внутри класса.", false),
                        buildAnswer("уровень доступа модификатора по умолчанию только внутри пакета.", false),
                        buildAnswer("уровень доступа защищенного модификатора находится внутри пакета и вне пакета через дочерний класс.", true),
                        buildAnswer("уровень доступа публичного модификатора везде", false)
                ),
                buildMessage(
                        "private модификатор",
                        buildAnswer("уровень доступа частного модификатора только внутри класса.",true),
                        buildAnswer("уровень доступа модификатора по умолчанию только внутри пакета.",false),
                        buildAnswer("уровень доступа защищенного модификатора находится внутри пакета и вне пакета через дочерний класс.",false),
                        buildAnswer("уровень доступа публичного модификатора везде",false)
                ),
                buildMessage(
                        "default модификатор",
                        buildAnswer("уровень доступа частного модификатора только внутри класса.",false),
                        buildAnswer("уровень доступа модификатора по умолчанию только внутри пакета.",true),
                        buildAnswer("уровень доступа защищенного модификатора находится внутри пакета и вне пакета через дочерний класс.",false),
                        buildAnswer("уровень доступа публичного модификатора везде",false)
                )
        );
    }
}
