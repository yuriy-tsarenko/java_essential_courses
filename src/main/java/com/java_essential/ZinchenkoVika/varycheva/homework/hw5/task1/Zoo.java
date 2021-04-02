package com.java_essential.ZinchenkoVika.varycheva.homework.hw5.task1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<String> list = new ArrayList();

    public Zoo(int size) {
        for (int i = 0; i < size; i++) {
            list.add(i, "animal_" + i);
        }
    }

    public void printZoo() {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public int getSize(){
        return list.size();
    }

    public void deletedAnimal(int index){
        list.remove(index);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo(8);
        zoo.printZoo();
    }
}
