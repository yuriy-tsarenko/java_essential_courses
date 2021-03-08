package com.java_essential.diledsys.homeWork.myList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList {

    private  Object[] array = new Object[1];
    private int size;

    private void setSize(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object el) {
        setSize(raise());
        array[size] = new Element<E>((E) el);
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int residual = 1;
        for (int i = 0; i < array.length - residual; i++) {
            Element<E> element = (Element<E>) array[i];
            if (element.getEl().equals(o)) {
                ++residual;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }

        setSize(size = raiseminus(residual - 1));
        return false;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public E get(int index) {
        Element<E> element = (Element<E>) array[index];
        return element.getEl();
    }

    private int raise() {
        setSize(array.length);
        if (size > 0) {
            array = Arrays.copyOf(array, size + 1);
        }
        return size - 1;
    }

    private int raiseminus(int count) {
        size = array.length - count;
        if (size > 0) {
            array = Arrays.copyOf(array, size);
        }
        return size - 1;
    }

    public class Element<E> {
        private E el;

        public Element(E array) {
            this.el = array;
        }

        public E getEl() {
            return el;
        }

        public void setEl(E el) {
            this.el = el;
        }
    }
}
