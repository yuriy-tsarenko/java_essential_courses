package com.java_essential.Cherednichenko.homework.lesson_9;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung",120,"AB1234567CD ");
        Device device1 = new Device("Samsung1",1201,"AB1234567CD1 ");
        Monitor monitor = new Monitor(1280,1024,"Samsung",120,"AB1234567CD ");
        EthernetAdapter ethernetAdapter= new EthernetAdapter("Samsung",120,"AB1234567CD ",1000,"A1:13:F4:12");
        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println(ethernetAdapter.toString());
        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(monitor.equals(device));///false
        System.out.println(ethernetAdapter.equals(device));//false
        System.out.println(device.equals(monitor));//true
        System.out.println(device.equals(ethernetAdapter));//true
        System.out.println(device1.equals(monitor));//false
        System.out.println(device1.equals(ethernetAdapter));//false
        System.out.println(monitor.equals(device1));///false
        System.out.println(ethernetAdapter.equals(device1));//false
    }
}
