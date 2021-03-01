package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;

    public Customer(int id, String username, String password, int profileID) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profileID = profileID;
        this.listService = new ArrayList<>();
        this.listTiket = new ArrayList<>();
    }

    private String username;
    private String password;
    private int profileID;
    private List<Integer> listService;
    private List<Integer> listTiket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public List<Integer> getlistService() {
        return listService;
    }

    public void setlistService(int Service) {
        this.listService.add(Service);
    }

    public List<Integer> getlistTiket() {
        return listTiket;
    }

    public void setlistTiket(int tiket) {
        this.listTiket.add(tiket);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profileID=" + profileID +
                ", _listService=" + listService +
                ", _listTiket=" + listTiket +
                '}';
    }
}
