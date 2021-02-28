package com.java_essential.Class_4.Task_3;
/* Создайте класс DocumentWorker. В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт", "Редактирование документа доступно в версии Про",
"Сохранение документа доступно в версии Про". Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы,
при переопределении методов выводите следующие строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение
в остальных форматах доступно в версии Эксперт". Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp. Если пользователь не вводит ключ,
он может пользоваться только бесплатной версией (создается экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp,
то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input key for using Pro or Expert version. If it is enough for you to use free version, press Enter.");
        String key = sc.nextLine();
        DocumentWorker newDocument;

        switch (key) {
            case (ProDocumentWorker.keyPro):
                newDocument = new ProDocumentWorker();
                break;
            case (ExpertDocumentWorker.keyExp):
                newDocument = new ExpertDocumentWorker();
                break;
            default:
                newDocument = new DocumentWorker();
                break;
        }

        newDocument.openDocument();
        newDocument.editDocument();
        newDocument.saveDocument();
    }
}
