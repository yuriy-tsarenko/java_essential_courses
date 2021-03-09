package com.java_essential.varycheva.essential.homework.hw8.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Products {

    List<Price> products = new ArrayList<>();

    public void addProduct(Price price) {
        products.add(price);
    }

    public List<Price> getProducts() {
        return products.stream().sorted().collect(Collectors.toList());
    }

    public void printProducts() {
        getProducts().forEach(element -> {
            System.out.println(element.toString());
        });
    }
}
