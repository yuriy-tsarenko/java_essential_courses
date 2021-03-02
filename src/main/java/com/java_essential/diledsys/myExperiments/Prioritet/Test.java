package com.java_essential.diledsys.myExperiments.Prioritet;

public class Test {
    private int count;

    {
        //bloc initialisation
        System.out.println("I am initialisation bloc -> "+getCount());

    }
    static {
        System.out.println("I am static bloc " +
                "done first!!!" +
                " And only once on first initialization on first instance");

    }

    public Test() { // construction
        System.out.println("I am constructor -> "+getCount());
    }

    public int getCount() {
        count++;
        return count;
    }
}
