package com.spring.entity;

public class User {
    private String username;
    private String password;
    private String status;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getName() {

        return name;
    }

    public String getStatus() {

        return status;
    }

    public String getPassword() {

        return password;
    }

    public String getUsername() {

        return username;
    }
}
