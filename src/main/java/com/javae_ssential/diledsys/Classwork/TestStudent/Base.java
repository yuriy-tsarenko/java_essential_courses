package com.javae_ssential.diledsys.Classwork.TestStudent;

import java.util.Properties;
//что такое Класс
//модификатор private
//модификатор public
//модификатор protected
//модификатор default
public class Base {
    public static Properties qusting;
    public static Properties answer;
    public static Properties num;

    {
         num = new Properties();
         qusting = new Properties();
         answer = new Properties();
        num.put(1,"A");
        num.put(2,"B");
        num.put(3,"C");
        num.put(4,"D");
        qusting.put(1, "что такое Класс");
        qusting.put(2, "что такое модификатор private");
        qusting.put(3, "что такое модификатор public");
        qusting.put(4, "что такое модификатор protected");
        qusting.put(5, "что такое модификатор default");

        answer.put(1,"в объектно-ориентированном программировании, представляет собой шаблон для создания объектов");
        answer.put(2,"Модификатор private делает поля и методы доступными только для методов внутри данного класса и не доступными из вне.");
        answer.put(3,"Члены, методы и классы, которые объявлены как public, могут быть доступны из любого места.");
        answer.put(4,"Элемент данных и метод protected доступны только классам одного и того же пакета и подклассам, присутствующим в любом пакете.");
        answer.put(5,"Default (по умолчанию)- это способ доступа к классам, переменным и методам, если иной другой модификатор доступа не указан.");
        answer.put(6,"это набор связанных классов и интерфейсов, которые связаны вместе");
        answer.put(7,"Это программа, которая помогает преобразовывать байт-код в инструкции, которые отправляются непосредственно процессору.");
        answer.put(8,"это специальные ключевые слова, которые используются для ограничения доступа класса, конструктора, элемента данных и метода в другом классе.");
        answer.put(9,"это реальный объект, у которого есть состояние и поведение. У объекта есть три характеристики");
        answer.put(10,"это последовательность инструкций, которая повторяется бесконечно, когда функциональный выход не выполняется.");
        answer.put(11,"это процесс вызова одного конструктора из другого по отношению к текущему объекту.");
        answer.put(12,"это интерфейс пакета Util, который сопоставляет уникальные ключи со значениями. ");
    }
}
