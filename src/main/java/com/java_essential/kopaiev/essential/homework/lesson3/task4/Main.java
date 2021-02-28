package com.java_essential.kopaiev.essential.homework.lesson3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String version = "basic";

        System.out.println("Hi, if you have key for PRO or Expert version, please type it here");
        String key = scanner.next();

        // Class with key DB
        KeysDB db = new KeysDB();

        if (db.isKeyExpertExisted(key)) {
            version = "expert";
        }
        if (db.isKeyProExisted(key)) {
            version = "pro";
        }

        // Menu for actions with document
        MenuWorker menu = new MenuWorker(version);
    }
}
