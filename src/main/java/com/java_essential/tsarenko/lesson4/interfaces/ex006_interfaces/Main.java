package com.java_essential.tsarenko.lesson4.interfaces.ex006_interfaces;

import java.time.LocalTime;

/**
 * Наследование абстрактных классов от интерфейсов.
 */
interface Interface {
    void someTask(int secondDuration);

    void execute();
}

abstract class AbstractClass implements Interface {
    @Override
    public void execute() {
        System.out.println("some work...");
    }
    // Реализация абстрактного метода из интерфейса, в абстрактном классе не обязательна.
    public abstract void someTask(int secondDuration);
}

class Competition extends AbstractClass {
    @Override
    public void someTask(int secondDuration) {
        int secondCurrent = LocalTime.now().getSecond();
        int endOfTask = secondCurrent + secondDuration;
        int count = 0;
        while (endOfTask > LocalTime.now().getSecond()) {
            execute();
            count++;
        }
        System.out.println("task executed, the total number of iterations is: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Interface instance = new Competition();
        instance.someTask(5);
    }
}
