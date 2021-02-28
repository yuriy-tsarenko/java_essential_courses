package com.java_essential.kopaiev.essential.homework.lesson3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
     Задание 4
     Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс DocumentWorker. В теле класса создайте три
     метода openDocument(), editDocument(), saveDocument(). В тело каждого из методов добавьте вывод на экран
     соответствующих строк: "Документ открыт", "Редактирование документа доступно в версии Про", "Сохранение документа
     доступно в версии Про".
     Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы, при переопределении методов
     выводите следующие строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных
     форматах доступно в версии Эксперт".
     Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker. Переопределите
     соответствующий метод. При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
     В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp. Если
     пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается экземпляр базового класса),
     если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр соответствующей версии класса,
     приведенный к базовому – DocumentWorker.
        */

        Scanner scanner = new Scanner(System.in);
        String version = "basic";

        System.out.println("Hi, if you have key for PRO or Expert version, please type it here");
        String key = scanner.next();

        // Class with key DB
        KeysDB db = new KeysDB();

        if (db.isKeyExpertExisted(key)) {
            version = "expert";
        }
        if (db.isKeyProExisted(key)) {
            version = "pro";
        }

        // Menu for actions with document
        MenuWorker menu = new MenuWorker(version);
    }
}
