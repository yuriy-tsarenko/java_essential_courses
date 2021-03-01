package com.java_essential.varycheva.essential.homework.hw4;

import java.util.List;

public class Service {
    private int id;
    private String serviceName;
    private boolean isActive;
    private List<Integer> customers;
    private int serviceMonthPrice;

    public Service(){

    }

    public Service(int id, String serviceName, boolean isActive, List<Integer> customers, int serviceMonthPrice) {
        this.id = id;
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.customers = customers;
        this.serviceMonthPrice = serviceMonthPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setCustomers(List<Integer> customers) {
        this.customers = customers;
    }

    public void setServiceMonthPrice(int serviceMonthPrice) {
        this.serviceMonthPrice = serviceMonthPrice;
    }

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<Integer> getCustomers() {
        return customers;
    }

    public int getServiceMonthPrice() {
        return serviceMonthPrice;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", isActive=" + isActive +
                ", customers=" + customers +
                ", serviceMonthPrice=" + serviceMonthPrice +
                '}';
    }
}
