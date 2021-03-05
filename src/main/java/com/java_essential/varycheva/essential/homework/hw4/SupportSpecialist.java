package com.java_essential.varycheva.essential.homework.hw4;

import java.util.List;

public class SupportSpecialist {
    private int id;
    private String username;
    private String password;
    private List<Integer> tiket;
    private Profile profile;

    public SupportSpecialist(int id, String username, String password, List<Integer> tiket, Profile profile) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tiket = tiket;
        this.profile = profile;
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

    public void setTiket(List<Integer> tiket) {
        this.tiket = tiket;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "SupportSpecialist{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tiket=" + tiket +
                ", profile=" + profile +
                '}';
    }
}
