package com.java_essential.tsarenko.lesson3.ex011_final_class;

import java.time.LocalDateTime;

final class FinalClass {
    public int x;
    public int y;
}

// Попытка наследования от FinalClass приводит к ошибке компилятора.
class DerivedClass { //extends FinalClass {   // Error
}

public class Main {
    static void main() {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println("x = " + instance.x + "y = " + instance.y);
    }
}