package com.java_essential.tsarenko.lesson7.enums.ex004_abstract_methods;


/**
 * Перечисляемые типы (enum).
 */

public class Main {
    public static void main(String[] args) {
        // Объект со ссылкой на экземпляр перечисляемого типа Company.
        Company myComp = Company.WEBCAMP;
        System.out.println(myComp);

        // Вызов методов.
        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("Я зарабатываю " + salary + " " + currency + " в месяц");
    }
}
