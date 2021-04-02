package com.java_essential.tsarenko.lesson9.ex_004_class_object_equals_overriden;

import java.util.Objects;

public class Car {
    private int id;
    String string;

    public Car(int id, String string) {
        this.id = id;
        this.string = string;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Car other = (Car) obj;

        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

//        if (!Objects.equals(this.string, other.string)) {
//            return false;
//        }
        return true;
    }
}
