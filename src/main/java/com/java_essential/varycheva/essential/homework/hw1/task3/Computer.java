package com.java_essential.varycheva.essential.homework.hw1.task3;

public class Computer {
    private String model;

    Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("Mod" + i);
        }

        for (Computer comp : computers) {
            System.out.println(comp.getModel());
        }
    }
}
