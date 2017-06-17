package com.example.seekers.wheresmystuff;

import java.util.ArrayList;

/**
 * Created by pritshah on 6/17/17.
 */

public class User {
    private String name;
    private String username;
    private String password;
    private String accountType;
    private static ArrayList<User> userList;

    public User(String name, String username, String password, String accountType) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        userList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getAccountType() {
        return accountType;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

}
