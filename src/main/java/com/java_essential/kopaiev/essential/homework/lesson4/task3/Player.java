package com.java_essential.kopaiev.essential.homework.lesson4.task3;

public class Player implements Playable, Recordable {

    @Override
    public void play() {
    System.out.println("Record is played");
    }

    @Override
    public void record() {
    System.out.println("Record is started");
    }

    @Override
    public void pause() {
    System.out.println("action is paused");
    }

    @Override
    public void stop() {
    System.out.println("Action is stopped");
    }
}
