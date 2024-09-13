package com.newhope.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {

    @NotNull(message= "Username required")
    @Size(min =3, max = 15, message = "Username must be within 3 to 15 Chacrecters")
    private String username;

    @NotNull
    @Size(min =3, max = 15, message = "Password must be within 3 to 15 Chacrecters")
    private String password;

    // Default constructor
    public LoginModel() {
    }

    // Parameterized constructor
    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method
    @Override
    public String toString() {
        return "LoginModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
