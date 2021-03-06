package com.java_essential.Cherednichenko.homework.lesson_4;

import java.util.Scanner;

public class Player implements Recodable, Playable {
    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }

    @Override
    public void pause() {
        System.out.println("Pause ...");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.next().equals("stop")){
            switch (scanner.next()) {
                case "play":
                    player.play();
                    break;
                case "record":
                    player.record();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "stop":
                    player.stop();
                    break;
                default:
                    break;

            }
        }
    }
}
