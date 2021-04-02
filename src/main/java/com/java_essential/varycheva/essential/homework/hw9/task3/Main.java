package com.java_essential.varycheva.essential.homework.hw9.task3;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device1.toString());
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 100, 130);
        System.out.println(monitor.toString());

        System.out.println(device1.equals(device2));
        System.out.println(device1.hashCode());
        System.out.println(monitor.hashCode());
    }
}
