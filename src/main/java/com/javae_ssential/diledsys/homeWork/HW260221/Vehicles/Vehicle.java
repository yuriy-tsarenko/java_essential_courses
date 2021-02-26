package com.javae_ssential.diledsys.homeWork.HW260221.Vehicles;

public class Vehicle {
    private Wheel wheel;
   {
        wheel = new Wheel();
   }
    public void print(){

    }

    public static class Wheel extends Vehicle{
        int count=0;
        @Override
        public void print() {
            if (count==0) System.out.println("new copy");
            ++count;
            System.out.println("Iam Wheel->"+count);
        }
    }
    public static class Door extends Vehicle{
        @Override
        public void print() {
            System.out.println("Iam Door");

        }
    }

    public static void main(String[] args) {
        // new copy
        Vehicle wheel = new Wheel();
        wheel.print(); //первый вызов
        wheel.print(); //второй
        //new copy
        Vehicle wheel2 = new Wheel();
        wheel2.print();
        Vehicle door = new Door();
        door.print();
    }
}
