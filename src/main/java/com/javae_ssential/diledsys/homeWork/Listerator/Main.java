package com.javae_ssential.diledsys.homeWork.Listerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> prime= new ArrayList();
        prime.add(3);
        prime.add(5);
        prime.add(7);
        prime.add(11);
        prime.add(13);
        prime.add(17);
        Iterator<Integer> iterator = prime.iterator();
        int i=-1;
        while (iterator.hasNext()){
           Integer add= iterator.next()+1;
           prime.set(++i,add);
            System.out.println(prime.get(i));
        }
    }
}
