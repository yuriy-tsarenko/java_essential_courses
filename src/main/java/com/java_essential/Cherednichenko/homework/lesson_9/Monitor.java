package com.java_essential.Cherednichenko.homework.lesson_9;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + super.getManufacturer() + '\'' +
                ", price=" + super.getPrice() +
                ", serialNumber='" + super.getSerialNumber() + '\'' +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }
}
