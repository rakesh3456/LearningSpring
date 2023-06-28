package com.ibm.spring.app.di.factory;

public class AuthService {
    private String userName = "admin";
    private String password = "admin";

    private AuthService() {
    }
    // Factory Api
    public static AuthService getInstance() {
        return new AuthService();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
