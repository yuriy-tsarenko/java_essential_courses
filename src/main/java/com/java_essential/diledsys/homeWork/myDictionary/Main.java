package com.java_essential.diledsys.homeWork.myDictionary;

public class Main {

    public static void main(String[] args) {

        MyList<Integer,String> myDictionar = new MyDictionar();

        myDictionar.put(2,"First");
        myDictionar.put(3,"Second");
        myDictionar.put(24,"Third");
        myDictionar.put(12,"Four8");
        myDictionar.put(23,"Five");
        myDictionar.put(4,"Sex");
        myDictionar.remove(23);
        //myDictionar.remove(2);
        System.out.println("key 12 = "+myDictionar.get(12));
        System.out.println("iterator");
        myDictionar.Iterator();
        System.out.println("size= " + myDictionar.size());
    }
}
