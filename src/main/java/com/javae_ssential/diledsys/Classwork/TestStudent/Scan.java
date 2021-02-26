package com.javae_ssential.diledsys.Classwork.TestStudent;

import java.util.Scanner;

public class Scan {
    private static Scanner scanner;
    {
         scanner = new Scanner(System.in);
    }
    public static String input(String coment){
        System.out.print(coment);
        return scanner.nextLine();
    }
}
