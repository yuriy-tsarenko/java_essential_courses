package com.java_essential.diledsys.TestStudent;

public class TestStudent {

    public static void main(String[] args) {
        new Scan();
        new Base();
        System.out.println("минимум 5 вопросов (ответы должны быть в формате A, B, C, D выбор из предложенных вариантов");
        while (true) {
            if (Scan.input("начнем? d, n ").equals("n"))break;
            System.out.println("Ваш результат " + new Survey().task());
            System.out.println("----------------------------------------");
        }

    }
}
