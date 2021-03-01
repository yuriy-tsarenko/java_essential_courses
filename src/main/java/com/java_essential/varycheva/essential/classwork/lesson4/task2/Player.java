package com.java_essential.varycheva.essential.classwork.lesson4.task2;

public class Player implements Playable, Recodable{
    @Override
    public void record() {
        System.out.println("Recording in progress");
    }

    @Override
    public void play() {
        System.out.println("Playing in progress");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
