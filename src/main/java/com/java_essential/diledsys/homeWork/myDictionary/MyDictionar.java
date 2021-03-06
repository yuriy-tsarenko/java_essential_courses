package com.java_essential.diledsys.homeWork.myDictionary;

public class MyDictionar<K, V> implements MyList {
    private int size;
    private Element head;
    private Element tail;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(Object key) {

        Element temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                if (temp.value != null) return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        setSize(++size);
        Element a = new Element();
        a.key = key;
        a.value = value;
        if (head == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    @Override
    public void remove(Object key) {
        setSize(--size);
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
        }
        if (head.key == key) {
            head = head.next;
            return;
        }
        Element temp = head;
        while (temp.next != null) {
            if (temp.next.key == key) {
                if (tail == temp.next) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        }
    public void Iterator(){
        Element temp = head;
        while (temp.next!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        return;

    }



    class Element<K, V> {

        Element next;
        K key;
        V value;
    }
}
