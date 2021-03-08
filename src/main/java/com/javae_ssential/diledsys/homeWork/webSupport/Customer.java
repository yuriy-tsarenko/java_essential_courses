package com.javae_ssential.diledsys.homeWork.webSupport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable, UserData {
    //ustomer(id, username, password, Profile(id),  List<Service(id)>,  List<Tiket(id)>)
    private String id;
    private String userName;
    private String passWord;
    private String profileId;
    private final List<String> idService = new ArrayList<>();
    private final List<String> idTicket = new ArrayList<>();

    @Override
    public String toString() {
        return "Customer" +"\n"+
                "id: " + id  +"\n"+
                "userName: " + userName + "\n" +
                "passWord: " + passWord;
                //"ProfileId: " + profileId + "\n";
    }

    @Override
    public String getProfileId() {
        return profileId;
    }

    @Override
    public void setProfileId(String profileId) {
        this.profileId=profileId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
    this.id=id;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName=userName;
    }

    @Override
    public String getPassWord() {
        return passWord;
    }

    @Override
    public void setPassWord(String passWord) {
    this.passWord=passWord;
    }

    @Override
    public List<String> getIdTicket() {
        return idTicket;
    }

    @Override
    public List<String> getIdService() {
        return idService;
    }

    @Override
    public String getServiceName() {
        return null;
    }

    @Override
    public void setServiceName(String serviceName) {

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

}

