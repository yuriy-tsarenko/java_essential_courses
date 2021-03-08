package com.java_essential.diledsys.homeWork.myList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        MyList<String> myArrayList = new MyArrayList();
        myArrayList.add("test1");
        myArrayList.add("test2");
        myArrayList.add("test3");
        myArrayList.add("test4");
        myArrayList.add("test5");
        myArrayList.add("test6");
        myArrayList.add("test7");
        myArrayList.add("test8");
        myArrayList.add("test9");
        myArrayList.add("test10");

        myArrayList.remove("test4");
        myArrayList.remove("test8");
        myArrayList.remove("test2");

        for (int i = 0; i < myArrayList.size(); i++) {
            String s = myArrayList.get(i);
            System.out.println(i+" = "+s);
        }
        System.out.println("size= " + myArrayList.size());
    }
}
