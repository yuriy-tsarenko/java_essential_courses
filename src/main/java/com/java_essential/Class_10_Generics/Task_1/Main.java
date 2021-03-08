package com.java_essential.Class_10_Generics.Task_1;

/* Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра аналогично экземпляру класса List.
Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества элементов. */
public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList();
        for (int i = 0; i < 22; i++) {
            myList.add("Element" + (i + 1));
        }

        myList.print();
        System.out.println("Size is - " + myList.size());

        MyList<MyClass> myList2 = new MyList();
        for(int i = 0; i < 22; i++){
            myList2.add(new MyClass("name " + (i+1), i+5));
        }

        myList2.print();
        System.out.println("Size is - " + myList2.size());

    }
}
