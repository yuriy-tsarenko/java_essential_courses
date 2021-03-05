package com.java_essential.Cherednichenko.homework.lesson_5.Task_1and2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<String> zooList = new ArrayList<>();

    public Zoo() {

    }

    public List<String> getZooList() {
        return zooList;
    }

    public void setZooList(int index, String element) {
        this.zooList.add(index, element);
    }

    public void removeZooList(String animal) {
        this.zooList.remove(animal);
    }

    public int getSizeZooList() {
        return zooList.size();
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        for (int i = 0; i <= 7; i++) {
            zoo.setZooList(i, "Animal_" + i);
        }
        for (String animal : zoo.getZooList()) {
            System.out.println(animal);
        }
        System.out.println(zoo.getSizeZooList());
        zoo.removeZooList("Animal_3");
        zoo.removeZooList("Animal_5");
        zoo.removeZooList("Animal_7");
        System.out.println(zoo.getSizeZooList());
    }
}
