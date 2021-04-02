package com.java_essential.tsarenko.lesson3.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChildOne childOne = new ChildOne();
        ChildTwo childTwo = new ChildTwo();
        List<Parent> parents = new ArrayList<>(List.of(childOne, childTwo));
        for (Parent parent : parents) {
            System.out.println(parent.getName());
        }
    }
}
