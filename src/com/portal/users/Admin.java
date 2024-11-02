package com.portal.users;

public class Admin {

    private static final String name = "EWU_Admin";
    private String password = "123456";

    public static String get_name() {

        return name;

    }

    public String get_password() {

        return password;

    }

    public void change_password(String new_pass) {

        this.password = new_pass;

    }
}
