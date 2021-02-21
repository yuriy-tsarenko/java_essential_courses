package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.util.List;

public class Customer {
    private int id;
    private String username;
    private String password;
    private int profileID;
    private List<Integer> _listService;
    private List<Integer> _listTiket;

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

    public List<Integer> get_listService() {
        return _listService;
    }

    public void set_listService(List<Integer> _listService) {
        this._listService = _listService;
    }

    public List<Integer> get_listTiket() {
        return _listTiket;
    }

    public void set_listTiket(List<Integer> _listTiket) {
        this._listTiket = _listTiket;
    }
}
