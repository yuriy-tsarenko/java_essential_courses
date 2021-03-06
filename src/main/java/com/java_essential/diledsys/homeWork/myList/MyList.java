package com.java_essential.diledsys.homeWork.myList;

public interface MyList<E> {
     int size();
     E get(int index);
     boolean add(E el);
     public  boolean  remove(E o);
     void add(int index, E element);

}
