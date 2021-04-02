package com.java_essential.tsarenko.lesson10.ex005_generics;

/**
 * Ковариантность обобщений.
 */
abstract class Shape {
}

class Circle extends Shape {
}

interface IContainer<T> {
    T getFigure();

    void setFigure(T figure);
}

class Container<T> implements IContainer<T> {
    private T figure;

    public Container(T figure) {
        this.figure = figure;
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        IContainer<Shape> container = new Container<>(circle);

        System.out.println(container.getFigure().toString());
    }
}
