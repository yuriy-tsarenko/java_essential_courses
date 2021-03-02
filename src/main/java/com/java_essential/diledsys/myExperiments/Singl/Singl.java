package com.java_essential.diledsys.myExperiments.Singl;

public class Singl {
    private static Singl instance;
    private  int count=0;

    private Singl(){// делаем приватным конструктор,
        // чтобы небыло доступа для создания нового экземпляра класса
        System.out.println("Создан экземпляр класа Singl");
    }
    public  static Singl calc(){

        if (instance==null){// если null то создаем
            instance=new Singl();  //новый экземпляр
        }
        instance.count++;
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
