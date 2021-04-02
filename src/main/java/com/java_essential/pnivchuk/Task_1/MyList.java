package com.java_essential.pnivchuk.Task_1;

/* Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра аналогично экземпляру класса List.
Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества элементов. */
public class MyList<T>{
    /*Як зробити цей клас інваріантним????*/

    Object[] list;

    public <T> void add(T element) {
        int size = 0;
        if (this.list == null) {

            this.list = new Object[10];
        } else {
            size = size();
            //extend array
            if (size >= this.list.length - 1) {
                Object[] newList = new Object[(this.list.length * 3) / 2];
                for (int i = 0; i < this.list.length; i++) {
                    newList[i] = list[i];
                }
                this.list = newList;
            }
        }
        this.list[size] = element;
    }

    public Object get(int index) {
        return this.list[index];
    }

    public int size() {
        int count = 0;
        if (this.list[0] == null) {
            return 0;
        } else {
            for (Object tmp : this.list) {
                if (tmp == null) {
                    break;
                } else {
                    count++;
                }
            }
        }
        return count;
    }


    public void print() {
        for (Object tmp : this.list) {
            if (tmp == null) {
                break;
            }
            System.out.println(tmp.toString() + ", ");
        }
        System.out.println("________________________");
    }
}
