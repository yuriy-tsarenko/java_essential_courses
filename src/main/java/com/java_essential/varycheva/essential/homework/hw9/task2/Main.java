package com.java_essential.varycheva.essential.homework.hw9.task2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device.toString());
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 100, 130);
        System.out.println(monitor.toString());
    }
}
