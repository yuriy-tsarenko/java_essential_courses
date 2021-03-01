package com.java_essential.Cherednichenko.extra_task.CustomerService;

public class Tiket {
    private int id;
    private String serviceName;
    private String problemDescription;
    private String isActive;
    private int customerID;
    private int supportSpecialistID;

    public Tiket(int id, String serviceName, String problemDescription, String isActive, int customerID, int supportSpecialistID) {
        this.id = id;
        this.serviceName = serviceName;
        this.problemDescription = problemDescription;
        this.isActive = isActive;
        this.customerID = customerID;
        this.supportSpecialistID = supportSpecialistID;
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

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getSupportSpecialistID() {
        return supportSpecialistID;
    }

    public void setSupportSpecialistID(int supportSpecialistID) {
        this.supportSpecialistID = supportSpecialistID;
    }

    @Override
    public String toString() {
        return "Tiket{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", isActive='" + isActive + '\'' +
                ", customerID=" + customerID +
                ", supportSpecialistID=" + supportSpecialistID +
                '}';
    }
}
