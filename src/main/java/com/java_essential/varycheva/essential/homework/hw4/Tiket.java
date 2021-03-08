package com.java_essential.varycheva.essential.homework.hw4;

public class Tiket {
    private int id;
    private String serviceName;
    private String problemDescription;
    private boolean isActive;
    private int customer;
    private int supportSpecialist;

    public Tiket() {

    }

    public Tiket(int id, String serviceName, String problemDescription, boolean isActive, int customer, int supportSpecialist) {
        this.id = id;
        this.serviceName = serviceName;
        this.problemDescription = problemDescription;
        this.isActive = isActive;
        this.customer = customer;
        this.supportSpecialist = supportSpecialist;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public void setSupportSpecialist(int supportSpecialist) {
        this.supportSpecialist = supportSpecialist;
    }

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getCustomer() {
        return customer;
    }

    public int getSupportSpecialist() {
        return supportSpecialist;
    }

    @Override
    public String toString() {
        return "Tiket{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", isActive=" + isActive +
                ", customer=" + customer +
                ", supportSpecialist=" + supportSpecialist +
                '}';
    }
}
