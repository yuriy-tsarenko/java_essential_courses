package com.java_essential.Class_4.Task_3;
/*Создайте класс DocumentWorker. В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт", "Редактирование документа доступно в версии Про",
"Сохранение документа доступно в версии Про". Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы,
при переопределении методов выводите следующие строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение
в остальных форматах доступно в версии Эксперт". Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp. Если пользователь не вводит ключ,
он может пользоваться только бесплатной версией (создается экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp,
то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.*/

public class ProDocumentWorker extends DocumentWorker {
    public static final String keyPro = "ProPro123";

    @Override
    void editDocument() {
        System.out.println("The document has been edited!");
    }

    @Override
    void saveDocument() {
        System.out.println("The document is saved in old format! If you wish to save in new one, please, use version Expert");
    }
}
