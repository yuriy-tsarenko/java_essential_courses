package com.java_essential.tsarenko.lesson1.ex_011_packages06_import_static;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Main {
    public static void main(String[] args) {

        // сделали статический импорт, что позволило нам оптимизировать код

        double number = 1;
        double result = cos(PI * number);
    }
}
