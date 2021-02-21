package com.java_essential.Cherednichenko.extra_task.CustomerService;

import java.util.List;

public class Service {
    private int id;
    private String serviceName;
    private String isActive;
    private List<Integer> _listCustomer;
    private String serviceMonthPrice;

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

    public List<Integer> get_listCustomer() {
        return _listCustomer;
    }

    public void set_listCustomer(List<Integer> _listCustomer) {
        this._listCustomer = _listCustomer;
    }

    public String getServiceMonthPrice() {
        return serviceMonthPrice;
    }

    public void setServiceMonthPrice(String serviceMonthPrice) {
        this.serviceMonthPrice = serviceMonthPrice;
    }
}
