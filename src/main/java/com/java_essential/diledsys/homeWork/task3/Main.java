package com.java_essential.diledsys.homeWork.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        Scanner scanner = new Scanner( System.in );
        String mag=scanner.nextLine();
        if (mag.equals( "play" )) player.play();
        if (mag.equals( "pause" )) player.pause();
        if (mag.equals( "stop" )) player.stop();
        if (mag.equals( "record" )) player.record();
    }
}
