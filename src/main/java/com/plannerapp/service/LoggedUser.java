package com.plannerapp.service;

public class LoggedUser {

    private boolean isLogged;

    private String username;

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void login(String username) {
        this.isLogged = true;
        this.username = username;
    }

    public void logout() {
        this.isLogged = false;
        this.username = null;
    }
}
