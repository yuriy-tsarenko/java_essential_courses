package com.java_essential.ZinchenkoVika.varycheva.homework.hw4;

import java.util.List;

public class Customer {
    private int id;
    private String username;
    private String password;
    private List<Integer> services;
    private int profileId;
    private List<Integer> tikets;

    public Customer(){

    }

    public Customer(int id, String username, String password, List<Integer> services, int profileId, List<Integer> tikets) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.services = services;
        this.profileId = profileId;
        this.tikets = tikets;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServices(List<Integer> services) {
        this.services = services;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public void setTikets(List<Integer> tikets) {
        this.tikets = tikets;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Integer> getServices() {
        return services;
    }

    public int getProfileId() {
        return profileId;
    }

    public List<Integer> getTikets() {
        return tikets;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", services=" + services +
                ", profileId=" + profileId +
                ", tikets=" + tikets +
                '}';
    }
}
