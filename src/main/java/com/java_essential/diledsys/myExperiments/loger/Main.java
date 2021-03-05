package com.java_essential.diledsys.myExperiments.loger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c = 0, a = 0, b = 0;
        Scanner reader = new Scanner(System.in);
        while (true) {
            try {
                a = reader.nextInt();
                b = reader.nextInt();
                c = a / b;
            } catch (ArithmeticException e) {
                SimpleLog.log("деление на ноль \n" + e);
                System.out.println("деление на ноль" + a + "/" + b);
                SimpleLog.log("деление на ноль \n" + e,"c:\\");
            } catch (InputMismatchException ie) {
                SimpleLog.log(String.valueOf(ie));
                break;
            }
            System.out.println(c);
        }
    }
}
