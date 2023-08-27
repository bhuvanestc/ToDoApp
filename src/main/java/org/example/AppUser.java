package org.example;

import java.util.Objects;

public class AppUser {
    public AppUser(String username, AppRole role) {
        this.username = username;
        this.role = role;
    }

    private String username;

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password==null|| password.isEmpty())
        {
            throw new IllegalArgumentException("password cannot be null");
        }
        this.password = password;
    }

    private String password;
    private AppRole role;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username==null|| username.isEmpty())
        {
            throw new IllegalArgumentException("username cannot be null");
        }
        this.username = username;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if(role==null)
        {
            throw new IllegalArgumentException("role cannot be null");
        }

        this.role = role;
    }




}
