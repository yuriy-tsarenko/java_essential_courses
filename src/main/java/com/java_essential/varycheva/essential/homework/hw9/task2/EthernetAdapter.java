package com.java_essential.varycheva.essential.homework.hw9.task2;

public class EthernetAdapter {
    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "speed=" + speed +
                ", mac='" + mac;
    }
}
