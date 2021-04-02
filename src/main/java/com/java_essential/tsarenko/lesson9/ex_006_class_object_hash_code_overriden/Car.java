package com.java_essential.tsarenko.lesson9.ex_006_class_object_hash_code_overriden;

public class Car {
    private boolean booleanValue = true;
    private char charValue = 'd';
    private String stringValue = "Opana";
    private long longValue = 1231234422L;
    private float floatValue = 1244124.21F;
    private double doubleValue = 9873234.123;
    private byte[] arrayValue = {1, 2, 3, 4};

    public Car(String stringValue, long longValue, float floatValue) {
        this.stringValue = stringValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
    }

//    @Override
//    public int hashCode() {
//
//    }

//    @Override
//    public boolean equals(Object obj) {
//
//    }
}
