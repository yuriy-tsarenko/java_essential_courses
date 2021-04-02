package com.java_essential.diledsys.homeWork.webSupport;//Tiket(id, serviceName, problemDescription, isActive, Customer(id), SupportSpecialist(id))

import java.io.Serializable;
import java.util.List;

public class Tiket implements Serializable, UserData {

    private String id;
    private String serviceName;
    private String problemDescription;
    private boolean isActive;
    private String customerID;
    private String supportSpecialistID;

    @Override
    public String getProfileId() {
        return null;
    }

    @Override
    public void setProfileId(String profileId) {

    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public String getPassWord() {
        return null;
    }

    @Override
    public void setPassWord(String passWord) {

    }

    @Override
    public List<String> getIdTicket() {
        return null;
    }

    @Override
    public List<String> getIdService() {
        return null;
    }
    @Override
    public String getServiceName() {
        return serviceName;
    }
    @Override
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setActive(boolean active) {

    }

    @Override
    public String getServiceMonthPrice() {
        return null;
    }

    @Override
    public void setServiceMonthPrice(String serviceMonthPrice) {

    }

    @Override
    public String getIdCustomer() {
        return null;
    }

    @Override
    public void setIdCustomer(String idCustomer) {

    }

    @Override
    public String getProblemDescription() {
        return problemDescription;
    }
    @Override
    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }
    @Override
    public boolean getIsActive() {
        return isActive;
    }
    @Override
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    @Override
    public String getCustomerID() {
        return customerID;
    }
    @Override
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    @Override
    public String getSupportSpecialistID() {
        return supportSpecialistID;
    }
    @Override
    public void setSupportSpecialistID(String supportSpecialistID) {
        this.supportSpecialistID = supportSpecialistID;
    }

    @Override
    public String toString() {
        return "Tiket" +"\n"+
                "id: " + id + "\n" +
                " service Name: " + serviceName + "\n" +
                " problem Description: " + problemDescription + "\n" +
                " isActive: " + isActive+"\n"+
                " customerID: " + customerID + "\n" +
                " support SpecialistID: " + supportSpecialistID+ "\n";
    }
}
