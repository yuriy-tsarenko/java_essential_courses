package com.java_essential.kopaiev.essential.homework.lesson4.task3;

import java.util.Scanner;

public class MenuWorker {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to iPlay 0.2");
        System.out.println("To begin choose action");
        System.out.println("1 --- Play");
        System.out.println("2 --- Pause");
        System.out.println("3 --- Stop");
        System.out.println("4 --- Exit");
        int userChoise = scanner.nextInt();
        Player player = new Player();

        while (userChoise != 4) {
            if (userChoise == 1) {
                player.play();
                userChoise = 0;
            } else if (userChoise == 2) {
                player.pause();
                userChoise = 0;
            } else if (userChoise == 3) {
                player.stop();
                userChoise = 0;
            } else if (userChoise == 0) {
                System.out.println("Choose an action 1,2,3 or 4 for exit...");
                userChoise = scanner.nextInt();
            }
        }
        System.out.println("Goodbye");
    }
}
