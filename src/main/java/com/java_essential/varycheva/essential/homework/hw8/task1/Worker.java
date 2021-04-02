package com.java_essential.varycheva.essential.homework.hw8.task1;

public class Worker implements Comparable<Worker>{
    private String lastName;
    private String initials;
    private String position;
    private int year;

    public Worker(String lastName, String initials, String position, int year) {
        this.lastName = lastName;
        this.initials = initials;
        this.position = position;
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return initials;
    }

    public String getPosition() {
        return position;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastName='" + lastName + '\'' +
                ", initials='" + initials + '\'' +
                ", position='" + position + '\'' +
                ", year=" + year +
                '}';
    }


    @Override
    public int compareTo(Worker o) {
        return this.lastName.compareTo(o.lastName);
    }
}
