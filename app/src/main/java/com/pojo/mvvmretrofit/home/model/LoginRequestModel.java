package com.pojo.mvvmretrofit.home.model;

public class LoginRequestModel {

    String mobileNumber;
    String password;

    public LoginRequestModel() {
    }

    public LoginRequestModel(String mobileNumber, String password) {
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
