package com.example.seekers.wheresmystuff;

import java.util.ArrayList;

/**
 * Created by pritshah on 6/17/17.
 */

public class Admin {
    private String name;
    private String username;
    private String password;
    private String accountType;

    public Admin(String name, String username, String password, String accountType) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
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

    public String getPassword() {
        return password;
    }

}
