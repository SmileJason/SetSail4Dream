package com.weijie.setsail4dream.bean;

import java.io.Serializable;

/**
 * Created by webdev on 2016/1/28.
 */
public class User implements Serializable {

    private String name;

    private String password;

    @Override
    public String toString() {
        return "name="+name+" password="+password;
    }

    public User(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
