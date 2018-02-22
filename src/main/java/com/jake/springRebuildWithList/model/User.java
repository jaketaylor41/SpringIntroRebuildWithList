package com.jake.springRebuildWithList.model;

import java.time.LocalDate;

public class User {
    private String name;
    private String userName;
    private LocalDate dob;

    public User(String name, String userName, LocalDate dob) {
        this.name = name;
        this.userName = userName;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
