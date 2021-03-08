package com.java_essential.diledsys.homeWork.homeWork_Device;

public class Device {

    String manufactured;
    float price;
    String serialNumber;

    public Device(String manufactured, float price, String serialNumber) {
        this.manufactured = manufactured;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" + "\n"+
                "manufactured= " + manufactured + "\n" +
                "price= " + price +
                "serialNumber= " + serialNumber +  "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufactured != null ? !manufactured.equals(device.manufactured) : device.manufactured != null)
            return false;
        return serialNumber != null ? serialNumber.equals(device.serialNumber) : device.serialNumber == null;
    }

    @Override
    public int hashCode() {
        int result = manufactured != null ? manufactured.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }
}
