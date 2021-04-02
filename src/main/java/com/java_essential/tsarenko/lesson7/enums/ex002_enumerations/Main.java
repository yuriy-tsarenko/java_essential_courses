package com.java_essential.tsarenko.lesson7.enums.ex002_enumerations;

/**
 * Перечисляемые типы (enum).
 * Костанты перечисляемых типов по-умолчанию являются static final.
 */
enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        // Нельзя переопределить єкземпляр перечисляемого типа.
        //Day.MONDAY = Day.FRIDAY;

        Day today = Day.SATURDAY;
        switch (today) {
            case SATURDAY:
                System.out.println("First day of the weekend - Saturday.");
                break;
            case SUNDAY:
                System.out.println("The last day of the weekend - Sunday.");
                break;
            default:
                System.out.println("The weekday - " + today);
        }

        // Также, можно сравнивать экземпляры перечисляеміх типов, используя операцию ==
        if (today == Day.SATURDAY) {
            System.out.println("Finally, weekend!");
        }
    }
}
