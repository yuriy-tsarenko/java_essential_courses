package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private String serviceName;
    private String isActive;
    private List<Integer> listCustomer;
    private String serviceMonthPrice;

    public Service(int id, String serviceName, String isActive,  String serviceMonthPrice) {
        this.id = id;
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.listCustomer = new ArrayList<>();
        this.serviceMonthPrice = serviceMonthPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public List<Integer> getlistCustomer() {
        return listCustomer;
    }

    public void setListCustomer(int customer) {
        this.listCustomer.add(customer);
    }

    public String getServiceMonthPrice() {
        return serviceMonthPrice;
    }

    public void setServiceMonthPrice(String serviceMonthPrice) {
        this.serviceMonthPrice = serviceMonthPrice;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", isActive='" + isActive + '\'' +
                ", _listCustomer=" + listCustomer +
                ", serviceMonthPrice='" + serviceMonthPrice + '\'' +
                '}';
    }
}
