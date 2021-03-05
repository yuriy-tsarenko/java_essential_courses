package com.java_essential.varycheva.essential.homework.hw4;

import java.util.ArrayList;
import java.util.List;

public class Schema {

    public void initSchema() {
        List<Profile> profiles = new ArrayList<>();
        Profile profile = new Profile();
        profile.setId(1);
        Service service = new Service();
        service.setId(1);
        Tiket tiket = new Tiket();
        tiket.setId(1);
        Customer customer = new Customer(1, "user", "123456", List.of(service.getId()), profile.getId(), List.of(tiket.getId()));
        System.out.println(customer.toString());
    }
}
