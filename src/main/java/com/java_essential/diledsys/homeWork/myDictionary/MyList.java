package com.java_essential.diledsys.homeWork.myDictionary;

public interface MyList<K,V> {
     int size();
     K get(K key);
     void put(K key, V vol);
     void remove(K key);

     void Iterator();

}
