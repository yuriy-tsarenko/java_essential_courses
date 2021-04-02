package com.java_essential.diledsys.homeWork.webSupport;

import java.util.List;

public interface UserData {
    public String getProfileId();

    public void setProfileId(String profileId);

    public String getId();

    public void setId(String id);

    public String getUserName();

    public void setUserName(String userName);

    public String getPassWord();

    public void setPassWord(String passWord);

    public List<String> getIdTicket();

    public List<String> getIdService();

    public String getServiceName();

    public void setServiceName(String serviceName);

    public boolean isActive();

    public void setActive(boolean active);

    public String getServiceMonthPrice();

    public void setServiceMonthPrice(String serviceMonthPrice);

    public String getIdCustomer();

    public void setIdCustomer(String idCustomer);

    public String getProblemDescription();

    public void setProblemDescription(String problemDescription);

    public boolean getIsActive();

    public void setIsActive(boolean isActive);

    public String getCustomerID();

    public void setCustomerID(String customerID);

    public String getSupportSpecialistID();

    public void setSupportSpecialistID(String supportSpecialistID);
}
