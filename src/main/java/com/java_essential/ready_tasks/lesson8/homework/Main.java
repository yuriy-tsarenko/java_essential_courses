package com.java_essential.ready_tasks.lesson8.homework;

class Container {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        Container data = getData(false);
        if (data !=null){
            System.out.println(data.getName());
        }
    }

    public static Container getData(boolean isGood) {
        if (isGood) {
            Container container = new Container();
            container.setName("John");
            container.setEmail("John@com");
            return container;
        } else if (!isGood) {
            return new Container();
        } else {
            return null;
        }
    }
}
