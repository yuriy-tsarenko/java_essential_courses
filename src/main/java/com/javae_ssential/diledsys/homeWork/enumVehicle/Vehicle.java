package com.javae_ssential.diledsys.homeWork.enumVehicle;

public enum Vehicle {
    RENAULT(2000,"red"),
    KIA(1000,"green");
    int price;
    String color;
    Vehicle(int price,String color) {
        this.price = price;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle " +name()+"\n"+
                "price= " + price+"\n" +
                ", color= " + color +"\n";
    }
}
