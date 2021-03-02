package com.javae_ssential.diledsys.homeWork.webSupport;//SupportSpecialist(id, username, password, List<Tiket(id)>, Profile)

import java.io.Serializable;
import java.util.List;

public class SupportSpecialist implements Serializable, UserData {

    private String id;
    private String userName;
    private String password;
    private List<Integer> idListTiket;
    private String profileId;

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
        return password;
    }

    @Override
    public void setPassWord(String passWord) {
    this.password=passWord;
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


    @Override
    public String toString() {
        return "\n"+"SupportSpecialist" +"\n"+
                "id: " + id + "\n" +
                " userName: " + userName + "\n" +
                " password:" + password+ "\n";
                //"idListTiket: " + idListTiket +"\n";
                //" profileID: " + profileId +"\n";
    }
}
