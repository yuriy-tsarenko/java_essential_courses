package com.java_essential.diledsys.homeWork.Computer;

public class Computer {
    public static void main(String[] args) {

        Object[] computers = new Object[5];

        int i = 0;
        do {
            computers[i] = new Computer();
        } while (i++ < computers.length - 1);
    }

}
