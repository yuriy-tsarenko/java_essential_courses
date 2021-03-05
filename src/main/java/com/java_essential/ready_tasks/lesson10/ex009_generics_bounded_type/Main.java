package com.java_essential.ready_tasks.lesson10.ex009_generics_bounded_type;

/**
 * Ограничения параметров типа
 */
interface Interface1 { /* ... */
}

interface Interface2<U> extends Interface1 { /* ... */
}

class Derived<T> implements Interface1, Interface2<T> { /* ... */
    T field;
}

class Derived2<T> implements Interface2<T> { /* ... */
}

// where T : Interface, Interface<object>  -  Аргумент типа должен являться или реализовывать указанный интерфейс.
// Можно установить несколько ограничений интерфейса. Ограничивающий интерфейс также может быть универсальным.

class MyClass<T extends Interface1> { /* ... */
}

class MyClass2<T extends Interface2<T>> { /* ... */
}

public class Main {
    public static void main(String[] args) {
        //  Аргумент типа подходит, т.к., Interface<object> наследуется от Interface
        MyClass<Interface2<Object>> my1 = new MyClass<>();
//        MyClass2<Derived> my2 = new MyClass2<>();
//        MyClass2<Derived2> my3 = new MyClass2<>();
//        MyClass2<Interface2<Object>> my4 = new MyClass2<>();
        Derived<String> derived = new Derived<>();
        String field = derived.field;
    }
}
