package com.java_essential.diledsys.homeWork.webSupport;

import java.io.Serializable;
import java.util.List;

//Service(id, serviceName, isActive, List<Customer(id)>, serviceMonthPrice)
public class Service implements Serializable, UserData {

    private String id;
    private String serviceName;
    private boolean isActive;
    private String serviceMonthPrice;
    private String idCustomer;

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
        return isActive;
    }
    @Override
    public void setActive(boolean active) {
        isActive = active;
    }
    @Override
    public String getServiceMonthPrice() {
        return serviceMonthPrice;
    }
    @Override
    public void setServiceMonthPrice(String serviceMonthPrice) {
        this.serviceMonthPrice = serviceMonthPrice;
    }
    @Override
    public String getIdCustomer() {
        return idCustomer;
    }
    @Override
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String getProblemDescription() {
        return null;
    }

    @Override
    public void setProblemDescription(String problemDescription) {

    }

    @Override
    public boolean getIsActive() {
        return false;
    }

    @Override
    public void setIsActive(boolean isActive) {

    }

    @Override
    public String getCustomerID() {
        return null;
    }

    @Override
    public void setCustomerID(String customerID) {

    }

    @Override
    public String getSupportSpecialistID() {
        return null;
    }

    @Override
    public void setSupportSpecialistID(String supportSpecialistID) {

    }

    @Override
    public String toString() {
        return "Service" +"\n"+
                "id: " + id + "\n" +
                " service name: " + serviceName + "\n" +
                " isActive: " + isActive +"\n" +
                " service monthPrice " + serviceMonthPrice;// + "\n" +
                //" idCustomer " + idCustomer + "\n";
    }
}
