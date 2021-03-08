package com.java_essential.varycheva.essential.homework.hw7.task3;

import java.util.Scanner;

public class ScannerWrapper {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getString() {
        return SCANNER.next();
    }

    public static boolean isString(){
        return  SCANNER.hasNext();
    }
}
