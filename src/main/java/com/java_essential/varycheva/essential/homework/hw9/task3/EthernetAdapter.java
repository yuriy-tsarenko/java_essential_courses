package com.java_essential.varycheva.essential.homework.hw9.task3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, mac);
    }
}
