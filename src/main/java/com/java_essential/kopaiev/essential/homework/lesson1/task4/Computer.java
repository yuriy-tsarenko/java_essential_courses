package com.java_essential.kopaiev.essential.homework.lesson1.task4;

public class Computer {
    private String serialNumber;

    Computer(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return serialNumber;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("ABSDAX123123Sda" + i);
        }

        for (Computer comp : computers) {
            System.out.println(comp.getModel());
        }
    }
}
