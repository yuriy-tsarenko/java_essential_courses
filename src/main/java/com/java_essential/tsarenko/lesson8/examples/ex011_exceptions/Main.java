package com.java_essential.tsarenko.lesson8.examples.ex011_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new Exception("Exception");
                } catch (Exception e) {
                    System.out.println("Catch 1: " + e.getMessage());
                    throw new Exception();
                } finally {
                    System.out.println("Finally 1:");
                }
            } catch (Exception e) {
                System.out.println("Catch 2: " + e.getMessage());
                throw new Exception();
            } finally {
                System.out.println("Finally 2:");
                throw new Exception("New Exception");
            }
        } catch (Exception e) {
            System.out.println("Catch 3: " + e.getMessage());
        } finally {
            System.out.println("Finally 3:");
        }
    }
}
