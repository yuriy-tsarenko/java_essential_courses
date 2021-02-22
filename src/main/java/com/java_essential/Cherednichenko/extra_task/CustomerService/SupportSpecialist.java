package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.util.List;

public class SupportSpecialist {
    private int id;
    private String userName;
    private String password;
    private List<Integer> listTiket;
    private int profileID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getlistTiket() {
        return listTiket;
    }

    public void setlistTiket(List<Integer> listTiket) {
        this.listTiket = listTiket;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    @Override
    public String toString() {
        return "SupportSpecialist{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", _listTiket=" + listTiket +
                ", profileID=" + profileID +
                '}';
    }
}
